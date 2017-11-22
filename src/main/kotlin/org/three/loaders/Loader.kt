package org.three.loaders

open external class Loader {

    var onLoadStart: () -> Unit
    var onLoadProgress: () -> Unit
    var onLoadComplete: () -> Unit

}