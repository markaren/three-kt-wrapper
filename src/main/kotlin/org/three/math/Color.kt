@file:JsQualifier("THREE")

package org.three.math


open external class Color {

    constructor()
    constructor(string: String)
    constructor(hex: Int)
    constructor(color: Color)
    constructor(r: Double, g: Double, b: Double)

    var r: Double
    var g: Double
    var b: Double

    fun set(value: Color): Color
    fun set(value: Int): Color
    fun set(value: String): Color

    fun setScalar(scalar: Double): Color
    fun setHex(hex: Int) : Color
    fun setRGB(r: Double, g: Double, b: Double): Color
    fun setHSL(h: Double, s: Double, l: Double): Color

    fun clone() : Color
    fun copy(color: Color) : Color

    fun getHex() : Int
    fun getHexString() : String

}
