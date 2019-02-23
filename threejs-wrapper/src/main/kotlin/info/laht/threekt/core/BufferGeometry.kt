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

import info.laht.threekt.math.Box3
import info.laht.threekt.math.Matrix4
import info.laht.threekt.math.Sphere
import info.laht.threekt.math.Vector3

/**
 * This class is an efficient alternative to Geometry, because it stores all data, including vertex positions,
 * face indices, normals, colors, UVs, and custom attributes within buffers; this reduces the cost of passing all
 * this data to the GPU.
 * This also makes BufferGeometry harder to work with than Geometry; rather than accessing position data as Vector3
 * objects, color data as Color objects, and so on, you have to access the raw data from the appropriate attribute buffer.
 * This makes BufferGeometry best-suited for static objects where you don't need to manipulate the geometry much
 * after instantiating it.
 */
open external class BufferGeometry {

    interface DrawRange {
        var start: Int
        var count: Int
    }

    interface Group {
        var start: Int
        var count: Int
        var materialIndex: Int
    }

    val uuid: String
    val id: String

    var name: String
    var type: String

    var index: dynamic
    var attributes: Map<String, BufferAttribute>

    var morphAttributes: Map<String, BufferAttribute>

    var groups: List<Group>

    var boundingBox: Box3?
    var boundingSphere: Sphere?

    var drawRange: DrawRange


    open fun clone(): BufferGeometry
    fun copy(bufferGeometry: BufferGeometry): BufferGeometry

    fun computeBoundingBox()
    fun computeBoundingSphere()

    fun center(): Vector3

    fun dispose()
    fun clearGroups()
    fun addGroup(start: Int, count: Int, materialIndex: Int = definedExternally)

    fun addAttribute(name: String, attribute: BufferAttribute)
    fun getAttribute(name: String): BufferAttribute
    fun removeAttribute(name: String): BufferGeometry

    fun setIndex(index: BufferAttribute)
    fun setDrawRange(start: Int, count: Int)

    fun fromGeometry(geometry: Geometry)
    fun setFromObject(`object`: Object3D): BufferGeometry
    fun updateFromObject(`object`: Object3D): BufferGeometry
    fun setFromPoints(points: Array<Vector3>): BufferGeometry
    fun merge(bufferGeometry: BufferGeometry, offset: Int = definedExternally): BufferGeometry


    fun applyMatrix(matrix: Matrix4)
    fun lookAt(vector: Vector3): BufferGeometry
    fun rotateX(radians: Double): BufferGeometry
    fun rotateY(radians: Double): BufferGeometry
    fun rotateZ(radians: Double): BufferGeometry
    fun scale(x: Double, y: Double, z: Double): BufferGeometry
    fun translate(x: Double, y: Double, z: Double): BufferGeometry


    fun computeVertexNormals()
    fun normalizeNormals()
    fun toNonIndexed(): BufferGeometry

    fun toJSON(): Any

}