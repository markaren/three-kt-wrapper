@file:JsQualifier("THREE")

package info.laht.threekt.external.exporters

import info.laht.threekt.core.Object3D
import org.khronos.webgl.DataView

external class STLExporter {

    fun parse(scene: Object3D) : String

}

external class STLBinaryExporter {

    fun parse(scene: Object3D) : DataView

}