@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class TorusGeometry : Geometry {

    constructor(radius: Double = definedExternally,
                tube: Double = definedExternally,
                radialSegments: Int = definedExternally,
                tubularSegments: Int = definedExternally,
                arc: Double = definedExternally)

}

open external class TorusBufferGeometry : BufferGeometry {

    constructor(radius: Double = definedExternally,
                tube: Double = definedExternally,
                radialSegments: Int = definedExternally,
                tubularSegments: Int = definedExternally,
                arc: Double = definedExternally)

}