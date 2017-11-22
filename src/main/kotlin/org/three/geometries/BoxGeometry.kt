@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

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
