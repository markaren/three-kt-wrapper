
@file:JsQualifier("THREE")

package org.three.materials

import org.three.math.Color
import org.three.textures.Texture

open external class MeshLambertMaterial : Material {

    var color: Color

    var map: Texture?

    var lightMap: Texture?
    var lightMapIntensity: Double

    var aoMap: Texture?
    var aoMapIntensity: Double

    var emissive: Color
    var emissiveIntensity: Double
    var emissiveMap: Texture?

    var specularMap: Texture?

    var alphaMap: Texture?

    var envMap: Texture?
    var combine: Int
    var reflectivity: Double
    var refractionRatio: Double

    var wireframe: Boolean
    var wireframeLinewidth: Double
    var wireframeLinecap: String
    var wireframeLinejoin: String

    var skinning: Boolean
    var morphTargets: Boolean
    var morphNormals: Boolean
    
    override fun clone() : MeshLambertMaterial
    fun copy(material: MeshLambertMaterial) : MeshLambertMaterial
    
}