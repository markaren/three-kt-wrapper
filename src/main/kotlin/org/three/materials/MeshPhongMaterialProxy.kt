@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color

@JsName("MeshPhongMaterial")
open external class MeshPhongMaterialProxy : MaterialProxy {

    protected constructor()
    protected constructor(params: dynamic)

    var color: Color
    var specular: Color
    var shininess: Float

    var wireframe: Boolean
    var wireframeLinewidth: Float
    var wireframeLinecap: String
    var wireframeLinejoin: String

    var skinning: Boolean
    var morphTargets: Boolean
    var morphNormals: Boolean

    override fun clone() : MeshPhongMaterialProxy
    fun copy(source: MeshPhongMaterialProxy) : MeshPhongMaterialProxy


}

