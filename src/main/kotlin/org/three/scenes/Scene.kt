@file:JsQualifier("THREE")

package org.three.scenes

import org.three.core.Object3D

open external class Scene : Object3D {

    var autoUpdate: Boolean

    fun copy(source: Scene, recursive: Boolean) : Scene

}
