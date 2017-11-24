package info.laht.threekt.renderers

import org.w3c.dom.Node

data class WebGL2RendererParams(
         val canvas: Node? = undefined,
         val alpha: Boolean? = undefined,
         val depth: Boolean? = undefined,
         val stencil: Boolean? = undefined,
         val antialias: Boolean? = undefined,
         val premultipliedAlpha: Boolean? = undefined,
         val preserveDrawingBuffer: Boolean? = undefined
)