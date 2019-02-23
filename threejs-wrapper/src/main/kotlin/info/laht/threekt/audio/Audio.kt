@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.audio

/**
 * Create a non-positional ( global ) audio object.
 *
 * This uses the Web Audio API.
 */
open external class Audio(listener: AudioListener) {

    /**
     * Whether to start playback automatically. Default is false.
     */
    var autoPlay: Boolean
    /**
     * The AudioContext of the listener given in the constructor.
     */
    var context: dynamic
    /**
     * Whether the audio is currently playing. Default is empty array.
     */
    var filters: Array<dynamic>
    /**
     * A GainNode created using AudioContext.createGain().
     */
    var gain: dynamic

    /**
     * Whether playback can be controlled using the play(), pause() etc. methods. Default is true.
     */
    var hasPlaybackControl: Boolean
    /**
     * Speed of playback. Default is 1.
     */
    var playbackRate: Double

    /**
     * Whether the audio is currently playing.
     */
    var isPlaying: Boolean

    /**
     * The time at which the sound should begin to play. Same as the when paramter of AudioBufferSourceNode.start(). Default is 0.
     */
    var startTime: Double

    /**
     * Type of the audio source. Default is string 'empty'.
     */
    var sourceType: String

    /**
     * Return the gainNode.
     */
    open fun getOutput(): dynamic

    /**
     * Setup the source to the audioBuffer, and sets sourceType to 'audioNode'.
     * Also sets hasPlaybackControl to false.
     */
    fun setNodeSource(audioNode: dynamic): Audio

    /**
     * Setup the source to the audioBuffer, and sets sourceType to 'buffer'.
     * If autoplay, also starts playback.
     */
    fun setBuffer(audioBuffer: dynamic): Audio

    /**
     * If hasPlaybackControl is true, starts playback.
     */
    fun play(): Audio

    /**
     * If hasPlaybackControl is true, pauses playback.
     */
    fun pause(): Audio

    /**
     * If hasPlaybackControl is enabled, stops playback,
     * resets startTime to 0 and sets isPlaying to false.
     */
    fun stop(): Audio

    /**
     * Connect to the Audio.source. This is used internally on initialisation and when setting / removing filters.
     */
    fun connect(): Audio

    /**
     * Disconnect from the Audio.source. This is used internally when setting / removing filters.
     */
    fun disconnect(): Audio

    /**
     * Returns the filters array.
     */
    fun getFilters(): Array<dynamic>

    /**
     * value - arrays of filters.
     * Set the filters array to value.
     */
    fun setFilters(value: Array<dynamic>): Audio

    /**
     * Returns the first element of the filters array.
     */
    fun getFilter(): dynamic

    /**
     * Add the filter to the filters array.
     */
    fun setFilter(filter: dynamic)

    /**
     * If hasPlaybackControl is enabled, set the playbackRate to value.
     */
    fun setPlaybackRate(value: Number): Double

    /**
     * Return the value of playbackRate.
     */
    fun getPlaybackRate(): Double

    /**
     * Called automatically when playback finished. Sets If isPlaying to false.
     */
    fun onEnded()

    /**
     * Return the value of source.loop (whether playback should loop).
     */
    fun getLoop(): Boolean

    /**
     * Set source.loop to value.
     * @param value whether playback should loop
     */
    fun setLoop(value: Boolean): Audio

    /**
     * Return the current volume.
     */
    fun getVolume(): Double

    /**
     * Set the volume.
     * @param value the volume
     */
    fun setVolume(value: Number): Audio

}