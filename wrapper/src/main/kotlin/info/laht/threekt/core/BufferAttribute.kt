@file:JsQualifier("THREE")

package info.laht.threekt.core

import org.khronos.webgl.*
import info.laht.threekt.math.Color
import info.laht.threekt.math.Vector2
import info.laht.threekt.math.Vector3
import info.laht.threekt.math.Vector4

abstract external class BufferAttribute {

    protected constructor(array: dynamic, itemSize: Int, normalized: Boolean = definedExternally)


    interface UpdateRange {
        var offset: Int
        var count: Int
    }


    var uuid: String
    var name: String

    var array: dynamic
    var itemSize: Int
    var count: Int
    var normalized: Boolean

    var dynamic: Boolean
    var updateRange: UpdateRange

    var onUploadCallback: () -> Unit

    var version: Int

    fun setArray(array: dynamic)
    fun setDynamic(value: Boolean)

    fun copy(source: BufferAttribute) : BufferAttribute
    fun copyAt(index1: Int, attribute:BufferAttribute, index2: Int): BufferAttribute
    fun copyIndicesArray(indices: List<Int>)
    fun copyColorsArray(colors: List<Color>)
    fun copyVector2sArray(vectors: List<Vector2>)
    fun copyVector3sArray(vectors: List<Vector3>)
    fun copyVector4sArray(vectors: List<Vector4>)

    open fun clone() : BufferAttribute

}
