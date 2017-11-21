import org.three.cameras.PerspectiveCamera
import org.three.geometries.BoxBufferGeometry
import org.three.geometries.SphereBufferGeometry
import org.three.lights.AmbientLight
import org.three.materials.*
import org.three.scenes.Scene
import org.three.math.ColorConstants
import org.three.objects.Mesh
import org.three.renderers.WebGLRenderer
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {

    HelloWorld().animate()

}

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

        cube = Mesh(BoxBufferGeometry(1f,1f,1f), MeshBasicMaterial(
                MeshBasicMaterialParams(
                        transparent = false,
                        opacity = 0.5f,
                        wireframe = true,
                        color = ColorConstants.burlywood
                )))
        scene.add(cube)

        val sphere = Mesh(SphereBufferGeometry(1f, 32, 32), MeshPongMaterial(
                MeshPhongMaterialParams(
                        color = ColorConstants.aliceblue
                )))

        sphere.position.set(0f,2f,-5f)
        scene.add(sphere)

        val light = AmbientLight(ColorConstants.aliceblue)
        scene.add(light)

        camera.position.z = 5f
    }

    fun animate() {
        window.requestAnimationFrame {
            cube.rotation.x += 0.01f
            cube.rotation.y += 0.01f
            animate()
        }
        renderer.render(scene, camera)
    }

}