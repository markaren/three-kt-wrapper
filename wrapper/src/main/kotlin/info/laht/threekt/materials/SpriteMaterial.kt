@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Color
import info.laht.threekt.textures.Texture

open external class SpriteMaterial : Material {

    var color: Color

    var map: Texture?

    var rotation: Double

    override fun clone() : SpriteMaterial
    fun copy(material: SpriteMaterial) : SpriteMaterial

}