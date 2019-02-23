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

package info.laht.threekt.math

operator fun Vector3.unaryMinus() = this.clone().negate()
operator fun Vector3.plusAssign(v: Vector3) = this.let { add(v); Unit }
operator fun Vector3.plus(v: Vector3) = this.clone().add(v)
operator fun Vector3.minusAssign(v: Vector3) = this.let { sub(v); Unit }
operator fun Vector3.minus(v: Vector3) = this.clone().sub(v)
operator fun Vector3.times(v: Vector3) = this.clone().multiply(v)
operator fun Vector3.timesAssign(v: Vector3) = this.let { times(v); Unit }

operator fun Vector4.unaryMinus() = this.clone().negate()
operator fun Vector4.plusAssign(v: Vector4) = this.let { add(v); Unit }
operator fun Vector4.plus(v: Vector4) = this.clone().add(v)
operator fun Vector4.minusAssign(v: Vector4) = this.let { sub(v); Unit }
operator fun Vector4.minus(v: Vector4) = this.clone().sub(v)

operator fun Quaternion.times(q: Quaternion) = this.clone().multiply(q)
operator fun Quaternion.timesAssign(q: Quaternion) = this.let { multiply(q); Unit }

operator fun Matrix4.times(v: Vector3) = v.applyMatrix4(this).let { this.setPosition(it) }
operator fun Matrix4.times(m: Matrix4) = this.clone().multiply(m)
operator fun Matrix4.timesAssign(m: Matrix4) = this.let { multiply(m); Unit }
