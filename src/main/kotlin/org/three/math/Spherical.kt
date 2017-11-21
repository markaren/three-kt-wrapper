@file:JsQualifier("THREE")

package org.three.math

open external class Spherical {

    constructor()
    constructor(radius: Float, phi: Float, theta: Float)

    var radius: Float
    var phi: Float
    var theta: Float

    fun set(radius: Float, phi: Float, theta: Float)
    fun clone() : Spherical
    fun copy(other: Spherical) : Spherical
    fun makeSafe() : Spherical
    fun setFromVector3(vec3: Vector3) : Spherical

}