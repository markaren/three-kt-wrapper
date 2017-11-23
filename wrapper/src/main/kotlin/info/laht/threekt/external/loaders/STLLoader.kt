@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class STLLoader {

    fun load(url: String,
             onLoad: (BufferGeometry) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun parse(data: String) : Object3D
    fun parse(data: ByteArray) : Object3D

}