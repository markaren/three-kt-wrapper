@file:JsQualifier("THREE")

package info.laht.threekt.external.controls

import info.laht.threekt.core.Object3D
import org.w3c.dom.Node

open external class FlyControls(
        `object`: Object3D,
        domElement: Node = definedExternally
) {

    var `object`: Object3D
    var domElement: Node

    // API

    var movementSpeed: Double
    var rollSpeed: Double

    var dragToLook: Boolean
    var autoForward: Boolean


    fun update(delta: Number)

    fun dispose()

}