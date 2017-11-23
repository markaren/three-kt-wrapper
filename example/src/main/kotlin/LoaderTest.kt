import info.laht.threekt.cameras.PerspectiveCamera
import info.laht.threekt.external.controls.OrbitControls
import info.laht.threekt.external.loaders.OBJLoader
import info.laht.threekt.external.loaders.OBJLoader2
import info.laht.threekt.external.loaders.STLLoader
import info.laht.threekt.lights.DirectionalLight
import info.laht.threekt.materials.MeshPhongMaterial
import info.laht.threekt.math.ColorConstants
import info.laht.threekt.scenes.Scene
import info.laht.threekt.objects.Mesh
import info.laht.threekt.renderers.WebGLRenderer
import info.laht.threekt.renderers.WebGLRendererParams
import kotlin.browser.document
import kotlin.browser.window


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

        camera = PerspectiveCamera(75, window.innerWidth.toDouble() / window.innerHeight.toDouble(), 0.1, 1000.0)
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