@file:JsQualifier("THREE")

package org.three.loaders

import org.three.materials.Material
import org.w3c.xhr.XMLHttpRequest

open external class MaterialLoader {

    fun load(url: String,
             onLoad: (Material) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit,
             onError: () -> Unit)

}