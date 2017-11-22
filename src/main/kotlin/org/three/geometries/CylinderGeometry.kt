@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

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