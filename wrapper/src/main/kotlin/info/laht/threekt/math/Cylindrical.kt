@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Cylindrical(
        radius: Number,
        theta: Number,
        y: Number
) {

    var radius: Double
    var theta: Double
    var y: Double

    fun set(radius: Number, theta: Number, y: Number) : Cylindrical
    fun clone() : Cylindrical
    fun copy(cylindrical: Cylindrical) : Cylindrical
    fun setFromVector3(vector3: Vector3) : Cylindrical

}

