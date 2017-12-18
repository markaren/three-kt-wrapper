@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material
import org.w3c.xhr.XMLHttpRequest

/**
 * A loader for loading objects in JSON format. This uses the FileLoader internally for loading files.
 *
 * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
 */
open external class JSONLoader(
        manager: LoadingManager = definedExternally
) {

    /**
     * The loadingManager the loader is using. Default is DefaultLoadingManager.
     */
    var manager: LoadingManager
    /**
     * Whether the XMLHttpRequest uses credentials. Default is false.
     */
    var withCredentials: Boolean

    /**
     * Begin loading from url and pass the JSON to onLoad.
     * @param url the path or URL to the file. This can also be a Data URI..
     * @param onLoad Will be called when load completes. The argument will be the loaded text response.
     * @param onProgress Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .total and .loaded bytes.
     * @param onError Will be called when load errors.
     */
    fun load(url:String,
             onLoad: (Object3D) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    /**
     * Set the base path or URL from which to load files. This can be useful if you are loading many files from the same directory.
     */
    fun setTexturePath(value: String)

    interface ParsedObject {
        val geometry: BufferGeometry
        val materials: Array<Material>
    }

    /**
     * Parse a JSON structure and return an object containing the parsed geometry and materials.
     * @param json JSON object to parse.
     * @param texturePath Base path for textures.
     */
    fun parse(json: Any, texturePath: String) : ParsedObject

}