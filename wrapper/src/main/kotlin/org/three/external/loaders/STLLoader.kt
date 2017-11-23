@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.BufferGeometry
import org.three.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class STLLoader {

    fun load(url: String,
             onLoad: (BufferGeometry) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun parse(data: String) : Object3D
    fun parse(data: ByteArray) : Object3D

}