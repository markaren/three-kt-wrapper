@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class ConeGeometry(
        radius: Number = definedExternally,
        height: Number = definedExternally,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Boolean = definedExternally,
        thetaLength: Boolean = definedExternally
) : Geometry

open external class ConeBufferGeometry(
        radius: Number = definedExternally,
        height: Number = definedExternally,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Boolean = definedExternally,
        thetaLength: Boolean = definedExternally
) : BufferGeometry