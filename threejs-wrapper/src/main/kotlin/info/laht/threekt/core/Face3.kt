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

package info.laht.threekt.core

import info.laht.threekt.math.Color
import info.laht.threekt.math.Vector3

external class Face3 {

    constructor(
        a: Int,
        b: Int,
        c: Int,
        normal: Vector3 = definedExternally,
        color: Color = definedExternally,
        materialIndex: Int = definedExternally
    )

    constructor(
        a: Int,
        b: Int,
        c: Int,
        normal: Array<Vector3> = definedExternally,
        color: Array<Color> = definedExternally,
        materialIndex: Int = definedExternally
    )

    var a: Int
    var b: Int
    var c: Int

    var normal: Vector3?
    var vertexNormals: Array<Vector3>?

    var color: Color?
    var vertexColors: Array<Color>?

    var materialIndex: Int?

    fun clone(): Face3
    fun copy(source: Face3): Face3

}