@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.core.Object3D
import info.laht.threekt.loaders.LoadingManager
import org.w3c.xhr.XMLHttpRequest

open external class BabylonLoader(
        manager: LoadingManager = definedExternally
) {

    /**
     * Begin loading from url and call onLoad with the parsed response content.
     */
    fun load(url: String,
        onLoad: (Object3D) -> Unit,
        onProgress: (XMLHttpRequest) -> Unit = definedExternally,
        onError: (dynamic) -> Unit = definedExternally)

    /**
     * Parse a JSON structure and return an object or a scene.
     * Found objects are converted to Mesh with a BufferGeometry and a default MeshPhongMaterial.
     * Lights are parsed accordingly.
     */
    fun parse(json: String) : Object3D

}