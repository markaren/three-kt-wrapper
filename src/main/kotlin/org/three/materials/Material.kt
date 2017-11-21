@file:JsQualifier("THREE")

package org.three.materials

import org.three.core.Object3D
import org.w3c.dom.MimeTypeArray

open external class Material {

    companion object {
        var materialId: Int
    }

    val id: Int

    var uuid : String
    var name : String
    open var type: String

    var fog: Boolean
    var lights: Boolean

    var blending: Int
    var side: Int
    var flatShading: Boolean
    var vertexColors: Int

    var opacity: Double
    var transparent: Boolean

    var blendSrc: Int;
    var blendDst: Int;
    var blendEquation: Int;
    var blendSrcAlpha: dynamic
    var blendDstAlpha: dynamic
    var blendEquationAlpha: dynamic


    var overdraw: Double

    var visible: Boolean

    var userData: Map<String, Any>

    var needsUpdate: Boolean


    fun setValues(values: Any)

    fun toJSON(meta: String = definedExternally): String

    open fun clone() : Material
    fun copy(material: Material): Material

    fun dispose()

}