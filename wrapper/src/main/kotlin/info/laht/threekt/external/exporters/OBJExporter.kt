@file:JsQualifier("THREE")

package info.laht.threekt.external.exporters

import info.laht.threekt.core.Object3D

external class OBJExporter {

    fun parse(`object`: Object3D): String

}
