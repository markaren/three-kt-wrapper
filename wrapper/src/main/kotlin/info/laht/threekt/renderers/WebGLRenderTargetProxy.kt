@file:JsQualifier("THREE")

package info.laht.threekt.renderers

import info.laht.threekt.math.Vector4
import info.laht.threekt.textures.Texture

@JsName("WebGLRenderTarget")
open external class WebGLRenderTargetProxy {

    protected constructor(width: Int, height: Int, options: dynamic = definedExternally)

    var uuid: String

    var widht: Int
    var height: Int

    var scissor: Vector4
    var scissorTest: Boolean

    var viewPort: Vector4

    var texture: Texture

    var depthBuffer: Boolean
    var stencilBuffer: Boolean

    fun setSize(width: Int, height: Int)

    fun clone(): WebGLRenderTargetProxy
    fun copy(source: WebGLRenderTargetProxy) : WebGLRenderTargetProxy

    fun dispose()


}