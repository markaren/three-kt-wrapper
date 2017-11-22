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

    <script src="..../three.min.js"></script>
    <script src="..../OrbitControls.js"></script>

    <script type="text/javascript" src="..../kotlin.js"></script>
    <script type="text/javascript" src="..../threekt.js"></script>

</body>
</html>

```

```kotlin

import org.three.cameras.PerspectiveCamera
import org.three.external.controls.OrbitControls
import org.three.geometries.BoxBufferGeometry
import org.three.lights.AmbientLight
import org.three.materials.MeshBasicMaterial
import org.three.materials.MeshPhongMaterial
import org.three.math.ColorConstants
import org.three.scenes.Scene
import org.three.objects.Mesh
import org.three.renderers.WebGLRenderer
import org.three.renderers.WebGLRendererParams
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {

    HelloWorld().animate()

}

class HelloWorld {

    val renderer: WebGLRenderer
    val scene: Scene
    val camera: PerspectiveCamera
    val controls: OrbitControls
    val cube: Mesh

    init {

        scene = Scene()
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

        val cube2 = cube.clone()
        cube2.material = MeshBasicMaterial().apply {
            this.wireframe = true
            this.color.set(ColorConstants.black)
        }
        cube.add(cube2)

        val light = AmbientLight()
        scene.add(light)

        camera.position.z = 5.0

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

![alt text](https://raw.githubusercontent.com/markaren/three.kt/master/src/test/screenshot.PNG)