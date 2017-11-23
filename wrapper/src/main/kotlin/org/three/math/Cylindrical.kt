@file:JsQualifier("THREE")

package org.three.math

open external class Cylindrical(
        radius: Double,
        theta: Double,
        y: Double
) {

    fun set(radius: Double, theta: Double, y: Double) : Cylindrical
    fun clone() : Cylindrical
    fun copy(cylindrical: Cylindrical) : Cylindrical
    fun setFromVector3(vector3: Vector3) : Cylindrical

}

