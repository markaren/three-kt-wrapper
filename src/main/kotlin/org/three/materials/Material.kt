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

        opacity: Float? = null,
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

        alphaTest: Float? = null,
        premultipliedAlpha: Boolean? = null,

        overdraw: Float? = null,

        visible: Boolean? = null

) {

    val params : dynamic = js("new Object()")

    init {

        fog.let { params.fog = it }
        lights.let { params.light = it }
        blending.let { params.blending = it }

        if (side != null) {
            params.side = side
        }
        if (flatShading != null) {
            params.flatShading = flatShading
        }
        if (vertexColors != null) {
            params.vertexColors = vertexColors
        }
        if (opacity != null) {
            params.opacity = opacity
        }
        if (transparent != null) {
            params.transparent = transparent
        }

        if (blendSrc != null) {
            params.blendSrc = blendSrc
        }
        if (blendDst != null) {
            params.blendDst = blendDst
        }
        if (blendEquation != null) {
            params.blendEquation = blendEquation
        }
        if (blendSrcAlpha != null) {
            params.blendSrcAlpha = blendSrcAlpha
        }
        if (blendDstAlpha != null) {
            params.blendDstAlpha = blendDstAlpha
        }
        if (blendEquationAlpha != null) {
            params.blendEquationAlpha = blendEquationAlpha
        }


        if (depthFunc != null) {
            params.depthFunc = depthFunc
        }
        if (depthTest != null) {
            params.depthTest = depthTest
        }
        if (depthWrite != null) {
            params.depthWrite = depthWrite
        }

        if (colorWrite != null) {
            params.colorWrite = colorWrite
        }

        if (precision != null) {
            params.precision = precision
        }

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

