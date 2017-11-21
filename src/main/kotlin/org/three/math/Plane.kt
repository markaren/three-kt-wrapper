@file:JsQualifier("THREE")

package org.three.math

open external class Plane {

    constructor()
    constructor(normal: Vector3, constant: Float)

    var normal: Vector3
    var constant: Float

    fun set(normal: Vector3, constant: Float)

    fun clone() : Plane
    fun copy(plane: Plane) : Plane

}

