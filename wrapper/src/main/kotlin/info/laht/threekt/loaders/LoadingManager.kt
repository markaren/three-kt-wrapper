@file:JsQualifier("THREE")

package info.laht.threekt.loaders

external object DefaultLoadingManager: LoadingManager

/**
 * Handles and keeps track of loaded and pending data. A default global instance of this class is created and
 * used by loaders if not supplied manually - see DefaultLoadingManager.
 *
 * In general that should be sufficient, however there are times when it can be useful to have
 * seperate loaders - for example if you want to show seperate loading bars for objects and textures.
 */
open external class LoadingManager {

    constructor(onLoad: () -> Unit,
                onProgress: () -> Unit = definedExternally,
                onError: () -> Unit = definedExternally)

    var onStart: () -> Unit
    var onLoad: () -> Unit
    var onProgress: () -> Unit
    var onError: () -> Unit


}