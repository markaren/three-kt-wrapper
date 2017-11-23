@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Spherical {

    constructor()
    constructor(radius: Number, phi: Number, theta: Number)

    var radius: Double
    var phi: Double
    var theta: Double

    fun set(radius: Double, phi: Double, theta: Double)
    fun clone() : Spherical
    fun copy(other: Spherical) : Spherical
    fun makeSafe() : Spherical
    fun setFromVector3(vec3: Vector3) : Spherical

}