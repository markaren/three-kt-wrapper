@file:JsQualifier("THREE")

package org.three.materials.phong

import org.three.materials.MaterialProxy
import org.three.math.Color

@JsName("MeshPhongMaterial")
open external class MeshPhongMaterialProxy : MaterialProxy {

    protected constructor()
    protected constructor(params: dynamic)

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

    override fun clone() : MeshPhongMaterialProxy
    fun copy(source: MeshPhongMaterialProxy) : MeshPhongMaterialProxy


}

