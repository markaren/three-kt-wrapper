@file:JsQualifier("THREE")

package org.three.math

open external class Plane {

    constructor()
    constructor(normal: Vector3, constant: Double)

    var normal: Vector3
    var constant: Double

    fun set(normal: Vector3, constant: Double)

    fun clone() : Plane
    fun copy(plane: Plane) : Plane

}

