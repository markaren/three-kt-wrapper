@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Color
import info.laht.threekt.math.Vector2
import info.laht.threekt.textures.Texture

open external class MeshPhongMaterial : Material {

    var color: Color
    var specular: Color
    var shininess: Double

    var map: Texture?

    var lightMap: Texture?
    var lightMapIntensity: Double

    var aoMap: Texture?
    var aoMapIntensity: Double

    var emissive: Color
    var emissiveIntensity: Double
    var emissiveMap: Texture?

    var bumpMap: Texture?
    var bumpScale: Double

    var normalMap: Texture?
    var normalScale: Vector2

    var displacementMap: Texture?
    var displacementScale: Double
    var displacementBias: Double

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

    override fun clone() : MeshPhongMaterial
    fun copy(source: MeshPhongMaterial) : MeshPhongMaterial


}

