package com.jgpl.entity.pacman

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import ktx.assets.disposeSafely

class PacmanEntity(
    private var position: Vector2
) : Disposable {

    private val animations = PacmanAnimationCreator.getAnimations()

    fun draw(spriteBatch: SpriteBatch, delta: Float) {
        animations.runAnimation(spriteBatch, delta, position, "right")
    }

    override fun dispose() {
        animations.disposeSafely()
    }

}

