package com.jgpl.utils.sprite.animation

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import ktx.assets.disposeSafely

class AnimationCollection : Disposable {
    private val animations = mutableMapOf<String, SpriteAnimation>()
    private var currentAnimation: String = ""

    fun addAnimation(name: String, animation: SpriteAnimation) {
        animations[name] = animation
    }

    fun runAnimation(spriteBatch: SpriteBatch, delta: Float, position: Vector2, name: String) {
        setIfNewAnimation(name)
        animations[currentAnimation]?.draw(spriteBatch, delta, position)
    }

    private fun setIfNewAnimation(name: String) {
        if (currentAnimation.isEmpty() || name != currentAnimation) {
            animations[currentAnimation]?.reset()
            currentAnimation = name
        }
    }

    override fun dispose() {
        animations.forEach {
            it.value.disposeSafely()
        }
    }
}
