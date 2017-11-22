package org.three.materials

class MeshBasicMaterial : MeshBasicMaterialProxy {

    constructor() : super()
    constructor(params: MeshBasicMaterialParams) : super(params.params)

}

class MeshBasicMaterialParams(

        fog: Boolean? = null,
        lights: Boolean? = null,

        blending: Int? = null,
        side: Int? = null,
        flatShading: Boolean? = null,
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

        visible: Boolean? = null,

        //

        color: Int? = null,

        reflectivity: Double? = null,
        refractionRatio: Double? = null,

        val wireframe: Boolean? = null,
        wireframeLinewidth: Double? = null,
        wireframeLinecap: String? = null,
        wireframeLinejoin: String? = null,

        skinning: Boolean? = null,
        morphTargets: Boolean? = null


) : MaterialParams(
        fog, lights, blending, side, flatShading, vertexColors, opacity, transparent,
        blendSrc, blendDst, blendEquation, blendSrcAlpha, blendDstAlpha, blendEquationAlpha,
        depthFunc, depthTest, depthWrite, colorWrite, precision, polygonOffset, polygonOffsetFactor, polygonOffsetUnits,
        dithering, alphaTest, premultipliedAlpha, overdraw, visible) {

    init {

        if (color != null) {
            params.color = color
        }

        if (reflectivity != null) {
            params.reflectivity = reflectivity
        }
        if (refractionRatio != null) {
            params.refractionRatio = refractionRatio
        }
        if (wireframe != null) {
            params.wireframe = wireframe
        }
        if (wireframeLinewidth != null) {
            params.wireframeLinewidth = wireframeLinewidth
        }
        if (wireframeLinecap != null) {
            params.wireframeLinecap = wireframeLinecap
        }
        if (wireframeLinejoin != null) {
            params.wireframeLinejoin = wireframeLinejoin
        }
        if (skinning != null) {
            params.skinning = skinning
        }
        if (morphTargets != null) {
            params.morphTargets = morphTargets
        }

    }

}