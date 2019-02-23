@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.animation

import info.laht.threekt.core.Object3D

/**
 * The AnimationMixer is a player for animations on a particular object in the scene.
 * When multiple objects in the scene are animated independently, one AnimationMixer may be used for each object.

 * For an overview of the different elements of the three.js animation system see the "Animation System" article
 * in the "Next Steps" section of the manual.
 */
external class AnimationMixer(
    root: Object3D
) {

    var time: Double
    var timeScale: Double

    fun clipAction(clip: AnimationClip, optionalRoot: Object3D = definedExternally): AnimationClip
    fun existingAction(clip: AnimationClip, optionalRoot: Object3D = definedExternally): AnimationClip

    fun getRoot(): Object3D

    fun stopAllAction()

    fun update(deltaTimeInSeconds: Number)

    fun uncacheClip(clip: AnimationClip)

    fun unchacheRoot(root: Object3D)

    fun uncacheAction(clip: AnimationClip, optionalRoot: Object3D)

}