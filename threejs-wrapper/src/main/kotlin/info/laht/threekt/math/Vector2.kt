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

external class Vector2(
    x: Number = definedExternally,
    y: Number = definedExternally
) {

    var x: Double
    var y: Double

    fun width(): Double
    fun height(): Double

    fun set(x: Number, y: Number): Vector2

    fun setScalar(scalar: Number): Vector2

    fun setX(x: Number): Vector2

    fun setY(y: Number): Vector2

    fun setComponent(index: Int, value: Number): Vector2

    fun getComponent(index: Int): Double

    fun clone(): Vector2

    fun copy(v: Vector2): Vector2

    fun add(v: Vector2): Vector2

    fun addScalar(s: Number): Vector2
    fun addVectors(a: Vector2, b: Vector2): Vector2

    fun addScaledVector(v: Vector2, s: Number): Vector2
    fun sub(v: Vector2): Vector2

    fun subScalar(s: Number): Vector2

    fun subVectors(a: Vector2, b: Vector2): Vector2

    fun multiply(v: Vector2): Vector2

    fun multiplyScalar(scalar: Number): Vector2
    fun divide(v: Vector2): Vector2

    fun divideScalar(scalar: Number): Vector2

    fun applyMatrix3(m: Matrix3): Vector2

    fun min(v: Vector2): Vector2

    fun max(v: Vector2): Vector2

    fun clamp(min: Vector2, max: Vector2): Vector2

    fun clampScalar(minVal: Number, maxVal: Number): Vector2

    fun clampLength(min: Vector2, max: Vector2): Vector2
    fun floor(): Vector2

    fun ceil(): Vector2

    fun round(): Vector2
    fun roundToZero(): Vector2

    fun negate(): Vector2

    fun dot(v: Vector2): Double

    fun lengthSq(): Double

    fun length(): Double

    fun manhattanLength(): Double

    fun normalize(): Vector2

    fun angle(): Double

    fun distanceTo(v: Vector2): Double

    fun distanceToSquared(v: Vector2): Double

    fun manhattanDistanceTo(v: Vector2): Double

    fun setLength(length: Number): Vector2

    fun lerp(v: Vector2, alpha: Number): Vector2

    fun lerpVectors(v1: Vector2, v2: Vector2, alpha: Number): Vector2

    fun equals(v: Vector2): Boolean

    fun fromArray(array: DoubleArray, offset: Int): Vector2

    fun toArray(array: DoubleArray = definedExternally, offset: Int): DoubleArray

    fun fromBufferAttribute(attribute: dynamic, index: Int)

    fun rotateAround(center: Vector2, angle: Number): Vector2

}