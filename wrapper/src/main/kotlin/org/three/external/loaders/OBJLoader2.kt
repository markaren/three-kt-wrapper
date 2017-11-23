@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D
import org.three.objects.Mesh
import org.w3c.xhr.XMLHttpRequest

external interface Detail {
    var loaderRootNode: Mesh
    var modelName: String
    var instanceNo: Int
}

external interface OnLoadCallback {

    var detail: Detail

}

external interface LoaderProxy {
    fun load(url: String,
             onLoad: (OnLoadCallback) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally,
             onMeshAlter: () -> Unit = definedExternally,
             useAsync: Boolean = definedExternally)
}

external class OBJLoader2 : LoaderProxy {

    var OBJLOADER2_VERSION: String
    var LoaderBase: LoaderSupport.LoaderBase
    var Validator: LoaderSupport.Validator

    override fun load(url: String, onLoad: (OnLoadCallback) -> Unit, onProgress: (XMLHttpRequest) -> Unit, onError: (dynamic) -> Unit, onMeshAlter: () -> Unit, useAsync: Boolean)
}