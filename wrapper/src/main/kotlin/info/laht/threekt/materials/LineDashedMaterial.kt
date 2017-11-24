@file:JsQualifier("THREE")

package info.laht.threekt.materials

open external class LineDashedMaterial : LineBasicMaterial {

    var scale : Number
    var dashSize: Number
    var gapSize : Number

    override fun clone() : LineDashedMaterial
    fun copy(lineDashedMaterial: LineDashedMaterial) : LineDashedMaterial

}