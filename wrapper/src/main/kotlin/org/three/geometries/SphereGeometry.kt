@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class SphereGeometry(
        radius: Double,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        phiStart: Double = definedExternally,
        phiLength: Double = definedExternally,
        thetaStart: Double = definedExternally,
        thetaLength: Double = definedExternally
): Geometry

open external class SphereBufferGeometry(
        radius: Double,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally,
        phiStart: Double = definedExternally,
        phiLength: Double = definedExternally,
        thetaStart: Double = definedExternally,
        thetaLength: Double = definedExternally
): BufferGeometry