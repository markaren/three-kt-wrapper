@file:JsQualifier("THREE")

package org.three.extras

import org.three.core.BufferGeometry
import org.three.core.Group
import org.three.core.Object3D
import org.three.materials.Material
import org.three.scenes.Scene

external object SceneUtils {

    fun createMultiMaterialObject(geometry: BufferGeometry, materials: List<Material>) : Group

    fun detach(child: Object3D, parent: Object3D, scene: Scene)

    fun attach(child: Object3D, parent: Object3D, scene: Scene)

}