package info.laht.threekt.math

open external class Frustrum {

    constructor()
    constructor(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane)

    fun set(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane) : Frustrum

    fun clone()  : Frustrum
    fun copy(frustrum: Frustrum) : Frustrum

}