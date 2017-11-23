@file:JsQualifier("THREE")

package info.laht.threekt.cameras


open external class PerspectiveCamera : Camera {

    constructor(fov: Int,
                aspect: Double,
                near: Number,
                far: Number)

    var fov: Int
    var zoom: Double

    var near: Double
    var far: Double
    var focus: Double

    var aspect: Double
    var view: View

    var filmGauge: Int
    var filmOffset: Int

    fun copy(source: PerspectiveCamera, recursive: Boolean = definedExternally)

    fun setViewOffset(fullwidth: Int, fullHeight: Int, x: Int, y: Int, width: Int, height: Int)
    fun clearViewOffset()
    fun updateProjectionMatrix()


}