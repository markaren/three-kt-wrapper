@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class BoxGeometry(
        width: Number,
        height: Number,
        depth: Number,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : Geometry

open external class BoxBufferGeometry(
        width: Number,
        height: Number,
        depth: Number,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : BufferGeometry
