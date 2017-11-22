# three.kt
Kotlin wrappers for Three.js (r88)


# HelloWorld

```kotlin

class HelloWorld {

    val renderer: WebGLRenderer
    val scene: Scene
    val camera: PerspectiveCamera
    val cube: Mesh


    init {

        scene = Scene()
        camera = PerspectiveCamera(75, window.innerWidth.toDouble()/ window.innerHeight.toDouble(), 0.1, 1000.0)

        renderer = WebGLRenderer()
        renderer.setSize(window.innerWidth, window.innerHeight)
        document.body!!.appendChild(renderer.domElement)

        cube = Mesh(BoxBufferGeometry(1.0,1.0,1.0), MeshBasicMaterial(
                MeshBasicMaterialParams(
                        transparent = false,
                        opacity = 0.5f,
                        wireframe = true,
                        color = ColorConstants.burlywood
                )))
        scene.add(cube)
        
        camera.position.z = 5.0
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