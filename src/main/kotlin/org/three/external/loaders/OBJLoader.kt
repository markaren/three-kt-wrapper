@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class OBJLoader {

    fun load(url: String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun setPath(value: String)

    fun parse(text: String) : Object3D

}

