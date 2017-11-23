@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import info.laht.threekt.materials.Material
import org.w3c.xhr.XMLHttpRequest

open external class MaterialLoader {

    fun load(url: String,
             onLoad: (Material) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit,
             onError: () -> Unit)

}