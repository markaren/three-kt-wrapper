package org.three.materials.phong

import org.three.materials.MaterialParams

class MeshPhongMaterialParams(

        fog: Boolean? = null,
        lights: Boolean? = null,

        blending: Int? = null,
        side: Int? = null,
        flatShading: Boolean? = null,
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

        visible: Boolean? = null,

        //

        color: Int? = null,
        specular: Int? = null,
        shininess: Double? = null,

    //    wireframe: Boolean? = null,
        wireframeLinewidth: Double? = null,
        wireframeLinecap: String? = null,
        wireframeLinejoin: String? = null,

        skinning: Boolean? = null,
        morphTargets: Boolean? = null,
        morphNormals: Boolean? = null

) : MaterialParams(
        fog, lights, blending, side, flatShading, vertexColors, opacity, transparent,
        blendSrc, blendDst, blendEquation, blendSrcAlpha, blendDstAlpha, blendEquationAlpha,
        depthFunc, depthTest, depthWrite, colorWrite, precision, polygonOffset, polygonOffsetFactor, polygonOffsetUnits,
        dithering, alphaTest, premultipliedAlpha, overdraw, visible) {

    init {

        if (color != null) {
            params.color = color
        }
        if (specular != null) {
            params.specular = specular
        }
        if (shininess != null) {
            params.shininess = shininess
        }
//        if (wireframe != null) {
//            params.wireframe = wireframe
//        }
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
        if (morphNormals != null) {
            params.morphNormals = morphNormals
        }

    }

}

class MeshPongMaterial : MeshPhongMaterialProxy {

    constructor() : super()
    constructor(params : MeshPhongMaterialParams) : super(params.params
    )
}