@file:JsQualifier("THREE")

package info.laht.threekt.extras

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Group
import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material
import info.laht.threekt.scenes.Scene

external object SceneUtils {

    fun createMultiMaterialObject(geometry: BufferGeometry, materials: List<Material>) : Group

    fun detach(child: Object3D, parent: Object3D, scene: Scene)

    fun attach(child: Object3D, parent: Object3D, scene: Scene)

}