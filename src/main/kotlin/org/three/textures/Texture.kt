@file:JsQualifier("THREE")

package org.three.textures

import org.three.math.Matrix3
import org.three.math.Vector2
import org.w3c.dom.Element

open external class Texture {

    companion object {
        var DEFAULT_IMAGE: Element?
        var DEFAULT_MAPPING: Int
    }

    constructor(image: Element = definedExternally,
                mapping: Int = definedExternally,
                wrapS: Int = definedExternally,
                wrapT: Int = definedExternally,
                magFilter: Int = definedExternally,
                minFilter: Int = definedExternally,
                format: Int = definedExternally,
                type: Int = definedExternally,
                anisotropy: Int = definedExternally,
                encoding: Int = definedExternally)

    var name: String
    var image: Element

    var mapping: Int

    var wrapS: Int
    var wrapT: Int

    var magFilter: Int
    var minFilter: Int

    var anisotropy: Int

    var format: Int
    var type: Int

    var offset: Vector2
    var repeat: Vector2
    var center: Vector2
    var rotation: Double

    var matrixAutoUpdate: Boolean
    var matrix: Matrix3

    var generateMipmaps: Boolean
    var premultiplyAlpha: Boolean
    var flipY: Boolean
    var unpackAlignment: Int

    var version: Int

    fun clone() : Texture
    fun copy(texture: Texture) : Texture

    fun toJSON(meta: String) : String
    
}