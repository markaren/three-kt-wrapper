@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

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