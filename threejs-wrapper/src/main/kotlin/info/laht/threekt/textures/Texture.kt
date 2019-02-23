/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.textures

import info.laht.threekt.math.Matrix3
import info.laht.threekt.math.Vector2
import org.w3c.dom.Element

/**
 * Create a texture to apply to a surface or as a reflection or refraction map.
 */
open external class Texture(
    image: Element = definedExternally,
    mapping: Int = definedExternally,
    wrapS: Int = definedExternally,
    wrapT: Int = definedExternally,
    magFilter: Int = definedExternally,
    minFilter: Int = definedExternally,
    format: Int = definedExternally,
    type: Int = definedExternally,
    anisotropy: Int = definedExternally,
    encoding: Int = definedExternally
) {

    companion object {
        var DEFAULT_IMAGE: Element?
        var DEFAULT_MAPPING: Int
    }


    /**
     * This starts at 0 and counts how many times # .needsUpdate is set to true.
     */
    var version: Int

    /**
     * Readonly - unique number for this texture instance.
     */
    val id: Int

    /**
     * UUID of this object instance. This gets automatically assigned, so this shouldn't be edited.
     */
    val uuid: String

    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    var name: String
    /**
     * An image object, typically created using the TextureLoader.load method. This can be any image (e.g., PNG, JPG, GIF, DDS)
     * or video (e.g., MP4, OGG/OGV) type supported by three.js.
     *
     * To use video as a texture you need to have a playing HTML5 video element as a source for your texture image and
     * continuously update this texture as long as video is playing - the VideoTexture class handles this automatically.
     */
    var image: Element

    /**
     * Array of user-specified mipmaps (optional).
     */
    var mipmaps: Array<Element>

    /**
     * How the image is applied to the object. An object type of THREE.UVMapping is the default, where the U,V coordinates are used to apply the map.
    See the texture constants page for other mapping types.
     */
    var mapping: Int

    /**
     * This defines how the texture is wrapped horizontally and corresponds to U in UV mapping.
     * The default is THREE.ClampToEdgeWrapping, where the edge is clamped to the outer edge texels.
     * The other two choices are THREE.RepeatWrapping and THREE.MirroredRepeatWrapping.
     * See the texture constants page for details.
     */
    var wrapS: Int
    /**
     * This defines how the texture is wrapped vertically and corresponds to V in UV mapping.
     * The same choices are available as for # .wrapS .

     * NOTE: tiling of images in textures only functions if image dimensions are powers
     * of two (2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ...) in terms of pixels.
     * Individual dimensions need not be equal, but each must be a power of two. This is a limitation of WebGL, not three.js.
     */
    var wrapT: Int

    /**
     * How the texture is sampled when a texel covers more than one pixel.
     * The default is THREE.LinearFilter, which takes the four closest texels and bilinearly interpolates among them.
     * The other option is THREE.NearestFilter, which uses the value of the closest texel.
     * See the texture constants page for details.
     */
    var magFilter: Int
    /**
     * How the texture is sampled when a texel covers less than one pixel.
     * The default is THREE.LinearMipMapLinearFilter, which uses mipmapping and a trilinear filter.
     *
     * See the texture constants page for all possible choices.
     */
    var minFilter: Int

    /**
     * The number of samples taken along the axis through the pixel that has the highest density of texels.
     * By default, this value is 1. A higher value gives a less blurry result than a basic mipmap, at the cost of more texture samples being used.
     * Use renderer.getMaxAnisotropy() to find the maximum valid anisotropy value for the GPU; this value is usually a power of 2.
     */
    var anisotropy: Int

    /**
     * The default is THREE.RGBAFormat, although the TextureLoader will automatically set this to THREE.RGBFormat for JPG images.
     *
     * See the texture constants page for details of other formats.
     */
    var format: Int
    /**
     * This must correspond to the .format. The default is THREE.UnsignedByteType, which will be used for most texture formats.
     *
     * See the texture constants page for details of other formats.
     */
    var type: Int

    /**
     * How much a single repetition of the texture is offset from the beginning, in each direction U and V.
     * Typical range is 0.0 to 1.0. _Note:_ The offset property is a convenience modifier and only affects the Texture's application
     * to the first set of UVs on a model. If the Texture is used as a map requiring additional UV sets
     * (e.g. the aoMap or lightMap of most stock materials), those UVs must be manually assigned to achieve the desired offset.
     */
    var offset: Vector2
    /**
     * How many times the texture is repeated across the surface, in each direction U and V.
     * If repeat is set greater than 1 in either direction, the corresponding Wrap parameter should
     * also be set to THREE.RepeatWrapping or THREE.MirroredRepeatWrapping to achieve the desired tiling effect.
     * _Note:_ The repeat property is a convenience modifier and only affects the Texture's application to the
     * first set of UVs on a model. If the Texture is used as a map requiring additional UV sets
     * (e.g. the aoMap or lightMap of most stock materials), those UVs must be manually assigned to
     * achieve the desired repetiton.
     */
    var repeat: Vector2
    /**
     * Indicates where the center of rotation is.
     * To rotate around the center point set this value to (0.5, 0.5). Default value is (0.0, 0.0).
     */
    var center: Vector2
    /**
     * How much the texture is rotated around the center point, in radians. Postive values are counter-clockwise. Default is 0.
     */
    var rotation: Double

    /**
     * Whether to update the texture's uv-transform # .matrix based on the .offset , .repeat , and .rotation settings.
     * True by default. Set this to false if you are specifying the uv-transform matrix directly.
     */
    var matrixAutoUpdate: Boolean
    /**
     * The uv-transform matrix for the texture. Updated by the renderer from the texture properties .offset, .repeat, and .rotation
     * when the texture's .matrixAutoUpdate property is true.
     * When .matrixAutoUpdate property is false, this matrix may be set manually. Default is the indentity matrix.
     */
    var matrix: Matrix3

    /**
     * Whether to generate mipmaps (if possible) for a texture. True by default.
     * Set this to false if you are creating mipmaps manually.
     */
    open var generateMipmaps: Boolean
    /**
     * False by default, which is the norm for PNG images.
     * Set to true if the RGB values have been stored premultiplied by alpha.
     */
    var premultiplyAlpha: Boolean
    /**
     * True by default. Flips the image's Y axis to match the WebGL texture coordinate space
     */
    open var flipY: Boolean
    /**
     * 4 by default. Specifies the alignment requirements for the start of each pixel row in memory.
     * The allowable values are 1 (byte-alignment), 2 (rows aligned to even-numbered bytes),
     * 4 (word-alignment), and 8 (rows start on double-word boundaries).
     *
     * See glPixelStorei for more information.
     */
    var unpackAlignment: Int


    /**
     * THREE.LinearEncoding is the default. See the texture constants page for details of other formats.
     *
     * Note that ff this value is changed on a texture after the material has been used, it is necessary to
     * trigger a Material.needsUpdate for this value to be realized in the shader.
     */
    var encoding: Int

    /**
     * Set this to true to trigger an update next time the texture is used. Particularly important for setting the wrap mode.
     */
    var needsUpdate: Boolean

    /**
     * Call EventDispatcher.dispatchEvent with a 'dispose' event type.
     */
    fun dispose()

    /**
     * Transform the uv based on the value of this texture's .repeat, .offset, .wrapS, .wrapT and .flipY properties.
     */
    fun transformUv(uv: Vector2)

    fun clone(): Texture
    fun copy(texture: Texture): Texture

    fun toJSON(meta: String): dynamic

}