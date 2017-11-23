package info.laht.threekt.geometries

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Geometry
import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector3

open external class TubeGeometry(

        path: Curve<*>,
        tubularSegments: Int,
        radius: Number,
        radiusSegments: Int,
        closed: Boolean

) : Geometry {

    var tangents: Array<Vector3>
    var normals: Array<Vector3>
    var binormals: Array<Vector3>

}

open external class TubeBufferGeometry(

        path: Curve<*>,
        tubularSegments: Int,
        radius: Number,
        radiusSegments: Int,
        closed: Boolean

) : BufferGeometry {

    var tangents: Array<Vector3>
    var normals: Array<Vector3>
    var binormals: Array<Vector3>

}