package info.laht.threekt.renderers

data class WebGLRenderTargetOptions(
         val wrapS: Int? = undefined,
         val wrapT: Int? = undefined,
         val magFilter: Int? = undefined,
         val minFilter: Int? = undefined,
         val format: Int? = undefined,
         val type: Int? = undefined,
         val anisotropy: Int? = undefined,
         val encoding: Int? = undefined,
         val depthBuffer: Boolean? = undefined,
         val stencilBuffer: Boolean? = undefined
)
