package com.jgpl

import com.jgpl.screen.sandbox.SandboxScreen
import com.jgpl.utils.sprite.SpriteLoader
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.assets.disposeSafely

class Application : KtxGame<KtxScreen>() {
    override fun create() {
        addScreen(SandboxScreen())
        setScreen<SandboxScreen>()
    }

    override fun dispose() {
        SpriteLoader.disposeSafely()
    }
}
