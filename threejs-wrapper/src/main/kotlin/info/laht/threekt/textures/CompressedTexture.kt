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

/**
 * Creates a texture based on data in compressed form, for example from a DDS file.
 *
 * For use with the CompressedTextureLoader.
 */
external class CompressedTexture(
    mipmaps: Array<dynamic>,
    width: Int,
    height: Int,
    format: Int = definedExternally,
    type: Int,
    mapping: Int = definedExternally,
    wrapS: Int = definedExternally,
    wrapT: Int = definedExternally,
    magFilter: Int = definedExternally,
    minFilter: Int = definedExternally,
    anisotropy: Int = definedExternally
) : Texture {

    /**
     * False by default. Flipping textures does not work for compressed textures.
     */
    override var flipY: Boolean

    /**
     * False by default. Mipmaps can't be generated for compressed textures
     */
    override var generateMipmaps: Boolean

}