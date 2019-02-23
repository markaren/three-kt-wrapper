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
import info.laht.threekt.math.Vector2
import info.laht.threekt.math.Vector3
import info.laht.threekt.math.Vector4

abstract external class BufferAttribute protected constructor(
    array: dynamic,
    itemSize: Int,
    normalized: Boolean = definedExternally
) {


    interface UpdateRange {
        /**
         * Default is 0. Position at whcih to start update.
         */
        var offset: Int
        /**
         * Default is -1, which means don't use update ranges.

         */
        var count: Int
    }


    /**
     * UUID of this object instance. This gets automatically assigned and this shouldn't be edited.
     */
    val uuid: String
    /**
     * Optional name for this attribute instance. Default is an empty string.
     */
    var name: String

    var array: dynamic
    /**
     * The length of vectors that are being stored in the array.
     */
    val itemSize: Int
    /**
     * Stores the array's length divided by the itemSize.
     *
     * If the buffer is storing a 3-component vector (such as a position, normal, or color),
     * then this will count the number of such vectors stored.
     */
    val count: Int
    /**
     * Indicates how the underlying data in the buffer maps to the values in the GLSL shader code. See the constructor above for details.
     */
    var normalized: Boolean

    /**
     * Whether the buffer is dynamic or not. Default is false.
     * If false, the GPU is informed that contents of the buffer are likely to be used often and not change often.
     * This corresponds to the glfun sTATIC_DRAW flag.
     * if true, the GPU is informed that contents of the buffer are likely to be used often and change often.
     * This corresponds to the gl.DYNAMIC_DRAW flag.
     */
    var dynamic: Boolean
    /**
     * This can be used to only update some components of stored vectors (
     * for example, just the component related to color).
     */
    var updateRange: UpdateRange

    /**
     * Flag to indicate that this attribute has changed and should be re-sent to the GPU. Set this to true when you modify the value of the array.
     *
     * Setting this to true also increments the version.
     */
    var needsUpdate: Boolean

    var onUploadCallback: () -> Unit

    /**
     * A version number, incremented every time the needsUpdate property is set to true.
     */
    val version: Int

    fun setArray(array: dynamic)

    /**
     * Set dynamic to value.
     */
    fun setDynamic(value: Boolean)

    /**
     * Returns the w component of the vector at the given index.
     */
    fun getW(index: Int): Number

    fun copy(source: BufferAttribute): BufferAttribute
    /**
     * Copy a vector from bufferAttribute[index2] to array[index1].
     */
    fun copyAt(index1: Int, attribute: BufferAttribute, index2: Int): BufferAttribute

    /**
     * Copy an array representing Face3 indices into array.
     */
    fun copyIndicesArray(indices: Array<Int>)

    /**
     * Copy an array representing RGB color values into array.
     */
    fun copyColorsArray(colors: Array<Color>)

    /**
     * Copy an array representing Vector2s into array.
     */
    fun copyVector2sArray(vectors: Array<Vector2>)

    /**
     * Copy an array representing Vector3s into array.
     */
    fun copyVector3sArray(vectors: Array<Vector3>)

    /**
     * Copy an array representing Vector4s into array.
     */
    fun copyVector4sArray(vectors: Array<Vector4>)

    /**
     * Return a copy of this bufferAttribute.
     */
    open fun clone(): BufferAttribute


    /**
     * Returns the x component of the vector at the given index.
     */
    fun getX(index: Int): Number

    /**
     * Returns the y component of the vector at the given index.
     */
    fun getY(index: Int): Number

    /**
     * Returns the z component of the vector at the given index.
     */
    fun getZ(index: Int): Number

    /**
     * Sets the x component of the vector at the given index.
     */
    fun setX(index: Int, x: Number)

    /**
     * Sets the y component of the vector at the given index.
     */
    fun setY(index: Int, y: Number)

    /**
     * Sets the z component of the vector at the given index.
     */
    fun setZ(index: Int, z: Number)

    /**
     * Sets the w component of the vector at the given index.
     */
    fun setW(index: Int, w: Number)

    /**
     * Sets the x, y component of the vector at the given index.
     */
    fun setXY(index: Int, x: Number, y: Number)

    /**
     * Sets the x, y, z component of the vector at the given index.
     */
    fun setXYZ(index: Int, x: Number, y: Number, z: Number)

    /**
     * Sets the x, y, z, w component of the vector at the given index.
     */
    fun setXYZW(index: Int, x: Number, y: Number, z: Number, w: Number)
}
