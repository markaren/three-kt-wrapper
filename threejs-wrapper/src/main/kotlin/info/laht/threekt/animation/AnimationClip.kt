@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.animation

/**
 * An AnimationClip is a reusable set of keyframe tracks which represent an animation.

For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
 *
 * @param name a name for this clip.
 * @param duration the duration of this clip (in seconds). If a negative value is passed, the duration will be calculated from the passed tracks array.
 * @param tracks an array of KeyframeTracks.
 */
external class AnimationClip(
    name: String,
    duration: Number,
    tracks: Array<KeyFrameTrack>
) {

    companion object {
        /**
         * Parses the animation.hierarchy format and returns an AnimationClip.
         */
        fun parse(json: String): AnimationClip

        /**
         * Takes an AnimationClip and returns a JSON object.
         */
        fun toJSON(clip: AnimationClip): dynamic
    }

    var uuid: String
    var name: String
    var duration: Double
    var tracks: Array<KeyFrameTrack>

    /**
     * Optimizes each track by removing equivalent sequential keys (which are common in morph target sequences).
     */
    fun optimize(): AnimationClip

    /**
     * Sets the duration of the clip to the duration of its longest KeyframeTrack.
     */
    fun resetDuration()

    /**
     * Trims all tracks to the clip's duration.
     */
    fun trim(): AnimationClip

}