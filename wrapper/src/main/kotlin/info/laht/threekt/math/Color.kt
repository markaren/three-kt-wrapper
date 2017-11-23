@file:JsQualifier("THREE")

package info.laht.threekt.math


open external class Color {

    constructor()
    constructor(string: String)
    constructor(hex: Int)
    constructor(color: Color)
    constructor(r: Number, g: Number, b: Number)

    var r: Double
    var g: Double
    var b: Double

    fun set(value: Color): Color
    fun set(value: Int): Color
    fun set(value: String): Color

    fun setScalar(scalar: Double): Color
    fun setHex(hex: Int) : Color
    fun setRGB(r: Number, g: Number, b: Number): Color
    fun setHSL(h: Number, s: Number, l: Number): Color

    fun clone() : Color
    fun copy(color: Color) : Color

    fun getHex() : Int
    fun getHexString() : String

}
