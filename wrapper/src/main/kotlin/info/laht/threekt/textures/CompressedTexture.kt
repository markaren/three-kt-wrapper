@file:JsQualifier("THREE")

package info.laht.threekt.textures

/**
 * Creates a texture based on data in compressed form, for example from a DDS file.
 *
 * For use with the CompressedTextureLoader.
 */
open external class CompressedTexture: Texture {

     constructor(mipmaps: Array<dynamic>,
                 width: Int,
                 height: Int,
                 format: Int = definedExternally,
                 type: Int,
                 mapping: Int= definedExternally,
                 wrapS: Int = definedExternally,
                 wrapT: Int = definedExternally,
                 magFilter: Int = definedExternally,
                 minFilter: Int = definedExternally,
                 anisotropy: Int = definedExternally)

    /**
     * False by default. Flipping textures does not work for compressed textures.
     */
    override var flipY: Boolean

    /**
     * False by default. Mipmaps can't be generated for compressed textures
     */
    override var generateMipmaps: Boolean

}