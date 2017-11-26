@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.*
import info.laht.threekt.objects.Mesh

open external class Geometry {

    val id: Int

    var vertices: List<Vector3>
    var colors: List<Color>
    var faces: List<Face3>
    var faceVertexUvs: List<List<Vector2>>

    var morphTargets: dynamic
    var morphNormals: dynamic

    var skinWeights: dynamic
    var skinIndices: dynamic

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
    fun rotateX(angle: Number) : Geometry
    fun rotateY(angle: Number) : Geometry
    fun rotateZ(angle: Number) : Geometry
    fun translate(x: Number, y: Number, z: Number) : Geometry
    fun scale(x: Number, y: Number, z: Number): Geometry
    fun lookAt(vector: Vector3) : Geometry
    fun fromBufferGeometry(geometry: BufferGeometry) : Geometry
    fun addFace(a: Int, b: Int, c: Int, materialIndexOffset: Int = definedExternally)
    fun center() : Vector3
    fun normalize() : Geometry
    fun computeFaceNormals()
    fun computeVertexNormals(areaWeighted : Boolean = definedExternally)
    fun computeFlatVertexNormals()
    fun computeMorphNormals()
    fun computeLineDistances()
    fun computeBoundingBox()
    fun computeBoundingSphere()

    fun merge(geometry: Geometry, matrix: Matrix4 = definedExternally, materialIndexOffset: Int = definedExternally)

    fun mergeMesh(mesh: Mesh)

    fun mergeVertices()

    fun setFromPoint(points: Array<Vector3>) : Geometry

    fun sortFacesByMaterialIndex()

    fun toJSON() : dynamic

    open fun clone() : Geometry
    fun copy(geometry: Geometry) : Geometry

    fun dispose()

}
