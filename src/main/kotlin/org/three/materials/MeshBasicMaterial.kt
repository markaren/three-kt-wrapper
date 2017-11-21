@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color

external class MeshBasicMaterial : Material {

    constructor()

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


    override fun clone(): MeshBasicMaterial
    fun copy(source: MeshBasicMaterial): MeshBasicMaterial

}