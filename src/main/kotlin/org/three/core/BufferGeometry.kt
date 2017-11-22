@file:JsQualifier("THREE")

package org.three.core

import org.three.math.Box3
import org.three.math.Matrix4
import org.three.math.Sphere
import org.three.math.Vector3

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

    var index: Int?
    var attributes: Map<String, BufferAttribute>

    var morphAttributes: Map<String, BufferAttribute>

    var groups: List<Group>

    var boundingBox: Box3?
    var boundingSphere: Sphere?

    var drawRange: DrawRange

    fun addAttribute(name: String, attribute: BufferAttribute)
    fun addGroup(start: Int, count: Int, materialIndex: Int = definedExternally)
    fun applyMatrix(matrix: Matrix4)
    fun center()
    open fun clone() : BufferGeometry
    fun copy(bufferGeometry: BufferGeometry) : BufferGeometry
    fun clearGroups()
    fun computeBoundingBox()
    fun computeBoundingSphere()
    fun dispose()
    fun fromGeometry(geometry: Geometry)
    fun getAttribute() : BufferAttribute
    fun getIndex() : List<Int>
    fun lookAt(vector: Vector3)
    fun merge(bufferGeometry: BufferGeometry, offset: Int = definedExternally)
    fun removeAttribute(name: String)
    fun rotateX(radians: Double)
    fun rotateY(radians: Double)
    fun rotateZ(radians: Double)
    fun scale(x: Double, y: Double, z: Double)
    fun setIndex(index: List<Int>)
    fun setDrawRange(start: Int, count: Int)
    fun setFromObject(`object`: Object3D)
    fun setFromPoints(points: List<Vector3>)
    fun toNonIndexed()
    fun translate(x: Double, y: Double, z: Double)
    fun updateFromObject(`object`: Object3D)

}