@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color

@JsName("MeshBasicMaterial")
open external class MeshBasicMaterialProxy : MaterialProxy {

    protected constructor()
    protected constructor(params: dynamic)

    var color: Color

    var combine: Int
    var reflectivity: Number
    var refractionRatio: Double

    var wireframe: Boolean
    var wireframeLinewidth: Number
    var wireframeLinecap: String
    var wireframeLinejoin: String

    var skinning: Boolean
    var morphTargets: Boolean


    override fun clone(): MeshBasicMaterialProxy
    fun copy(source: MeshBasicMaterialProxy): MeshBasicMaterialProxy

}