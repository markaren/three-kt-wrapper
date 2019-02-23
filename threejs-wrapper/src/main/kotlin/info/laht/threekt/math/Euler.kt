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


external class Euler(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    order: String = definedExternally
) {

    companion object {
        val RotationOrders: Array<String>
        var DefaultOrder: String
    }

    var x: Double
    var y: Double
    var z: Double

    var order: String

    fun set(x: Number, y: Number, z: Number, order: String = definedExternally): Euler

    fun clone(): Euler
    fun copy(euler: Euler): Euler

    fun setFromRotationMatrix(m: Matrix4, order: String = definedExternally, update: Boolean = definedExternally): Euler

    fun setFromQuaternion(q: Quaternion, order: String = definedExternally, update: Boolean = definedExternally)

    fun setFromVector3(v: Vector3, order: String = definedExternally): Euler

    fun reorder(order: String): Euler

    fun equals(euler: Euler): Boolean

    fun fromArray(array: DoubleArray): Euler

    fun toArray(array: DoubleArray = definedExternally, offset: Int = definedExternally): DoubleArray

    fun toVector3(optionalResult: Vector3 = definedExternally): Vector3

    fun onChange(callback: () -> Unit)


}

