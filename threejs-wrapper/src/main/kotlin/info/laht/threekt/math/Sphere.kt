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

external class Sphere {

    constructor()
    constructor(center: Vector3, radius: Number)

    fun setFromPoints(points: Array<Vector3>, optionalCenter: Vector3 = definedExternally): Sphere

    fun clone(): Sphere
    fun copy(sphere: Sphere): Sphere

    fun empty(): Boolean

    fun containsPoint(point: Vector3): Boolean

    fun distanceToPoint(point: Vector3): Double

    fun intersectsSphere(sphere: Sphere): Boolean

    fun intersectsBox(box: Box3): Boolean

    fun clampPoint(point: Vector3, optionalTarget: Vector3 = definedExternally): Vector3

    fun getBoundingBox(optionalTarget: Box3): Box3

    fun applyMatrix4(matrix: Matrix4): Sphere

    fun translate(offset: Vector3): Sphere

    fun equals(sphere: Sphere): Boolean

}

