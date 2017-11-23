@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Color

open external class LineBasicMaterial : Material {

    var color: Color

    var linewidth: Double
    var linecap: String
    var linejoin: String

    override  fun clone() : LineBasicMaterial
    fun copy(material: LineBasicMaterial) : LineBasicMaterial

}