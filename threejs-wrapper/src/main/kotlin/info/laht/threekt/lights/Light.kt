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

package info.laht.threekt.lights

import info.laht.threekt.core.Object3D
import info.laht.threekt.math.Color

/**
 * Abstract base class for lights - all other light types inherit the properties and methods described here.
 */
open external class Light(
    color: Int = definedExternally,
    intensity: Number = definedExternally
) : Object3D {

    /**
     * Color of the light. Defaults to a new Color set to white, if not passed in the constructor.
     */
    var color: Color
    /**
     * The light's intensity, or strength.
     * In physically correct mode, the product of color * intensity is interpreted as luminous intensity measured in candela.
     * Default - 1.0.
     */
    var intensity: Double

    var receiveShadow: Boolean?

    /**
     * Copies the value of color and intensity from the source light into this one.
     */
    fun copy(source: Light): Light

}