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

package info.laht.threekt.external.objects

import info.laht.threekt.math.Vector3
import info.laht.threekt.textures.Texture

data class WaterOptions(

    val textureWidth: Int? = undefined,
    val textureHeight: Int? = undefined,

    val clipBias: Number? = undefined,
    val alpha: Number? = undefined,
    val time: Number? = undefined,
    val waterNormals: Texture? = undefined,
    val sunDirection: Vector3? = undefined,
    val sunColor: Int? = undefined,
    val waterColor: Int? = undefined,
    val eye: Vector3? = undefined,
    val distortionScale: Number? = undefined,
    val side: Int? = undefined,
    val fog: Boolean? = undefined

)