package ru.mipt.npm.three

import kotlin.browser.document

abstract class ApplicationBase {
    abstract val stateKeys: List<String>

    abstract fun start(state: Map<String, Any>)
    abstract fun dispose(): Map<String, Any>
}

class ThreeApplication : ApplicationBase() {

    override val stateKeys: List<String> = emptyList()

    override fun start(state: Map<String, Any>) {
//        require("three-orbitcontrols/OrbitControls.js")
//        require("three/build/three.min.js")

        val view = ThreeKTDemoView(document.getElementById("canvas")!!)

        view.animate()

//        view = WebLinesView(document.getElementById("lines")!!, document.getElementById("addForm")!!)
//        presenter = LinesPresenter(view)
//
//        state["lines"]?.let { linesState ->
//            @Suppress("UNCHECKED_CAST")
//            presenter.restore(linesState as Array<String>)
//        }
    }

    override fun dispose() = emptyMap<String,Any>()//mapOf("lines" to presenter.dispose())
}