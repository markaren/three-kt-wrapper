@file:JsQualifier("THREE")

package org.three.math

open external class Vector4 {

    constructor()
    constructor(x: Double, y: Double, z: Double, w: Double)

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun clone() : Vector4
    fun copy(source: Vector4) : Vector4

}