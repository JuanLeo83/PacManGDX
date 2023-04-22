package com.jgpl.entity.pacman

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.math.Vector2
import com.jgpl.utils.sprite.SpriteLoader
import com.jgpl.utils.sprite.animation.AnimationCollection
import com.jgpl.utils.sprite.animation.AnimationCreator
import com.jgpl.utils.sprite.animation.SpriteAnimation

object PacmanAnimationCreator : AnimationCreator {

    private const val frameWidth: Int = 16
    private const val frameHeight: Int = 16

    override fun getAnimations(): AnimationCollection {
        val texture = SpriteLoader.getTexture("sprites")
        return AnimationCollection().apply {
            addAnimation("right", createRightAnimation(texture))
            addAnimation("left", createLeftAnimation(texture))
            addAnimation("up", createUpAnimation(texture))
            addAnimation("down", createDownAnimation(texture))
            addAnimation("die", createDieAnimation(texture))
        }
    }

    private fun createRightAnimation(texture: Texture): SpriteAnimation {
        return SpriteAnimation(texture, speed = 10f).apply {
            setFrame(Vector2((frameWidth * 0).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 2).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
        }
    }

    private fun createLeftAnimation(texture: Texture): SpriteAnimation {
        return SpriteAnimation(texture, speed = 10f).apply {
            setFrame(Vector2((frameWidth * 0).toFloat(), (frameHeight * 1).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 1).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 2).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 1).toFloat()), frameWidth, frameHeight)
        }
    }

    private fun createUpAnimation(texture: Texture): SpriteAnimation {
        return SpriteAnimation(texture, speed = 10f).apply {
            setFrame(Vector2((frameWidth * 0).toFloat(), (frameHeight * 2).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 2).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 2).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 2).toFloat()), frameWidth, frameHeight)
        }
    }

    private fun createDownAnimation(texture: Texture): SpriteAnimation {
        return SpriteAnimation(texture, speed = 10f).apply {
            setFrame(Vector2((frameWidth * 0).toFloat(), (frameHeight * 3).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 3).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 2).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 1).toFloat(), (frameHeight * 3).toFloat()), frameWidth, frameHeight)
        }
    }

    private fun createDieAnimation(texture: Texture): SpriteAnimation {
        return SpriteAnimation(texture, speed = 10f, repeat = false).apply {
            setFrame(Vector2((frameWidth * 3).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 4).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 5).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 6).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 7).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 8).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 9).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 10).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 11).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 12).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
            setFrame(Vector2((frameWidth * 13).toFloat(), (frameHeight * 0).toFloat()), frameWidth, frameHeight)
        }
    }
}
