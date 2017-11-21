@file:JsQualifier("THREE")

package org.three.core

open external class BufferAttribute {

    constructor(array: List<dynamic>, itemSize: Int, normalized: Boolean = definedExternally)

    var uuid: String
    var name: String

    var array: List<dynamic>
    var itemSize: Int
    var count: Int
    var normalized: Boolean

    var dynamic: Boolean

    var version: Int

    fun setDynamic(value: Boolean): BufferAttribute

    fun copy(source: BufferAttribute) : BufferAttribute

}

