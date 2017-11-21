@file:JsQualifier("THREE")

package org.three.math

open external class Color {

    companion object {
        val ColorKeyWords: Map<String, Int>
    }

    constructor(string: String)
    constructor(hex: Int)
    constructor(color: Color)
    constructor(r: Int, g: Int, b: Int)

    var r: Double
    var g: Double
    var b: Double

    fun set(value: Color)
    fun set(value: Int)
    fun set(value: String)

    fun setScalar(scalar: Double)
    fun setHex(hex: Int)

    fun clone() : Color
    fun copy(color: Color) : Color

}
