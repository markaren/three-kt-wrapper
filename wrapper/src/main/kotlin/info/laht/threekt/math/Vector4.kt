@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Vector4 {

    constructor()
    constructor(x: Number, y: Number, z: Number, w: Number)

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun clone() : Vector4
    fun copy(source: Vector4) : Vector4

}