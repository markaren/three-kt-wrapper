@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.*

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

    fun applyMatrix(matrix4: Matrix4): Geometry
    fun rotateX(angle: Double) : Geometry
    fun rotateY(angle: Double) : Geometry
    fun rotateZ(angle: Double) : Geometry
    fun translate(x: Double, y: Double, z: Double) : Geometry
    fun scale(x: Double, y: Double, z: Double): Geometry
    fun lookAt()
    fun fromBufferGeometry(geometry: BufferGeometry) : Geometry
    fun center() : Vector3
    fun normalize() : Geometry
    fun computeVertexNormals(areaWeighted : Boolean = definedExternally)
    fun computeMorphNormals()
    fun computeBoundingBox()
    fun computeBoundingSphere()

    fun merge(geometry: Geometry, matrix4: Matrix4, materialIndexOffset: Int = definedExternally)

}
