@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import info.laht.threekt.materials.Material
import info.laht.threekt.textures.Texture
import org.w3c.xhr.XMLHttpRequest

open external class MaterialLoader {

    fun load(url: String,
             onLoad: (Material) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    fun parse(json: String) : Material

    fun setTextures(textures: Map<String, Texture>)

}