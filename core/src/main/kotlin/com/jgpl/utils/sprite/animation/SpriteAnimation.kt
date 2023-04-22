package com.jgpl.utils.sprite.animation

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import com.jgpl.utils.sprite.SpriteLoader
import ktx.assets.disposeSafely

class SpriteAnimation(private val texture: Texture, speed: Float = 3f, private val repeat: Boolean = true) :
    Disposable {

    private val animation = mutableListOf<TextureRegion>()
    private var currentFrame: Int = 0
    private var elapsed: Float = 0f
    private val frameDuration: Float = 1 / speed
    private var hasFinished: Boolean = false

    fun setFrame(position: Vector2, width: Int, height: Int, index: Int = -1) {
        val region = SpriteLoader.getTextureRegion(texture, position, width, height)
        if (index < 0) {
            animation.add(region)
        } else {
            animation.add(index, region)
        }
    }

    fun draw(spriteBatch: SpriteBatch, delta: Float, position: Vector2 = Vector2.Zero) {
        if (hasFinished) return
        if (elapsed >= frameDuration) {
            checkFrame()
        }
        if (hasFinished) return
        spriteBatch.draw(
            animation[currentFrame],
            position.x,
            position.y,
            animation[currentFrame].regionWidth.toFloat(),
            animation[currentFrame].regionHeight.toFloat()
        )
        elapsed += delta
    }

    private fun checkFrame() {
        currentFrame++
        elapsed = 0f
        if (currentFrame == animation.size) {
            reset()
            if (!repeat) hasFinished = true
        }
    }

    fun reset() {
        currentFrame = 0
        elapsed = 0f
    }

    override fun dispose() {
        texture.disposeSafely()
    }
}
