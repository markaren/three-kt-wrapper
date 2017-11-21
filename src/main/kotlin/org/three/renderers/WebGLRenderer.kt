package org.three.renderers

import org.w3c.dom.Node

class WebGLRendererParams (

        canvas: Node? = null,
        alpha: Boolean? = null,
        depth: Boolean? = null,
        stencil: Boolean? = null,
        antialias: Boolean? = null,
        premultipliedAlpha: Boolean? = null,
        preserveDrawingBuffer: Boolean? = null

) {

    val params: dynamic = {}

    init {

        params.canvas = canvas ?: undefined
        params.alpha = alpha ?: undefined
        params.depth = depth ?: undefined
        params.stencil = stencil ?: undefined
        params.antialias = antialias ?: undefined
        params.premultipliedAlpha  = premultipliedAlpha ?: undefined
        params.preserveDrawingBuffer  = preserveDrawingBuffer ?: undefined

    }


}

class WebGLRenderer : WebGLRendererProxy {

    constructor() : super()
    constructor(params: WebGLRendererParams) : super(params.params)

}