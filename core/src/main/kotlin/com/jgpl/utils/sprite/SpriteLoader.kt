package com.jgpl.utils.sprite

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import ktx.assets.disposeSafely

object SpriteLoader : Disposable {
    private const val spritePath = "sprites/"
    private const val pngExtension = ".png"

    private val textures = mutableMapOf<String, Texture>()

    fun getTexture(spriteName: String, extension: String = pngExtension): Texture {
        val resource = spritePath + spriteName + extension
        val texture = textures[resource]
        if (texture == null) {
            textures[resource] = Texture(Gdx.files.internal(resource))
        }
        return textures[resource]!!
    }

    fun getTextureRegion(
        texture: Texture,
        position: Vector2 = Vector2.Zero,
        width: Int = 0,
        height: Int = 0
    ): TextureRegion {
        return TextureRegion(texture, position.x.toInt(), position.y.toInt(), width, height)
    }

    fun getSprite(spriteName: String, extension: String = pngExtension): Sprite {
        val texture = getTexture(spriteName, extension)
        return Sprite(texture)
    }

    override fun dispose() {
        textures.forEach {
            it.value.disposeSafely()
        }
    }
}
