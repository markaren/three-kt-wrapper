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

import info.laht.threekt.math.*
import info.laht.threekt.objects.Mesh

external interface MorphTarget {
    val name: String
    val vertices: Array<Vector3>
}

external interface MorphNormal {
    val name: String
    val normals: Array<Vector3>
}

open external class Geometry {

    val id: Int

    var vertices: Array<Vector3>
    var colors: Array<Color>
    var faces: Array<Face3>
    var faceVertexUvs: Array<Array<Vector2>>

    var morphTargets: Array<MorphTarget>
    var morphNormals: Array<MorphNormal>

    var skinWeights: Array<Vector4>
    var skinIndices: Array<Vector4>

    var lineDistances: List<Double>

    var boundingBox: Box3?
    var boundingSphere: Sphere?

    // update flags

    var elementsNeedUpdate: Boolean
    var verticesNeedUpdate: Boolean
    var uvsNeedUpdate: Boolean
    var normalsNeedUpdate: Boolean
    var colorsNeedUpdate: Boolean
    var lineDistancesNeedUpdate: Boolean
    var groupsNeedUpdate: Boolean

    fun applyMatrix(matrix: Matrix4): Geometry
    fun rotateX(angle: Number): Geometry
    fun rotateY(angle: Number): Geometry
    fun rotateZ(angle: Number): Geometry
    fun translate(x: Number, y: Number, z: Number): Geometry
    fun scale(x: Number, y: Number, z: Number): Geometry
    fun lookAt(vector: Vector3): Geometry
    fun fromBufferGeometry(geometry: BufferGeometry): Geometry
    fun addFace(a: Int, b: Int, c: Int, materialIndexOffset: Int = definedExternally)
    fun center(): Vector3
    fun normalize(): Geometry
    fun computeFaceNormals()
    fun computeVertexNormals(areaWeighted: Boolean = definedExternally)
    fun computeFlatVertexNormals()
    fun computeMorphNormals()
    fun computeLineDistances()
    fun computeBoundingBox()
    fun computeBoundingSphere()

    fun merge(geometry: Geometry, matrix: Matrix4 = definedExternally, materialIndexOffset: Int = definedExternally)

    fun mergeMesh(mesh: Mesh)

    fun mergeVertices()

    fun setFromPoint(points: Array<Vector3>): Geometry

    fun sortFacesByMaterialIndex()

    fun toJSON(): Any

    open fun clone(): Geometry
    fun copy(geometry: Geometry): Geometry

    fun dispose()

}
