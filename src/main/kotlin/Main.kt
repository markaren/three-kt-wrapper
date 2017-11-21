import org.three.cameras.PerspectiveCamera
import org.three.core.Object3D
import org.three.geometries.BoxBufferGeometry
import org.three.scenes.Scene
import org.three.materials.MeshBasicMaterial
import org.three.math.Color
import org.three.math.Vector3
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

        val geometry = BoxBufferGeometry(1.0,1.0,1.0)
        val material = MeshBasicMaterial()
        material.color = Color(0,0,1)
        material.transparent = true
        material.opacity = 0.5

        cube = Mesh(geometry, material)
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