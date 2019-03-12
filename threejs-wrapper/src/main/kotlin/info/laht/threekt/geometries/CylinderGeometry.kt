@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class CylinderGeometry(
        radiusTop: Number,
        radiusBottom: Number,
        height: Number,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Number = definedExternally,
        thetaLength: Number = definedExternally
) : Geometry

open external class CylinderBufferGeometry(
        radiusTop: Number,
        radiusBottom: Number,
        height: Number,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Number = definedExternally,
        thetaLength: Number = definedExternally
) : BufferGeometry