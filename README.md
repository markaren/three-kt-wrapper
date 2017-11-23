# three.kt
Kotlin wrappers for Three.js (r88)


# HelloWorld

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin + three.js</title>
    <style>
			body { margin: 0; }
			canvas { width: 100%; height: 100% }
		</style>
</head>
<body>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/three.js/88/three.min.js"></script>
<script type="text/javascript" src="js/OrbitControls.js"></script>

<script type="text/javascript" src="js/kt2js/kotlin.js"></script>
<script type="text/javascript" src="js/kt2js/wrapper.js"></script>

<script type="text/javascript" src="js/kt2js/example.js"></script>

<script type="text/javascript">

    new example.HelloWorld().animate()


</script>


</body>
</html>

```

```kotlin

class HelloWorld {

    val renderer: WebGLRenderer
    val scene: Scene
    val camera: PerspectiveCamera
    val controls: OrbitControls
    val cube: Mesh

    init {

        scene = Scene()
        scene.add(AmbientLight())

        camera = PerspectiveCamera(75, window.innerWidth.toDouble()/ window.innerHeight.toDouble(), 0.1, 1000.0)

        renderer = WebGLRenderer(WebGLRendererParams(
                antialias = true
        )).apply {
            setClearColor(ColorConstants.skyblue, 1.0)
        }

        renderer.setSize(window.innerWidth, window.innerHeight)
        document.body!!.appendChild(renderer.domElement)

        controls = OrbitControls(camera, renderer.domElement)

        cube = Mesh(BoxBufferGeometry(1.0,1.0,1.0),
                MeshPhongMaterial().apply {
                    this.color.set(ColorConstants.darkgreen)
                })
        scene.add(cube)

        val cube2 = Mesh(cube.geometry as BufferGeometry,
                MeshBasicMaterial().apply {
                    this.wireframe = true
                    this.color.set(ColorConstants.black)
                })
        cube.add(cube2)

        camera.position.z = 5.0


        //Create a closed wavey loop
        var curve = CatmullRomCurve3(
                arrayOf(Vector3( -10.0, 0.0, 10.0 ),
                        Vector3( -5.0, 5.0, 5.0 ),
                        Vector3( 0.0, 0.0, 0.0 ),
                        Vector3( 5.0, -5.0, 5.0 ),
                        Vector3( 10.0, 0.0, 10.0 ))
        );

        var points = curve.getPoints( 50 );
        var geometry = BufferGeometry().setFromPoints( points );

        var material = LineBasicMaterial().apply {
            color.set(0xff0000)
        }

        // Create the final object to add to the scene
        var curveObject = Line( geometry, material );
        scene.add(curveObject)

        window.addEventListener("resize", {
            camera.aspect = window.innerWidth.toDouble() / window.innerHeight;
            camera.updateProjectionMatrix();

            renderer.setSize( window.innerWidth, window.innerHeight )
        }, false)

    }

    fun animate() {
        window.requestAnimationFrame {
            cube.rotation.x += 0.01
            cube.rotation.y += 0.01
            animate()
        }
        renderer.render(scene, camera)
    }

}

```


![result](https://raw.githubusercontent.com/markaren/three.kt/master/screenshot.PNG)

# Loaders

```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin + three.js</title>
    <style>
body { margin: 0; }
canvas { width: 100%; height: 100% }
</style>
</head>
<body>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/three.js/88/three.min.js"></script>
<script type="text/javascript" src="js/OrbitControls.js"></script>
<script type="text/javascript" src="js/STLLoader.js"></script>
<script type="text/javascript" src="js/OBJLoader.js"></script>
<script type="text/javascript" src="js/LoaderSupport.js"></script>
<script type="text/javascript" src="js/OBJLoader2.js"></script>


<script type="text/javascript" src="js/kt2js/kotlin.js"></script>
<script type="text/javascript" src="js/kt2js/wrapper.js"></script>

<script type="text/javascript" src="js/kt2js/example.js"></script>


<script type="text/javascript">

    new example.LoaderTest().animate()


</script>

</body>
</html>

```

```kotlin

class LoaderTest {

    val renderer: WebGLRenderer
    val scene: Scene
    val camera: PerspectiveCamera
    val controls: OrbitControls
    var models: MutableList<Mesh> = ArrayList()

    init {

        scene = Scene()

        val light = DirectionalLight(0xffffff, 0.5)
        light.position.set(0.toDouble(), 0.toDouble(), -1.toDouble())
        scene.add(light)

        camera = PerspectiveCamera(75, window.innerWidth.toDouble()/ window.innerHeight.toDouble(), 0.1, 1000.0)
        camera.position.set(0.0, 5.0, -5.0)


        renderer = WebGLRenderer(WebGLRendererParams(
                antialias = true
        )).apply {
            setClearColor(ColorConstants.skyblue, 1.0)
        }

        renderer.setSize(window.innerWidth, window.innerHeight)
        document.body!!.appendChild(renderer.domElement)

        controls = OrbitControls(camera, renderer.domElement)



        STLLoader().apply {
            load("models/suzanne.stl", {
                Mesh(it, MeshPhongMaterial().apply {
                    color.set(0xff5533)
                    specular.set(0x111111)
                    shininess = 200.0
                }).let {
                    models.add(it)
                    scene.add(it)
                }

            })
        }

        OBJLoader().apply {
            load("models/suzanne.obj", {

                it.position.setX(-5.toDouble())
                models.add(it)
                scene.add(it)

            })
        }

        OBJLoader2().apply {
            load("models/suzanne.obj", {

                it.detail.loaderRootNode.let {

                    it.position.setX(5.toDouble())

                    it.traverse {
                        if (it is Mesh) {
                            it.material.asDynamic().color.set(0x00ff00)
                        }
                    }

                    models.add(it)
                    scene.add(it)

                }

            })
        }

        window.addEventListener("resize", {
            camera.aspect = window.innerWidth.toDouble() / window.innerHeight;
            camera.updateProjectionMatrix();

            renderer.setSize( window.innerWidth, window.innerHeight )
        }, false)

    }

    fun animate() {
        window.requestAnimationFrame {

            models.forEach {
                it.rotation.apply {
                    y += 0.01
                }
            }
            animate()
        }
        renderer.render(scene, camera)
    }

}
```


![result](https://raw.githubusercontent.com/markaren/three.kt/master/screenshot2.PNG)