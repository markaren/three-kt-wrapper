package info.laht.threekt.renderers


class WebGLRenderTarget : WebGLRenderTargetProxy {

    constructor(width: Int, height: Int) : super(width, height)
    constructor(width: Int, height: Int, options: WebGLRenderTargetOptions) : super(width, height, options.options)

}

class WebGLRenderTargetOptions(
        wrapS: Int? = null,
        wrapT: Int? = null
) {

    var options: dynamic = js("new Object()")

    init{

        options.wrapS = wrapS ?: undefined
        options.wrapT = wrapS ?: undefined

    }

}
