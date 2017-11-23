@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.Box3
import info.laht.threekt.math.Matrix4
import info.laht.threekt.math.Sphere
import info.laht.threekt.math.Vector3

external interface DrawRange {
    var start: Int
    var count: Int
}

external interface Group {
    var start: Int
    var count: Int
    var materialIndex: Int
}

open external class BufferGeometry {

    val uuid: String
    val id: String

    var name: String
    var type: String

    var index: dynamic
    var attributes: Map<String, BufferAttribute<*, *>>

    var morphAttributes: Map<String, BufferAttribute<*, *>>

    var groups: List<Group>

    var boundingBox: Box3?
    var boundingSphere: Sphere?

    var drawRange: DrawRange


    open fun clone() : BufferGeometry
    fun copy(bufferGeometry: BufferGeometry) : BufferGeometry


    fun computeBoundingBox()
    fun computeBoundingSphere()

    fun center() : Vector3

    fun dispose()
    fun clearGroups()
    fun addGroup(start: Int, count: Int, materialIndex: Int = definedExternally)

    fun addAttribute(name: String, attribute: BufferAttribute<*, *>)
    fun getAttribute(name: String) : BufferAttribute<*, *>
    fun removeAttribute(name: String) : BufferGeometry


    fun setIndex(index: BufferAttribute<*, *>)
    fun setDrawRange(start: Int, count: Int)

    fun fromGeometry(geometry: Geometry)
    fun setFromObject(`object`: Object3D): BufferGeometry
    fun updateFromObject(`object`: Object3D): BufferGeometry
    fun setFromPoints(points: Array<Vector3>): BufferGeometry
    fun merge(bufferGeometry: BufferGeometry, offset: Int = definedExternally): BufferGeometry


    fun applyMatrix(matrix: Matrix4)
    fun lookAt(vector: Vector3): BufferGeometry
    fun rotateX(radians: Double) : BufferGeometry
    fun rotateY(radians: Double) : BufferGeometry
    fun rotateZ(radians: Double) : BufferGeometry
    fun scale(x: Double, y: Double, z: Double) : BufferGeometry
    fun translate(x: Double, y: Double, z: Double): BufferGeometry



    fun computeVertexNormals()
    fun normalizeNormals()
    fun toNonIndexed(): BufferGeometry

}