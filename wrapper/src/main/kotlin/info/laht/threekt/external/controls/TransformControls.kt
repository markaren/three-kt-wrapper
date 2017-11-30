package info.laht.threekt.external.controls

import info.laht.threekt.core.Object3D
import org.w3c.dom.Node

open external class TransformControls(
        `object`: Object3D,
        domElement: Node = definedExternally
) : Object3D {

    var `object`: Object3D
    var domElement: Node

    fun setSpace(space: String)
    fun setTranslationSnap(snap: Number)
    fun setRotationSnap(snap: Number)
    fun setMode(mode: String)
    fun setSize(size: Number)

    fun update()
    fun addEventListener(event: String, listener: () -> Unit)

}