@file:JsQualifier("THREE")

package org.three.math


open external class Quaternion {

    constructor()
    constructor(x: Double, y: Double, z: Double, w: Double)

    val x: Double
    val y: Double
    val z: Double
    val w: Double

    fun set(x: Double, y: Double, z: Double, w: Double)
    fun clone() : Quaternion
    fun copy(quaternion: Quaternion): Quaternion

    fun setFromEuler(euler: Euler, update: Boolean = definedExternally)
    fun setFromAxisAngle(axis: Vector3, angle: Double): Quaternion
    fun setFromRotationMatrix(m: Matrix4): Quaternion
    fun setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Vector3

    fun inverse() : Quaternion
    fun conjugate() : Quaternion

    fun dot(q : Quaternion): Double
    fun lengthSq() : Double
    fun length() : Double
    fun normalize(): Quaternion

    fun multiply(q: Quaternion): Quaternion
    fun preMultiply(q: Quaternion): Quaternion
    fun multiplyQuaternions(a: Quaternion, b:Quaternion): Quaternion

    fun equals(quaternion: Quaternion) : Boolean

}
