/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.materials

@JsName("Material")
open external class Material {

    /**
     * Unique number for this material instance.
     */
    val id: Int

    var uuid: String
    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    var name: String
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
     * Double in the range of 0.0 - 1.0 indicating how transparent the material is. A value of 0.0 indicates fully transparent, 1.0 is fully opaque.
    If the material's # .transparent property is not set to true, the material will remain fully opaque and this value will only affect its color.
    Default is 1.0.
     */
    var opacity: Double
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
    var alphaTest: Double
    var premultipliedAlpha: Boolean

    var overdraw: Double

    var visible: Boolean

    var userData: Map<String, Any>

    /**
     * Specifies that the material needs to be updated at the WebGL level. Set it to true if you made changes that need to be reflected in WebGL.
    This property is automatically set to true when instancing a new material.
     */
    var needsUpdate: Boolean


    fun toJSON(meta: String = definedExternally): String

    open fun clone(): Material
    fun copy(material: Material): Material

    fun dispose()

}