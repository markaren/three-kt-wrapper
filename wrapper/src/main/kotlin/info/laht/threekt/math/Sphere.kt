@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Sphere {

    constructor()
    constructor(center: Vector3, radius: Double)

    fun clone(): Sphere
    fun copy(sphere: Sphere) : Sphere

    fun empty()

}

