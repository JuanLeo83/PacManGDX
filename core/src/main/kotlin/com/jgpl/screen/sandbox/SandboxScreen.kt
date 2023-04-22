package com.jgpl.screen.sandbox

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.jgpl.screen.gameplay.GamePlayInput
import ktx.app.KtxScreen
import ktx.assets.disposeSafely
import ktx.graphics.use

class SandboxScreen : KtxScreen {

    private val resources = SandboxResources()
    private val spriteBatch = SpriteBatch()
    private val input = GamePlayInput()

    private fun update(delta: Float) {
        resources.pacman.move(input.getDirection(), delta)
    }

    override fun render(delta: Float) {
        update(delta)

        spriteBatch.use {
            with(resources) {
                level.draw(it)
                pacman.draw(it, delta)
            }
        }
    }

    override fun dispose() {
        resources.disposeSafely()
        spriteBatch.disposeSafely()
    }

}
