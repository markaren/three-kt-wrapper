@file:JsQualifier("THREE")

package org.three.math

open external class Euler {

    constructor()
    constructor(x: Float, y: Float, z: Float)

    var x: Float
    var y: Float
    var z: Float

    fun clone() : Euler
    fun copy(euler: Euler): Euler

}

