@file:JsQualifier("THREE")

package org.three.core

import org.three.math.Box3
import org.three.math.Sphere

external class DrawRange {
    var start: Int
    var count: Int
}

external class Group {
    var start: Int
    var count: Int
    var materialIndex: Int
}

open external class BufferGeometry {

    val uuid: String

    var name: String
    var type: String

    var index: Int?
    var attributes: Map<String, dynamic>

    var morphAttributes: Map<String, dynamic>

    var groups: List<Group>

    var boundingBox: Box3?
    var boundingSphere: Sphere?

    var drawRange: DrawRange

}