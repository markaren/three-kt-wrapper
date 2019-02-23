@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

external class CylinderGeometry(
    radiusTop: Number,
    radiusBottom: Number,
    height: Number,
    radialSegments: Int = definedExternally,
    heightSegments: Int = definedExternally,
    openEnded: Boolean = definedExternally,
    thetaStart: Number = definedExternally,
    thetaLength: Number = definedExternally
) : Geometry

external class CylinderBufferGeometry(
    radiusTop: Number,
    radiusBottom: Number,
    height: Number,
    radialSegments: Int = definedExternally,
    heightSegments: Int = definedExternally,
    openEnded: Boolean = definedExternally,
    thetaStart: Number = definedExternally,
    thetaLength: Number = definedExternally
) : BufferGeometry