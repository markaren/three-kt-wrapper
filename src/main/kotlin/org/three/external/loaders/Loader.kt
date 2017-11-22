package org.three.external.loaders

import org.three.core.Object3D

external abstract class Loader {
    fun load(url: String,
             onLoad: (Object3D) -> Unit,
             onProgress: () -> Unit = definedExternally,
             onError: () -> Unit = definedExternally)
}