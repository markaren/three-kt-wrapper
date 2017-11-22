@file:JsQualifier("THREE")

package org.three.loaders

import org.three.textures.Texture
import org.w3c.xhr.XMLHttpRequest

open external class TextureLoader {

    constructor(manager: LoadingManager = definedExternally)

    var crossOrigin: String?

    var manager: LoadingManager

    var path: String

    fun load(url: String,
             onLoad: (Texture) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit,
             onError: () -> Unit) : Texture

}