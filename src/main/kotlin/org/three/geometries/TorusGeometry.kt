@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

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