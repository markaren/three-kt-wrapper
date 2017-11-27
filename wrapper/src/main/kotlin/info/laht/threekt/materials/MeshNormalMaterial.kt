@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.math.Vector2
import info.laht.threekt.textures.Texture

open external class MeshNormalMaterial : Material {

    var bumpMap : Texture?
    var bumpScale : Texture?

    var normalMap : Texture?
    var normalScale : Vector2

    var displacementMap : Texture?
    var displacementScale : Double
    var displacementBias : Double

    var wireframe : Boolean
    var wireframeLinewidth : Double

    var skinning : Boolean
    var morphTargets : Boolean
    var morphNormals : Boolean

    override fun clone() : MeshNormalMaterial
    fun copy(material: MeshNormalMaterial) : MeshNormalMaterial


}