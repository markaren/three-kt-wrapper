@file:JsQualifier("THREE")

package info.laht.threekt.materials

open external class ShaderMaterial : Material {



    var defines: dynamic
    var uniforms: dynamic

    var vertexShader: String
    var fragmentShader: String
    var linewidth: Double

    var wireframe: Boolean
    var wireframeLinewidth: Double

    var clipping: Boolean

    var skinning: Boolean
    var morphTargets: Boolean
    var morphNormals: Boolean


    interface Extensions {
        var derivatives: Boolean
        var fragDepth: Boolean
        var drawBuffers: Boolean
        var shaderTextureLOD: Boolean
    }


    var extensions: Extensions

    var index0AttributeName: String

    override  fun clone() : ShaderMaterial
    fun copy(material: ShaderMaterial) : ShaderMaterial

    
}