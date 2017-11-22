@file:JsQualifier("THREE")

package org.three.external.loaders

import org.three.core.Object3D

open external class MTLLoader {

    fun load(url: String,
             onLoad: (Object3D) -> Unit,
             onProgress: () -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun setTexturePath(path: String)
    fun setBaseUrl(path: String)
    fun setCrossOrigin(value: String)

    fun parse(text: String) : MaterialCreator


}

external class MaterialCreator(baseUrl: String = definedExternally) {

}