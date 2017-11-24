package info.laht.threekt.external.objects

import info.laht.threekt.math.Vector3
import info.laht.threekt.textures.Texture

data class WaterOptions(

        val textureWidth: Int? = undefined,
        val textureHeight: Int? = undefined,

        val clipBias: Number? = undefined,
        val alpha: Number? = undefined,
        val time: Number? = undefined,
        val waterNormals: Texture? = undefined,
        val sunDirection: Vector3? = undefined,
        val sunColor: Int? = undefined,
        val waterColor: Int? = undefined,
        val eye: Vector3? = undefined,
        val distortionScale: Number? = undefined,
        val side: Int? = undefined,
        val fog: Boolean? = undefined

)