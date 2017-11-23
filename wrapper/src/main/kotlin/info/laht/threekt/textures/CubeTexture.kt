@file:JsQualifier("THREE")

package info.laht.threekt.textures

import org.w3c.dom.Element

open external class CubeTexture: Texture {

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

}