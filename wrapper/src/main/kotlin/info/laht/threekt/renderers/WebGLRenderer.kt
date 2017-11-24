@file:JsQualifier("THREE")

package info.laht.threekt.renderers

import info.laht.threekt.cameras.Camera
import info.laht.threekt.scenes.Scene
import org.w3c.dom.Node


external interface IWebGLRendererParams {
    val canvas: Node?
    val alpha: Boolean?
    val depth: Boolean?
    val stencil: Boolean?
    val antialias: Boolean?
    val premultipliedAlpha: Boolean?
    val preserveDrawingBuffer: Boolean?
}

@JsName("WebGLRenderer")
open external class WebGLRenderer {

    constructor(params: IWebGLRendererParams = definedExternally)

    var domElement: Node

    var autoClear: Boolean
    var autoClearColor: Boolean
    var autoClearDepth: Boolean
    var autoClearStencil: Boolean

    var sortObjects: Boolean

    var gammaFactor: Double
    var gammaInput: Boolean
    var gammaOutput: Boolean

    var physicallyCorrectLights: Boolean


    var toneMapping: Int
    var toneMappingExposure: Double;
    var toneMappingWhitePoint: Double

    var maxMorphTargets: Int
    var maxMorphNormals: Int

    interface Size {
        val x: Int
        val y: Int
    }

    fun getSize() : Size
    fun setSize(width: Int, height: Int, updateStyle: Boolean = definedExternally)

    /**
     * Sets the clear alpha. Valid input is a float between 0.0 and 1.0.
     */
    fun setClearAlpha(alpha: Number)

    /**
     * Sets the clear color and opacity.
     */
    fun setClearColor(color: Int, alpha: Number)

    /**
     * Render a scene using a camera.
     * The render is done to the renderTarget (if specified) or to the canvas as usual.
     * If forceClear is true, the depth, stencil and color buffers will be cleared before rendering even if the renderer's autoClear property is false.
     * Even with forceClear set to true you can prevent certain buffers being cleared by setting either the autoClearColor, autoClearStencil or autoClearDepth properties to false.
     */
    fun render(scene: Scene, camera: Camera, renderTarget: dynamic = definedExternally, forceClear: Boolean = definedExternally)

    fun setPixelRatio(value: Int)

}