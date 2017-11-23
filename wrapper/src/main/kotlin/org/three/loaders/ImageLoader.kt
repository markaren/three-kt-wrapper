@file:JsQualifier("THREE")

package org.three.loaders

import org.w3c.dom.Element
import org.w3c.xhr.XMLHttpRequest

open external class ImageLoader {

    constructor(manager: LoadingManager = definedExternally)

    var crossOrigin: String

    fun load(url: String,
             onLoad: (Element) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit,
             onError: (dynamic) -> Unit)

}