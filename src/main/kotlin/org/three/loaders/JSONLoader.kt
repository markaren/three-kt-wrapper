@file:JsQualifier("THREE")

package org.three.loaders

import org.three.core.Object3D
import org.w3c.xhr.XMLHttpRequest

open external class JSONLoader {

    fun load(url:String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit,
             onError: (dynamic) -> Unit)

}