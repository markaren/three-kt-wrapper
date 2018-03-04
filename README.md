# three.kt
Kotlin wrappers for Three.js ([r88](https://github.com/mrdoob/three.js/tree/r88))

Allows you to write [Three.js](https://threejs.org/) apps using [Kotlin](https://kotlinlang.org/)

[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/markaren/three.kt/issues)

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/info.laht.threekt/wrapper/badge.svg)](https://mvnrepository.com/artifact/info.laht.threekt/wrapper)


## HelloWorld

![result](https://raw.githubusercontent.com/markaren/three.kt/master/screenshot.PNG)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin + three.js</title>
    <style>
        body {
            margin: 0;
            overflow: hidden;
        }
    </style>
</head>
    <body>

    <div id="container"></div>

        <script type="text/javascript" src="js/libs/stats.min.js"></script>
        <script type="text/javascript" src="js/libs/dat.gui.min.js"></script>

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

    private val renderer: WebGLRenderer
    private val scene: Scene = Scene()
    private val camera: PerspectiveCamera
    private val controls: OrbitControls
    private val cube: Mesh
    private val stats: Stats = Stats()

    init {

        scene.add(AmbientLight())

        camera = PerspectiveCamera(75, window.innerWidth.toDouble() / window.innerHeight, 0.1, 1000)
        camera.position.setZ(5)

        renderer = WebGLRenderer(WebGLRendererParams(
                antialias = true
        )).apply {
            setClearColor(ColorConstants.skyblue, 1)
            setSize(window.innerWidth, window.innerHeight)
        }

        document.getElementById("container")?.apply {
            appendChild(renderer.domElement)
            appendChild(stats.dom)
        }

        controls = OrbitControls(camera, renderer.domElement)

        cube = Mesh(BoxBufferGeometry(1, 1, 1),
                MeshPhongMaterial().apply {
                    this.color.set(ColorConstants.darkgreen)
                }).also ( scene::add )

        Mesh(cube.geometry as BufferGeometry,
                MeshBasicMaterial().apply {
                    this.wireframe = true
                    this.color.set(ColorConstants.black)
                }).also ( cube::add )

        val points = CatmullRomCurve3(
                arrayOf(Vector3(-10, 0, 10),
                        Vector3(-5, 5, 5),
                        Vector3(0, 0, 0),
                        Vector3(5, -5, 5),
                        Vector3(10, 0, 10))
        ).getPoints(50)

        val geometry = BufferGeometry().setFromPoints(points)

        val material = LineBasicMaterial().apply {
            color.set(0xff0000)
        }

        // Create the final object to add to the scene
        Line(geometry, material).apply ( scene::add )

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
        stats.update()
    }

}
```


## Loaders

![result](https://raw.githubusercontent.com/markaren/three.kt/master/screenshot2.PNG)


```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kotlin + three.js</title>
    <style>
        body {
            margin: 0;
            overflow: hidden;
        }
    </style>
</head>
    <body>

        <div id="container"></div>

        <script type="text/javascript" src="js/libs/stats.min.js"></script>
        <script type="text/javascript" src="js/libs/dat.gui.min.js"></script>

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

    val stats: Stats = Stats()
    val renderer: WebGLRenderer
    val scene: Scene = Scene()
    val camera: PerspectiveCamera
    val controls: OrbitControls
    val models: MutableList<Mesh> = ArrayList()
    var speed: Double = 1.0
    val clock: Clock = Clock(autoStart = true)

    init {

        val light = DirectionalLight(color = 0xffffff, intensity =  0.5)
        light.position.set(0, 0, -1)
        scene.add(light)

        camera = PerspectiveCamera(75, window.innerWidth.toDouble() / window.innerHeight, 0.1, 1000)
        camera.position.set(0, 5, -5)

        renderer = WebGLRenderer(WebGLRendererParams(
                antialias = true
        )).apply {
            setClearColor(ColorConstants.skyblue, alpha = 1)
            setSize(window.innerWidth, window.innerHeight)
        }

        dat.GUI(GUIParams(
                closed = false
        )).also {
            (it.add(this, "speed") as NumberController).apply {
                min(0).max(10).step(0.1)
            }
        }

        document.getElementById("container")?.apply {
            appendChild(renderer.domElement)
            appendChild(stats.dom)
        }

        controls = OrbitControls(camera, renderer.domElement)

        STLLoader().apply {
            load("models/suzanne.stl", {
                Mesh(it, MeshPhongMaterial().apply {
                    color.set(0xff5533)
                    specular.set(0x111111)
                    shininess = 200.0
                }).also {
                    models.add(it)
                    scene.add(it)
                }
            })
        }

        OBJLoader().apply {
            load("models/suzanne.obj", {

                it.position.setX(-5)
                models.add(it)
                scene.add(it)

            })
        }

        OBJLoader2().apply {
            load("models/suzanne.obj", {

                it.detail.loaderRootNode.let {

                    it.position.setX(5)
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

            val dt = clock.getDelta()
            models.forEach {
                it.rotation.apply {
                    y += speed * dt
                }
            }
            animate()
        }
        renderer.render(scene, camera)
        stats.update()
    }

}
```

# How to get it

## maven
```xml
<dependency>
  <groupId>info.laht.threekt</groupId>
  <artifactId>wrapper</artifactId>
  <version>0.88-ALPHA-5</version>
</dependency>
```

## Gradle
```groovy
compile "info.laht.threekt:wrapper:0.88-ALPHA-5"
```

### Snapshots
For accessing bleeding edge snapshot releases use: 
https://oss.sonatype.org/content/repositories/snapshots/info/laht/threekt/ 