@file:JsQualifier("THREE")

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

open external class PlaneGeometry(

        width: Number,
        height: Number,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally

) : Geometry

open external class PlaneBufferGeometry(

        width: Number,
        height: Number,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally

) : BufferGeometry