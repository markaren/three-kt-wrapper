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

external class Vector4(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally
) {

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun set(x: Number, y: Number, z: Number, w: Number): Vector4

    /**
     * If index equals 0 returns the x value.
     * If index equals 1 returns the y value.
     * If index equals 2 returns the z value.
     * If index equals 3 returns the w value.
     * @index 0, 1, 2 or 3.
     */
    fun getComponent(index: Int): Double

    /**
     * Adds v to this vector
     */
    fun add(v: Vector4): Vector4

    /**
     * ets this vector to a + b.
     */
    fun addVectors(a: Vector4, b: Vector4): Vector4

    /**
     * Adds the scalar value s to this vector's x, y, z and w values.
     */
    fun addScalar(s: Number): Vector4

    /**
     * Subtracts v from this vector.
     */
    fun sub(v: Vector4): Vector4

    /**
     * Sets this vector to a - b.
     */
    fun subVectors(a: Vector4, b: Vector4): Vector4


    /**
     * Subtracts s from this vector's x, y, z and w compnents.
     */
    fun subScalar(s: Number): Vector4

    /**
     * Inverts this vector - i.e. sets x = -x, y = -y, z = -z and w = -w.
     */
    fun negate(): Vector4

    /**
     * Converts this vector to a unit vector - that is, sets it equal to the vector with the same direction as this one, but length 1.
     */
    fun normalize(): Vector4

    /**
     * Computes the Euclidean length (straight-line length) from (0, 0, 0, 0) to (x, y, z, w).
     */
    fun length(): Double

    /**
     * Computes the Manhattan length of this vector.
     */
    fun manhattanLength(): Double

    /**
     * Computes the square of the Euclidean length (straight-line length) from (0, 0, 0, 0) to (x, y, z, w).
     * If you are comparing the lengths of vectors, you should compare the length squared instead as it is slightly more efficient to calculate.
     */
    fun lengthSq(): Double

    /**
     * Multiplies this vector by 4 x 4 m.
     */
    fun applyMatrix4(m: Matrix4): Vector4

    /**
     * The x, y, z and w components of the vector are rounded up to the nearest integer value.
     */
    fun ceil(): Vector4

    /**
     * The components of the vector are rounded down to the nearest integer value.
     */
    fun floor(): Vector4

    /**
     * Calculates the dot product of this vector and v.
     */
    fun dot(v: Vector4): Vector4

    /**
     * Returns a new Vector4 with the same x, y, z and w values as this one.
     */
    fun clone(): Vector4


    /**
     * Copies the values of the passed Vector4's x, y, z and w properties to this Vector4.
     */
    fun copy(source: Vector4): Vector4

    /**
     * Checks for strict equality of this vector and v.
     */
    fun equals(v: Vector4): Boolean

}