package org.three.renderers

class WebGLRendererParameters {

    var asDynamic: dynamic = {}

    var alpha: Boolean? = null
        set(value) {
            asDynamic.alpha = value
        }

    var depth: Boolean? = null
        set(value) {
            asDynamic.depth = value
        }

    var stencil: Boolean? = null
        set(value) {
            asDynamic.stencil = value
        }

    var antialias: Boolean? = null
        set(value) {
            asDynamic.antialias = value
        }

    var premultipliedAlpha : Boolean? = null
        set(value) {
            asDynamic.premultipliedAlpha = value
        }

    var preserveDrawingBuffer  : Boolean? = null
        set(value) {
            asDynamic.preserveDrawingBuffer  = value
        }



}