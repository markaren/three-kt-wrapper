package info.laht.threekt.renderers

import org.w3c.dom.Node

data class WebGLRendererParams(
        override val canvas: Node? = undefined,
        override val alpha: Boolean? = undefined,
        override val depth: Boolean? = undefined,
        override val stencil: Boolean? = undefined,
        override val antialias: Boolean? = undefined,
        override val premultipliedAlpha: Boolean? = undefined,
        override val preserveDrawingBuffer: Boolean? = undefined
) : IWebGLRendererParams
