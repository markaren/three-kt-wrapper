@file:JsQualifier("THREE")

package info.laht.threekt.scenes

import info.laht.threekt.math.Color

open external class FogExp2 {

    constructor(color: Color)
    constructor(color: Color, density: Double)

    var color: Color
    var density: Double

    fun clone() : FogExp2
    fun toJSON() : String

}

