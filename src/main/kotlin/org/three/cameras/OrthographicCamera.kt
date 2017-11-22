@file:JsQualifier("THREE")

package org.three.cameras

open external class OrthographicCamera(
        varleft: Int,
        right: Int,
        top: Int,
        bottom: Int,
        near: Double = definedExternally,
        far: Double = definedExternally
) : Camera {

    var zoom: Int
    var view: View

    var left: Int
    var right: Int
    var top: Int
    var bottom: Int

    var near: Double
    var far: Double

    fun copy(camera: OrthographicCamera) : OrthographicCamera

    fun setViewOffset(fullwidth: Int, fullHeight: Int, x: Int, y: Int, width: Int, height: Int)
    fun clearViewOffset()
    fun updateProjectionMatrix()



}