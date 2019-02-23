@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry


external class BoxGeometry(
    width: Number,
    height: Number,
    depth: Number,
    widthSegments: Int = definedExternally,
    heightSegments: Int = definedExternally,
    depthSegments: Int = definedExternally
) : Geometry


external class BoxBufferGeometry(
    width: Number,
    height: Number,
    depth: Number,
    widthSegments: Int = definedExternally,
    heightSegments: Int = definedExternally,
    depthSegments: Int = definedExternally
) : BufferGeometry
