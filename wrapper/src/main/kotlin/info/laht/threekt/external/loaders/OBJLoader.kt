@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.core.Object3D
import info.laht.threekt.objects.Mesh
import org.w3c.xhr.XMLHttpRequest

open external class OBJLoader {

    fun load(url: String,
             onLoad: (Mesh) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)

    fun setPath(value: String)

    fun parse(text: String) : Object3D

}
