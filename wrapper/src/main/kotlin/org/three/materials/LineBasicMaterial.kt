@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color

open external class LineBasicMaterial : Material {

    var color: Color

    var linewidth: Double
    var linecap: String
    var linejoin: String

    override  fun clone() : LineBasicMaterial
    fun copy(material: LineBasicMaterial) : LineBasicMaterial

}