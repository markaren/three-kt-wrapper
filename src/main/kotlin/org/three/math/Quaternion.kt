@file:JsQualifier("THREE")

package org.three.math


open external class Quaternion {

    constructor()
    constructor(x: Float, y: Float, z: Float, w: Float)

    val x: Float
    val y: Float
    val z: Float
    val w: Float

    fun set(x: Float, y: Float, z: Float, w: Float)
    fun clone() : Quaternion
    fun copy(quaternion: Quaternion): Quaternion

    fun setFromEuler(euler: Euler, update: Boolean = definedExternally)
    fun setFromAxisAngle(axis: Vector3, angle: Float): Quaternion
    fun setFromRotationMatrix(m: Matrix4): Quaternion
    fun setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Vector3

    fun inverse() : Quaternion
    fun conjugate() : Quaternion

    fun dot(q : Quaternion): Float
    fun lengthSq() : Float
    fun length() : Float
    fun normalize(): Quaternion

    fun multiply(q: Quaternion): Quaternion
    fun preMultiply(q: Quaternion): Quaternion
    fun multiplyQuaternions(a: Quaternion, b:Quaternion): Quaternion

    fun equals(quaternion: Quaternion) : Boolean

}
