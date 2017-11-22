@file:JsQualifier("THREE")

package org.three.math

open external class Ray {

    constructor()
    constructor(origin: Vector3, direction: Vector3)

    var origin: Vector3
    var direction: Vector3

    fun set(origin: Vector3, direction: Vector3) : Ray
    fun clone() : Ray
    fun copy(ray : Ray) : Ray
    fun at(t: Double, optionalTarget: Vector3 = definedExternally)
    fun lookAt(v: Vector3): Ray
    fun recast(t: Double) : Ray
    fun closestPointToPoint(point: Vector3, optionalTarget: Vector3 = definedExternally): Vector3
    fun distanceToPoint(point: Vector3) : Double
    fun distanceSqToPoint(point: Vector3) : Double

}

