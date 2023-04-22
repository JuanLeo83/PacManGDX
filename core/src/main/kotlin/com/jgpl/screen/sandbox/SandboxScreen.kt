package com.jgpl.screen.sandbox

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.app.KtxScreen
import ktx.assets.disposeSafely
import ktx.graphics.use

class SandboxScreen : KtxScreen {

    private val resources = SandboxResources()
    private val spriteBatch = SpriteBatch()

    override fun render(delta: Float) {
        spriteBatch.use {
            resources.level.draw(it)
            resources.pacman.draw(it, delta)
        }
    }

    override fun dispose() {
        resources.disposeSafely()
        spriteBatch.disposeSafely()
    }

}
