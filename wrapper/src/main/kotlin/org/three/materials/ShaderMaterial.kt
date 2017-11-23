@file:JsQualifier("THREE")

package org.three.materials

open external class ShaderMaterial : Material {

    var vertexShader: String
    var fragmentShader: String
    var linewidth: Double

    var wireframe: Boolean
    var wireframeLinewidth: Double

    var clipping: Boolean

    var skinning: Boolean
    var morphTargets: Boolean
    var morphNormals: Boolean
    
}