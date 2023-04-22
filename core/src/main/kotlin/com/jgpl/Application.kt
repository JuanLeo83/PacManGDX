package com.jgpl

import com.jgpl.screen.sandbox.SandboxScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

class Application : KtxGame<KtxScreen>() {
    override fun create() {
        addScreen(SandboxScreen())
        setScreen<SandboxScreen>()
    }
}
