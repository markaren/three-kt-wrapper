package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry
import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector3

/**
 * Creates a tube that extrudes along a 3d curve.
 */
external class TubeGeometry(

    path: Curve<Vector3>,
    tubularSegments: Int = definedExternally,
    radius: Number = definedExternally,
    radiusSegments: Int = definedExternally,
    closed: Boolean = definedExternally

) : Geometry {

    var tangents: Array<Vector3>
    var normals: Array<Vector3>
    var binormals: Array<Vector3>

}

/**
 * Creates a tube that extrudes along a 3d curve.
 */
external class TubeBufferGeometry(

    path: Curve<Vector3>,
    tubularSegments: Int = definedExternally,
    radius: Number = definedExternally,
    radiusSegments: Int = definedExternally,
    closed: Boolean = definedExternally

) : BufferGeometry {

    val parameters: dynamic

    val tangents: Array<Vector3>
    val normals: Array<Vector3>
    val binormals: Array<Vector3>

}