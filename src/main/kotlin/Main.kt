import org.three.cameras.PerspectiveCamera
import org.three.core.BufferGeometry
import org.three.external.controls.OrbitControls
import org.three.geometries.BoxBufferGeometry
import org.three.lights.AmbientLight
import org.three.materials.MeshBasicMaterial
import org.three.materials.MeshPhongMaterial
import org.three.math.ColorConstants
import org.three.math.Vector3
import org.three.math.plus
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