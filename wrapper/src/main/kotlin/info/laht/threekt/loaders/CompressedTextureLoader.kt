@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import info.laht.threekt.textures.Texture
import org.w3c.xhr.XMLHttpRequest

/**
 * Abstract base class for block based textures loader (dds, pvr, ...).
 * This uses the FileLoader internally for loading files.
 *
 * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
 */
open external class CompressedTextureLoader(
        manager: LoadingManager = definedExternally
) {

    /**
     * The loadingManager the loader is using. Default is DefaultLoadingManager.
     */
    var manager: LoadingManager
    /**
     * The base path from which files will be loaded. See .setPath. Default is undefined.
     */
    var path: String

    /**
     * Begin loading from url and pass the loaded texture to onLoad.
     *
     * @param url the path or URL to the file. This can also be a Data URI.
     * @param onLoad Will be called when load completes. The argument will be the loaded texture.
     * @param onProgress Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .total and .loaded bytes.
     * @param onError Will be called when load errors.
     */
    fun load(url: String,
             onLoad: (Texture) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    /**
     * Set the base path or URL from which to load files.
     * This can be useful if you are loading many textures from the same directory.
     */
    fun setPath(path: String)

}