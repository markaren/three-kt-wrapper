@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Color
import info.laht.threekt.textures.Texture

open external class PointsMaterial : Material {

    var color: Color

    var map: Texture?

    var size: Number
    var sizeAttentuation: Boolean

    override fun clone() : PointsMaterial
    fun copy(material: PointsMaterial) : PointsMaterial

}