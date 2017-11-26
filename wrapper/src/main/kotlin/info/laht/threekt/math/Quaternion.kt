@file:JsQualifier("THREE")

package info.laht.threekt.math

import info.laht.threekt.external.loaders.OnLoadCallback


open external class Quaternion(
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally
        ) {

    companion object {
        fun slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Number) : Quaternion
        fun slerpFlat(dst: DoubleArray, dstOffset: Int, src0: DoubleArray, srcOffset0: Int, src1: DoubleArray, srcOffset1: Int, t: Number)
    }

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun set(x: Number, y: Number, z: Number, w: Number)
    fun clone() : Quaternion
    fun copy(quaternion: Quaternion): Quaternion

    fun setFromEuler(euler: Euler, update: Boolean = definedExternally)
    fun setFromAxisAngle(axis: Vector3, angle: Number): Quaternion
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
    fun multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion

    fun slerp(qb: Quaternion, t: Number): Quaternion

    fun equals(quaternion: Quaternion) : Boolean

    fun fromArray(array: DoubleArray, offset: Int = definedExternally) : Quaternion
    fun toArray(array: DoubleArray = definedExternally, offset: Int  = definedExternally) : DoubleArray

    fun onChange(callback: () -> Unit)

}
