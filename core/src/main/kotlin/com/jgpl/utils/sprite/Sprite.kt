package com.jgpl.utils.sprite

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import ktx.assets.disposeSafely

class Sprite(private val texture: Texture, var position: Vector2 = Vector2.Zero) : Disposable {
    fun draw(spriteBatch: SpriteBatch) {
        spriteBatch.draw(texture, position.x, position.y, texture.width.toFloat(), texture.height.toFloat())
    }

    override fun dispose() {
        texture.disposeSafely()
    }
}
