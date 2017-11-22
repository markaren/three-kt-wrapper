import org.three.cameras.PerspectiveCamera
import org.three.geometries.BoxBufferGeometry
import org.three.materials.basic.MeshBasicMaterial
import org.three.materials.basic.MeshBasicMaterialParams
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

        cube = Mesh(BoxBufferGeometry(1.0,1.0,1.0), MeshBasicMaterial(
                MeshBasicMaterialParams(
                        transparent = false,
                        opacity = 0.5,
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