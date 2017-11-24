@file:JsQualifier("THREE")

package info.laht.threekt.renderers

import info.laht.threekt.math.Vector4
import info.laht.threekt.textures.Texture


external interface IWebGLRenderTargetOptions {
    val wrapS: Int?
    val wrapT: Int?
    val magFilter: Int?
    val minFilter: Int?
    val format: Int?
    val type: Int?
    val anisotropy: Int?
    val encoding: Int?
    val depthBuffer: Boolean?
    val stencilBuffer: Boolean?
}

open external class WebGLRenderTarget {

    constructor(width: Int, height: Int, options: IWebGLRenderTargetOptions = definedExternally)

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

    fun clone(): WebGLRenderTarget
    fun copy(source: WebGLRenderTarget) : WebGLRenderTarget

    fun dispose()


}