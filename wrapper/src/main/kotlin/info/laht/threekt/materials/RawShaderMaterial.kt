@file:JsQualifier("THREE")

package info.laht.threekt.materials

open external class RawShaderMaterial : ShaderMaterial {

    override fun clone() : RawShaderMaterial
    fun copy(material: RawShaderMaterial) : RawShaderMaterial

}