@file:JsQualifier("THREE")

package info.laht.threekt.scenes

import info.laht.threekt.core.Object3D

open external class Scene : Object3D {

    var autoUpdate: Boolean

    fun copy(source: Scene, recursive: Boolean) : Scene

}
