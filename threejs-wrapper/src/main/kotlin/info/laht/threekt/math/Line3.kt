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

external class Line3(
    start: Vector3 = definedExternally,
    end: Vector3 = definedExternally
) {

    var start: Vector3
    var end: Vector3

    fun set(start: Vector3, end: Vector3): Line3

    fun clone(): Line3
    fun copy(line: Line3): Line3

    fun getCenter(optionalTarget: Vector3 = definedExternally): Vector3

    fun delta(optionalTarget: Vector3): Vector3

    fun distanceSq(): Double

    fun distance(): Double

    fun at(t: Number, optionalTarget: Vector3): Vector3

    fun closestPointToPointParameter(point: Vector3, clampToLine: Boolean = definedExternally): Double

    fun closestPointToPoint(point: Vector3, clampToLine: Boolean, optionalTarget: Vector3 = definedExternally): Vector3

    fun applyMatrix4(matrix: Matrix4): Matrix4

    fun equals(line: Line3): Boolean
}