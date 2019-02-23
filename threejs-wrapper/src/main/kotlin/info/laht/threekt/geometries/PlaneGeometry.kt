@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

external class PlaneGeometry(

    width: Number,
    height: Number,
    widthSegments: Int = definedExternally,
    heightSegments: Int = definedExternally

) : Geometry

external class PlaneBufferGeometry(

    width: Number,
    height: Number,
    widthSegments: Int = definedExternally,
    heightSegments: Int = definedExternally

) : BufferGeometry