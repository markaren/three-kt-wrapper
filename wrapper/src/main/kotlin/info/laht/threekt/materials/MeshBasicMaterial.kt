@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Color
import info.laht.threekt.textures.Texture

open external class MeshBasicMaterial : Material {

    var color: Color

    var map: Texture?

    var lightMap: Texture?
    var lightMapIntensity: Double

    var aoMap: Texture
    var aoMapIntensity: Double

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


    override fun clone(): MeshBasicMaterial
    fun copy(source: MeshBasicMaterial): MeshBasicMaterial

}