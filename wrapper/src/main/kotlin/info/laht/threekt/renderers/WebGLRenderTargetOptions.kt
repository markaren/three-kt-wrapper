package info.laht.threekt.renderers

data class WebGLRenderTargetOptions(
        override val wrapS: Int? = undefined,
        override val wrapT: Int? = undefined,
        override val magFilter: Int? = undefined,
        override val minFilter: Int? = undefined,
        override val format: Int? = undefined,
        override val type: Int? = undefined,
        override val anisotropy: Int? = undefined,
        override val encoding: Int? = undefined,
        override val depthBuffer: Boolean? = undefined,
        override val stencilBuffer: Boolean? = undefined
) : IWebGLRenderTargetOptions
