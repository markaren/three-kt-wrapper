@file:JsQualifier("THREE")

package info.laht.threekt.materials

import info.laht.threekt.textures.Texture

open external class MeshDepthMaterial : Material {

    var depthPacking : Int

    var skinning : Boolean
    var morphTargets : Boolean

    var map : Texture?

    var alphaMap : Texture?

    var displacementMap : Texture?
    var displacementScale : Double
    var displacementBias : Double

    var wireframe : Boolean
    var wireframeLinewidth : Double


    override fun clone() : MeshDepthMaterial
    fun copy(material: MeshDepthMaterial) : MeshDepthMaterial

    
}