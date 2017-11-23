@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class InstancedBufferGeometry : BufferGeometry {

    var maxInstancedCount: Int?

    fun copy(source: InstancedBufferGeometry) : InstancedBufferGeometry

    override fun clone() : InstancedBufferGeometry

}