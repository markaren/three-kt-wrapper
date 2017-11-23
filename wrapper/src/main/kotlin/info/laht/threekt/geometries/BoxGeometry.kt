@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class BoxGeometry(
        width: Double,
        height: Double,
        depth: Double,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : Geometry

open external class BoxBufferGeometry(
        width: Double,
        height: Double,
        depth: Double,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : BufferGeometry
