@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class PlaneGeometry(

        width: Float,
        height: Float,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally

) : Geometry

open external class PlaneBufferGeometry(

        width: Float,
        height: Float,
        widthSegments: Int = definedExternally,
        heightSegments: Int = definedExternally

) : BufferGeometry