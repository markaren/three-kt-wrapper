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

external class Triangle(
    a: Vector3 = definedExternally,
    b: Vector3 = definedExternally,
    c: Vector3 = definedExternally
) {

    var a: Vector3
    var b: Vector3
    var c: Vector3

    companion object {
        fun normal(a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = definedExternally)
        fun barycoordFromPoint(
            point: Vector3,
            a: Vector3,
            b: Vector3,
            c: Vector3,
            optionalTarget: Vector3 = definedExternally
        )

        fun containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3)
    }

    fun set(a: Vector3, b: Vector3, c: Vector3): Triangle
    fun setFromPointsAndIndices(points: Array<Vector3>, i0: Int, i1: Int, i2: Int): Triangle
    fun clone(): Triangle
    fun copy(source: Triangle): Triangle
    fun area(): Double
    fun midpoint(optionalTarget: Vector3 = definedExternally): Vector3
    fun normal(optionalTarget: Vector3 = definedExternally): Vector3
    fun plane(optionalTarget: Plane = definedExternally): Plane
    fun barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = definedExternally): Vector3
    fun containsPoint(point: Vector3): Boolean
    fun closestPointToPoint(point: Vector3, optionalTarget: Vector3 = definedExternally): Vector3

    fun equals(triangle: Triangle): Boolean

}