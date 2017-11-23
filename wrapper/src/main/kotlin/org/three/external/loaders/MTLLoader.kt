@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class MTLLoader {

    fun load(url: String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun setTexturePath(path: String)
    fun setBaseUrl(path: String)
    fun setCrossOrigin(value: String)

    fun parse(text: String) : MaterialCreator


}

external class MaterialCreator(baseUrl: String = definedExternally)