@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class TorusGeometry : Geometry {

    constructor(radius: Number = definedExternally,
                tube: Number = definedExternally,
                radialSegments: Int = definedExternally,
                tubularSegments: Int = definedExternally,
                arc: Number = definedExternally)

}

open external class TorusBufferGeometry : BufferGeometry {

    constructor(radius: Number = definedExternally,
                tube: Number = definedExternally,
                radialSegments: Int = definedExternally,
                tubularSegments: Int = definedExternally,
                arc: Number = definedExternally)

}