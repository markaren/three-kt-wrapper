@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class CylinderGeometry(
        radiusTop: Double,
        radiusBottom: Double,
        height: Double,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Double = definedExternally,
        thetaLength: Double = definedExternally
) : Geometry

open external class CylinderBufferGeometry(
        radiusTop: Double,
        radiusBottom: Double,
        height: Double,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Double = definedExternally,
        thetaLength: Double = definedExternally
) : BufferGeometry