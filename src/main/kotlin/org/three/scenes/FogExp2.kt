@file:JsQualifier("THREE")

package org.three.scenes

import org.three.math.Color

open external class FogExp2 {

    constructor(color: Color)
    constructor(color: Color, density: Double)

    var color: Color
    var density: Double

    fun clone() : FogExp2
    fun toJSON() : String

}

