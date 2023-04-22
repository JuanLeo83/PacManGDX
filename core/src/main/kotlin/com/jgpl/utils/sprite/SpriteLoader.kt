package com.jgpl.utils.sprite

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture

object SpriteLoader {
    private const val spritePath = "sprites/"

    fun getTexture(spriteName: String, extension: String = ".png"): Texture {
        val resource = spritePath + spriteName + extension
        return Texture(Gdx.files.internal(resource))
    }

    fun getSprite(spriteName: String, extension: String = ".png"): Sprite {
        val texture = getTexture(spriteName, extension)
        return Sprite(texture)
    }
}
