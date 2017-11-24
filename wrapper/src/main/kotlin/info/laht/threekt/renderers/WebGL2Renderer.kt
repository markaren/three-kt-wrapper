@file:JsQualifier("THREE")

package info.laht.threekt.renderers

import info.laht.threekt.cameras.Camera
import info.laht.threekt.scenes.Scene

open external class WebGL2Renderer {

    constructor(params: WebGL2RendererParams = definedExternally)

    fun clear(color: Boolean = definedExternally, depth: Boolean = definedExternally, stencil: Boolean = definedExternally)

    fun setPixelRatio(value: Number)

    fun setSize(width: Int, height: Int, updateStyle: Boolean = definedExternally)

    fun setViewPort(x: Int, y: Int, width: Int, height: Int)

    fun render(scene: Scene, camera: Camera)

    fun onContextLost(event: dynamic)

}