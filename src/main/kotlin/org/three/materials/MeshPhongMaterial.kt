@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color

open external class MeshPhongMaterial : Material {

    var color: Color
    var specular: Color
    var shininess: Double

    var wireframe: Boolean
    var wireframeLinewidth: Double
    var wireframeLinecap: String
    var wireframeLinejoin: String

    var skinning: Boolean
    var morphTargets: Boolean
    var morphNormals: Boolean

    override fun clone() : MeshPhongMaterial
    fun copy(source: MeshPhongMaterial) : MeshPhongMaterial


}

