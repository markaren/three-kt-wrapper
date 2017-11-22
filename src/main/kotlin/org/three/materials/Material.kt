package org.three.materials

open class Material : MaterialProxy {

    constructor() : super()
    constructor(params : MaterialParams) : super(params.params)
}

abstract class MaterialParams(

        fog: Boolean? = null,
        lights: Boolean? = null,

        blending: Int? = null,
        side: Int? = null,
        flatShading: Boolean? = null,
        /**
         *THREE.NoColors, THREE.VertexColors, THREE.FaceColors
         */
        vertexColors: Int? = null,

        opacity: Double? = null,
        transparent: Boolean? = null,

        blendSrc: Int? = null,
        blendDst: Int? = null,
        blendEquation: Int? = null,
        blendSrcAlpha: Int? = null,
        blendDstAlpha: Int? = null,
        blendEquationAlpha: Int? = null,

        depthFunc: Int? = null,
        depthTest: Boolean? = null,
        depthWrite: Boolean? = null,

        colorWrite: Boolean? = null,

        precision: String? = null,

        polygonOffset: Boolean? = null,
        polygonOffsetFactor: Number? = null,
        polygonOffsetUnits: Number? = null,

        dithering: Boolean? = null,

        alphaTest: Double? = null,
        premultipliedAlpha: Boolean? = null,

        overdraw: Double? = null,

        visible: Boolean? = null

) {

    val params : dynamic = js("new Object()")

    init {

        fog?.let { params.fog = it }
        lights?.let { params.light = it }
        blending?.let { params.blending = it }
        side?.let { params.side = it }
        flatShading?.let{ params.flatShading = it}
        vertexColors?.let { params.vertexColors = it }
        opacity?.let { params.opacity = it }

        transparent?.let { params.transparent = it }
        blendSrc?.let { params.blendSrc = it }
        blendDst?.let { params.blendDst = it }
        blendEquation?.let { params.blendEquation = it }
        blendSrcAlpha?.let { params.blendSrcAlpha = it }
        blendDstAlpha?.let { params.blendDstAlpha = it }
        blendEquationAlpha?.let { params.blendEquationAlpha = it }
        depthFunc?.let { params.depthFunc = it }
        depthTest?.let { params.depthTest = it }
        depthWrite?.let { params.depthWrite = it }
        colorWrite?.let { params.colorWrite = it }
        precision?.let { params.precision = it }


        if (polygonOffset != null) {
            params.polygonOffset = polygonOffset
        }

        if (polygonOffsetFactor != null) {
            params.polygonOffsetFactor = polygonOffsetFactor
        }

        if (polygonOffsetUnits != null) {
            params.polygonOffsetUnits = polygonOffsetUnits
        }

        if (dithering != null) {
            params.dithering = dithering
        }

        if (alphaTest != null) {
            params.alphaTest = alphaTest
        }

        if (premultipliedAlpha != null) {
            params.premultipliedAlpha = premultipliedAlpha
        }

        if (overdraw != null) {
            params.overdraw = overdraw
        }

        if (visible != null) {
            params.visible = visible
        }

    }

}

