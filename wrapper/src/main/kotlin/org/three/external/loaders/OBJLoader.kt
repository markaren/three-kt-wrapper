@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D
import org.three.objects.Mesh
import org.w3c.xhr.XMLHttpRequest

open external class OBJLoader {

    fun load(url: String,
             onLoad: (Mesh) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun setPath(value: String)

    fun parse(text: String) : Object3D

}

