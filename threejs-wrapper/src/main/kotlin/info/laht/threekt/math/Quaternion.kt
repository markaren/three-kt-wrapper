/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.math


external class Quaternion(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally
) {

    companion object {
        fun slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Number): Quaternion
        fun slerpFlat(
            dst: DoubleArray,
            dstOffset: Int,
            src0: DoubleArray,
            srcOffset0: Int,
            src1: DoubleArray,
            srcOffset1: Int,
            t: Number
        )
    }

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun set(x: Number, y: Number, z: Number, w: Number)
    fun clone(): Quaternion
    fun copy(quaternion: Quaternion): Quaternion

    fun setFromEuler(euler: Euler, update: Boolean = definedExternally)
    fun setFromAxisAngle(axis: Vector3, angle: Number): Quaternion
    fun setFromRotationMatrix(m: Matrix4): Quaternion
    fun setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Vector3

    fun inverse(): Quaternion
    fun conjugate(): Quaternion

    fun dot(q: Quaternion): Double
    fun lengthSq(): Double
    fun length(): Double
    fun normalize(): Quaternion

    fun multiply(q: Quaternion): Quaternion
    fun preMultiply(q: Quaternion): Quaternion
    fun multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion

    fun slerp(qb: Quaternion, t: Number): Quaternion

    fun equals(quaternion: Quaternion): Boolean

    fun fromArray(array: DoubleArray, offset: Int = definedExternally): Quaternion
    fun toArray(array: DoubleArray = definedExternally, offset: Int = definedExternally): DoubleArray

    fun onChange(callback: () -> Unit)

}
