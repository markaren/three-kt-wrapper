@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry

external class TorusGeometry(
    radius: Number = definedExternally,
    tube: Number = definedExternally,
    radialSegments: Int = definedExternally,
    tubularSegments: Int = definedExternally,
    arc: Number = definedExternally
) : Geometry

external class TorusBufferGeometry(
    radius: Number = definedExternally,
    tube: Number = definedExternally,
    radialSegments: Int = definedExternally,
    tubularSegments: Int = definedExternally,
    arc: Number = definedExternally
) : BufferGeometry