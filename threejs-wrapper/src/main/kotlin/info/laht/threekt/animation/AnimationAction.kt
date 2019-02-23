@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.animation

import info.laht.threekt.core.Object3D

external class AnimationAction(
    mixer: AnimationMixer,
    clip: AnimationClip,
    localRoot: Object3D
) {

    /**
     * Setting enabled to false disables this action, so that it has no impact. Default is true.
     *
     * When the action is re-enabled, the animation continues from its current time
     * (setting enabled to false doesn't reset the action).
     *
     * Note: Setting enabled to true doesn’t automatically restart the animation.
     * Setting enabled to true will only restart the animation immediately if the following condition
     * is fulfilled: paused is false, this action has not been deactivated in the meantime
     * (by executing a stop or reset command), and neither weight nor timeScale is 0.
     */
    var enabled: Boolean

    /**
     * The looping mode (can be changed with setLoop). Default is THREE.LoopRepeat (with an infinite number of repetitions)
     */
    var loop: Int

    /**
     * Setting paused to true pauses the execution of the action by setting the effective time scale to 0. Default is false.
     */
    var paused: Boolean

    var repetitions: Int

    var time: Double

    var timeScale: Double

    /**
     * The degree of influence of this action (in the interval [0, 1]).
     * Values between 0 (no impact) and 1 (full impact) can be used to blend between several actions. Default is 1.
     *
     * Properties/methods concerning weight are: crossFadeFrom, crossFadeTo, enabled, fadeIn, fadeOut,
     * getEffectiveWeight, setEffectiveWeight, stopFading.
     */
    var weight: Double

    /**
     * Enables smooth interpolation without separate clips for start, loop and end. Default is true.
     */
    var zeroSlopeAtEnd: Boolean

    /**
     * Enables smooth interpolation without separate clips for start, loop and end. Default is true.
     */
    var zeroSlopeAtStart: Boolean


    // State & Scheduling

    fun play(): AnimationAction

    fun stop(): AnimationAction

    fun reset(): AnimationAction

    fun isRunning(): Boolean

    // return true when play has been called
    fun isScheduled(): Boolean

    fun startAt(time: Number): AnimationAction
    fun setLoop(mode: Int, repetitions: Int): AnimationAction

    // Weight

    // set the weight stopping any scheduled fading
    // although .enabled = false yields an effective weight of zero, this
    // method does *not* change .enabled, because it would be confusing
    fun setEffectiveWeight(weight: Number)

    // return the weight considering fading and .enabled
    fun getEffectiveWeight()

    fun fadeIn(duration: Number): AnimationAction

    fun fadeOut(duration: Number): AnimationAction

    fun crossFadeFrom(fadeOutAction: AnimationAction, duration: Number, warp: Boolean)

    fun crossFadeTo(fadeInAction: AnimationAction, duration: Number, warp: Boolean)

    fun stopFading(): AnimationAction

    // Time Scale Control

    // set the time scale stopping any scheduled warping
    // although .paused = true yields an effective time scale of zero, this
    // method does *not* change .paused, because it would be confusing
    fun setEffectiveTimeScale(timeScale: Number): AnimationAction

    // return the time scale considering warping and .paused
    fun getEffectiveTimeScale(): Double

    fun setDuration(duration: Number): AnimationAction

    fun syncWith(action: AnimationAction)

    fun halt(duration: Number): AnimationAction

    fun warp(startTimeScale: Number, endTimeScale: Number, duration: Number): AnimationAction

    fun stopWarping(): AnimationAction

    // Object Accessors

    fun getMixer(): AnimationMixer

    fun getClip(): AnimationClip

    fun getRoot(): Object3D


}