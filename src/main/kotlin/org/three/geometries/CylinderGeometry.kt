@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class CylinderGeometry(
        radiusTop: Float,
        radiusBottom: Float,
        height: Float,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Float = definedExternally,
        thetaLength: Float = definedExternally
) : Geometry

open external class CylinderBufferGeometry(
        radiusTop: Float,
        radiusBottom: Float,
        height: Float,
        radialSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        openEnded: Boolean = definedExternally,
        thetaStart: Float = definedExternally,
        thetaLength: Float = definedExternally
) : BufferGeometry