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

import info.laht.threekt.core.BufferAttribute

external class Matrix3 {

    var elements: DoubleArray

    fun set(
        n11: Number, n12: Number, n13: Number,
        n21: Number, n22: Number, n23: Number,
        n31: Number, n32: Number, n33: Number
    ): Matrix3

    fun identity(): Matrix3

    fun clone(): Matrix3
    fun copy(m: Matrix3): Matrix3

    fun setFromMatrix4(m: Matrix4): Matrix3

    fun applyToBufferAttribute(attribute: BufferAttribute)

    fun multiply(m: Matrix3): Matrix3

    fun premultiply(m: Matrix3): Matrix3

    fun multiplyMatrices(a: Matrix3, b: Matrix3): Matrix3

    fun multiplyScalar(s: Number): Matrix3

    fun determinant(): Double

    fun getInverse(matrix: Matrix3, throwOnDegenerate: Boolean = definedExternally): Matrix3

    fun transpose(): Matrix3

    fun getNormalMatrix(matrix4: Matrix4): Matrix3

    fun transposeIntoArray(r: DoubleArray): Matrix3

    fun setUvTransform(tx: Number, ty: Number, sx: Number, sy: Number, rotation: Number, cx: Number, cy: Number)

    fun scale(sx: Number, sy: Number): Matrix3

    fun rotate(theta: Number): Matrix3
    fun translate(tx: Number, ty: Number): Matrix3

    fun equals(matrix: Matrix3): Boolean

    fun fromArray(array: DoubleArray, offset: Int = definedExternally): Matrix3

    fun toArray(array: DoubleArray = definedExternally, offset: Int = definedExternally): DoubleArray

}