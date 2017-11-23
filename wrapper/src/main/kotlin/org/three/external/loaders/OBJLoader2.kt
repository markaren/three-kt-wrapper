@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class OBJLoader2 {

    fun load(url: String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally,
             onMeshAlter: () -> Unit = definedExternally,
             useAsync: Boolean = definedExternally)

}