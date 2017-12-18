
@file:JsQualifier("THREE")

package info.laht.threekt.loaders

/**
 * Base class for implementing loaders.
 */
open external class Loader {

    object Handlers {
        fun add(regex: String, loader: Loader)
        fun get(file: dynamic) : Loader
    }

    var onLoadStart: () -> Unit
    var onLoadProgress: () -> Unit
    var onLoadComplete: () -> Unit

    var crossOrigin: String?

}