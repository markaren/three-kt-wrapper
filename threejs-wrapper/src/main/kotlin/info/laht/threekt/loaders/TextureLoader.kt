/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.loaders

import info.laht.threekt.textures.Texture
import org.w3c.xhr.XMLHttpRequest

/**
 * Class for loading a texture. This uses the ImageLoader internally for loading files.
 */
external class TextureLoader {

    constructor(manager: LoadingManager = definedExternally)

    /**
     * If set, assigns the crossOrigin attribute of the image to the value of crossOrigin,
     * prior to starting the load. Default is undefined.
     */
    var crossOrigin: String?

    /**
     * The loadingManager the loader is using. Default is DefaultLoadingManager.
     */
    var manager: LoadingManager

    /**
     * The base path from which files will be loaded. See .setPath. Default is undefined.
     */
    var path: String?

    /**
     * Begin loading from the given URL and pass the fully loaded texture to onLoad.
     * The method also returns a new texture object which can directly be used for material creation.
     * If you do it this way, the texture may pop up in your scene once the respective loading process is finished.
     *
     * @param url the path or URL to the file. This can also be a Data URI.
     * @param onLoad Will be called when load completes. The argument will be the loaded texture.
     * @param onProgress Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .total and .loaded bytes.
     * @param onError Will be called when load errors.
     */
    fun load(
        url: String,
        onLoad: (Texture) -> Unit,
        onProgress: (XMLHttpRequest) -> Unit = definedExternally,
        onError: (dynamic) -> Unit = definedExternally
    ): Texture

    /**
     * Set the .crossOrigin attribute.
     */
    fun setCrossOrigin(value: String)

    /**
     * Set the base path or URL from which to load files. This can be useful if you are loading many models from the same directory.
     */
    fun setPath(path: String)


}