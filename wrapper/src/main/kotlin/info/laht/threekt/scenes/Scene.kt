@file:JsQualifier("THREE")

package info.laht.threekt.scenes

import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material

/**
 * Scenes allow you to set up what and where is to be rendered by three.js.
 * This is where you place objects, lights and cameras.
 */
open external class Scene : Object3D {

    /**
     * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
     */
    var fog: dynamic

    /**
     * If not null, it will force everything in the scene to be rendered with that material. Default is null.
     */
    var overideMaterial: Material

    /**
     * Default is true. If set, then the renderer checks every frame if the scene and its objects needs matrix updates.
     * When it isn't, then you have to maintain all matrices in the scene yourself.
     */
    var autoUpdate: Boolean
    /**
     * If not null, sets the background used when rendering the scene, and is always rendered first.
     * Can be set to a Color which sets the clear color, a Texture covering the canvas, or a CubeTexture. Default is null.
     */
    var background: dynamic

    fun copy(source: Scene, recursive: Boolean = definedExternally) : Scene

}
