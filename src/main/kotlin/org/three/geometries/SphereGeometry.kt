@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class SphereGeometry(
        radius: Float,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        phiStart: Float = definedExternally,
        phiLength: Float = definedExternally,
        thetaStart: Float = definedExternally,
        thetaLength: Float = definedExternally
): Geometry

open external class SphereBufferGeometry(
        radius: Float,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        phiStart: Float = definedExternally,
        phiLength: Float = definedExternally,
        thetaStart: Float = definedExternally,
        thetaLength: Float = definedExternally
): BufferGeometry