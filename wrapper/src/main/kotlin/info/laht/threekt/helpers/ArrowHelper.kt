@file:JsQualifier("THREE")

package info.laht.threekt.helpers

import info.laht.threekt.core.Object3D
import info.laht.threekt.math.Color
import info.laht.threekt.math.Vector3
import info.laht.threekt.objects.Line
import info.laht.threekt.objects.Mesh

open external class ArrowHelper(
        dir: Vector3,
        origin: Vector3,
        length: Number,
        color: Int = definedExternally,
        headLength: Number = definedExternally,
        headWidth: Number = definedExternally
) : Object3D {

    var line: Line

    var cone: Mesh

    fun setDirection(dir: Vector3)
    fun setLength(length: Number, headLength: Number, headWidth: Number)

    fun setColor(color: Color)

}