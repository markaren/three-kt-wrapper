@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class BoxGeometry : Geometry {

    constructor(width: Double, height: Double, depth: Double)
    constructor(width: Double, height: Double, depth: Double, widthSegments: Int, heightSegments:Int, depthSegments:Int)

}

open external class BoxBufferGeometry : BufferGeometry {

    constructor(width: Double, height: Double, depth: Double)
    constructor(width: Double, height: Double, depth: Double, widthSegments: Int, heightSegments:Int, depthSegments:Int)

}