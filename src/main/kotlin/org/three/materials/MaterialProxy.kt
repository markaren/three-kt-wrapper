@file:JsQualifier("THREE")

package org.three.materials

@JsName("Material")
open external class MaterialProxy {

    protected constructor()
    protected constructor(params: dynamic)

    /**
     * Unique number for this material instance.
     */
    val id: Int

    var uuid : String
    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    var name : String
    var type: String

    /**
     * Whether the material is affected by fog. Default is true.
     */
    var fog: Boolean
    var lights: Boolean

    var blending: Int
    var side: Int
    var flatShading: Boolean
    var vertexColors: Int

    /**
     * Float in the range of 0.0 - 1.0 indicating how transparent the material is. A value of 0.0 indicates fully transparent, 1.0 is fully opaque.
    If the material's # .transparent property is not set to true, the material will remain fully opaque and this value will only affect its color.
    Default is 1.0.
     */
    var opacity: Float
    var transparent: Boolean

    var blendSrc: Int
    /**
     * Blending destination. Default is OneMinusSrcAlphaFactor. See the destination factors constants for all possible values.
    The material's # .blending must be set to CustomBlending for this to have any effect.
     */
    var blendDst: Int
    /**
     * Blending equation to use when applying blending. Default is AddEquation. See the blending equation constants for all possible values.
    The material's # .blending must be set to CustomBlending for this to have any effect.
     */
    var blendEquation: Int
    var blendSrcAlpha: Int
    /**
     * The tranparency of the .blendDst. Default is null.
     */
    var blendDstAlpha: Int?
    var blendEquationAlpha: Int


    var depthFunc: Int
    var depthTest: Boolean
    var depthWrite: Boolean

    var colorWrite: Boolean

    var precision: String?

    /**
     * Sets the polygon offset factor. Default is 0.
     */
    var polygonOffset: Boolean
    var polygonOffsetFactor: Number
    /**
     * Sets the polygon offset units. Default is 0.
     */
    var polygonOffsetUnits: Number

    var dithering: Boolean

    /**
     * Sets the alpha value to be used when running an alpha test.
     * The material will not be renderered if the opacity is lower than this value. Default is 0.
     */
    var alphaTest: Float
    var premultipliedAlpha: Boolean

    var overdraw: Float

    var visible: Boolean

    var userData: Map<String, Any>

    /**
     * Specifies that the material needs to be updated at the WebGL level. Set it to true if you made changes that need to be reflected in WebGL.
    This property is automatically set to true when instancing a new material.
     */
    var needsUpdate: Boolean


    fun setValues(values: MaterialParams)

    fun toJSON(meta: String = definedExternally): String

    open fun clone() : MaterialProxy
    fun copy(material: MaterialProxy): MaterialProxy

    fun dispose()

}