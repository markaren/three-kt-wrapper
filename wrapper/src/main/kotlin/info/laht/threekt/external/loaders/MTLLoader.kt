@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.core.Object3D
import info.laht.threekt.loaders.LoadingManager
import org.w3c.xhr.XMLHttpRequest

open external class MTLLoader(
        loadingManager: LoadingManager = definedExternally
) {

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