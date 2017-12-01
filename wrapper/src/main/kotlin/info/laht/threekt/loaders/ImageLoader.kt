@file:JsQualifier("THREE")

package info.laht.threekt.loaders

import org.w3c.dom.Element
import org.w3c.xhr.XMLHttpRequest

/**
 * A loader for loading an Image. This uses the FileLoader internally
 * for loading files, and is used internally by the CubeTextureLoader, ObjectLoader and TextureLoader.
 *
 * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
 *
 */
open external class ImageLoader(
        manager: LoadingManager = definedExternally
) {

    /**
     * If set, assigns the crossOrigin attribute of the image to the value of crossOrigin,
     * prior to starting the load. Default is undefined.
     */
    var crossOrigin: String?

    /**
     * The base path from which files will be loaded. See .setPath. Default is undefined.
     */
    var path: String

    /**
     * Begin loading from url and return the image object that will contain the data..
     *
     * @param url the path or URL to the file. This can also be a Data URI.
     * @param onLoad Will be called when load completes. The argument will be the loaded image.
     * @param onProgress Will be called while load progresses. The argument will be the progress event.
     * @param onError Will be called when load errors.
     */
    fun load(url: String,
             onLoad: (Element) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    /**
     * Set the .crossOrigin attribute.
     */
    fun setCrossOrigin(value:String)

    /**
     * Set the base path or URL from which to load files. This can be useful if you are loading many models from the same directory.
     */
    fun setPath(path: String)

}