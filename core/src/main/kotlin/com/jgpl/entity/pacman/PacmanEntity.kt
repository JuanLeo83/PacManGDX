package com.jgpl.entity.pacman

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import com.jgpl.utils.Direction
import ktx.assets.disposeSafely

class PacmanEntity(
    private var position: Vector2
) : Disposable {

    private val animations = PacmanAnimationCreator.getAnimations()
    private var center = Vector2(position.x + 8, position.y + 8)
    private val speed: Float = 100f
    private var lastDirection: Direction = Direction.Stop

    fun draw(spriteBatch: SpriteBatch, delta: Float) {
        animations.runAnimation(spriteBatch, delta, position, lastDirection.name)
    }

    fun move(direction: Direction, delta: Float) {
        lastDirection = if (direction != Direction.Stop) direction else lastDirection
        val movement = Vector2(
            lastDirection.orientation.x * speed * delta,
            lastDirection.orientation.y * speed * delta
        )
        position.add(movement)
    }

    override fun dispose() {
        animations.disposeSafely()
    }

}

