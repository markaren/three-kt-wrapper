@file:JsQualifier("THREE")

package info.laht.threekt.materials

open external class LineDashedMaterial : LineBasicMaterial {

    var scale : Double
    var dashSize: Double
    var gapSize : Double

    override fun clone() : LineDashedMaterial
    fun copy(lineDashedMaterial: LineDashedMaterial) : LineDashedMaterial

}