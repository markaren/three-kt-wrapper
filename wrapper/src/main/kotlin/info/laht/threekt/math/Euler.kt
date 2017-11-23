@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Euler {

    constructor()
    constructor(x: Double, y: Double, z: Double)

    var x: Double
    var y: Double
    var z: Double

    fun clone() : Euler
    fun copy(euler: Euler): Euler

}

