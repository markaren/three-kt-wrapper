@file:JsQualifier("THREE")

package org.three.loaders

external object DefaultLoadingManager: LoadingManager

open external class LoadingManager {

    constructor(onLoad: () -> Unit,
                onProgress: () -> Unit = definedExternally,
                onError: () -> Unit = definedExternally)

    var onStart: () -> Unit
    var onLoad: () -> Unit
    var onProgress: () -> Unit
    var onError: () -> Unit


}