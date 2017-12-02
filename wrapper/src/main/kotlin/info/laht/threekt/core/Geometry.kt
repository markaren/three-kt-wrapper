@file:JsQualifier("THREE")

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

    fun toJSON() : Any

    open fun clone() : Geometry
    fun copy(geometry: Geometry) : Geometry

    fun dispose()

}
