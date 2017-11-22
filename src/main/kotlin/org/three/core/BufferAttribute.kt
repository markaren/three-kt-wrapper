@file:JsQualifier("THREE")

package org.three.core

import org.khronos.webgl.*
import org.three.math.Color
import org.three.math.Vector2
import org.three.math.Vector3
import org.three.math.Vector4

external interface UpdateRange {
    var offset: Int
    var count: Int
}

abstract external class BufferAttribute<E, T: BufferAttribute<E,T>> {

    protected constructor(array: E, itemSize: Int, normalized: Boolean = definedExternally)

    var uuid: String
    var name: String

    var array: E
    var itemSize: Int
    var count: Int
    var normalized: Boolean

    var dynamic: Boolean
    var updateRange: UpdateRange

    var onUploadCallback: () -> Unit

    var version: Int

    fun copy(source: T) : T
    fun copyAt(index1: Int, attribute:T, index2: Int): T
    fun copyIndicesArray(indices: List<Int>)
    fun copyColorsArray(colors: List<Color>)
    fun copyVector2sArray(vectors: List<Vector2>)
    fun copyVector3sArray(vectors: List<Vector3>)
    fun copyVector4sArray(vectors: List<Vector4>)

    open fun clone() : T

}

external class Int8BufferAttribute: BufferAttribute<Int8Array, Int8BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class UInt8BufferAttribute: BufferAttribute<Uint8Array, UInt8BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class UInt8ClampedBufferAttribute: BufferAttribute<Uint8ClampedArray, UInt8ClampedBufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class Int16BufferAttribute: BufferAttribute<Int16Array, Int16BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class UInt16BufferAttribute: BufferAttribute<Uint16Array, UInt16BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class Int32BufferAttribute: BufferAttribute<Int32Array, Int32BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class UInt32BufferAttribute: BufferAttribute<Uint32Array, UInt32BufferAttribute> {
    constructor(array: IntArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class Float32BufferAttribute: BufferAttribute<Float32Array, Float32BufferAttribute> {
    constructor(array: FloatArray, itemSize: Int, normalized: Boolean = definedExternally)
}

external class Float64BufferAttribute: BufferAttribute<Float64Array, Float64BufferAttribute> {
    constructor(array: DoubleArray, itemSize: Int, normalized: Boolean = definedExternally)
}

