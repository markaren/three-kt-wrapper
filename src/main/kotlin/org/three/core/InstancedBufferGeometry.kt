@file:JsQualifier("THREE")

package org.three.core

open external class InstancedBufferGeometry : BufferGeometry {

    var maxInstancedCount: Int?

    fun copy(source: InstancedBufferGeometry) : InstancedBufferGeometry

    override fun clone() : InstancedBufferGeometry

}