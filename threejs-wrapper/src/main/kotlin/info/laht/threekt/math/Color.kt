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


external class Color {

    constructor()
    constructor(string: String)
    constructor(hex: Int)
    constructor(color: Color)
    constructor(r: Number, g: Number, b: Number)

    var r: Double
    var g: Double
    var b: Double

    fun set(value: Color): Color
    fun set(value: Int): Color
    fun set(value: String): Color

    fun setScalar(scalar: Double): Color
    fun setHex(hex: Int): Color
    fun setRGB(r: Number, g: Number, b: Number): Color
    fun setHSL(h: Number, s: Number, l: Number): Color

    fun clone(): Color
    fun copy(color: Color): Color

    fun getHex(): Int
    fun getHexString(): String

}
