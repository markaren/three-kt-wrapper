@file:JsQualifier("THREE")

package org.three.materials

open external class MeshPhysicalMaterial : MeshStandardMaterial {

    var reflectivity: Double

    var clearCoat: Double
    var clearCoatRoughness: Int

    override fun clone() : MeshPhysicalMaterial
    fun copy(source: MeshPhysicalMaterial) : MeshPhysicalMaterial

}

