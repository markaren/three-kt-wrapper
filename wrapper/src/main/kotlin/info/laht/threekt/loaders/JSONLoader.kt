@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material
import org.w3c.xhr.XMLHttpRequest

open external class JSONLoader(
        manager: LoadingManager = definedExternally
) {

    var manager: LoadingManager
    var withCredentials: Boolean

    fun load(url:String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    fun setTexturePath(value: String)

    interface ParsedObject {
        val geometry: BufferGeometry
        val materials: Array<Material>
    }

    fun parse(json: dynamic, texturePath: String) : ParsedObject

}