package com.jgpl.screen.sandbox

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import com.jgpl.entity.pacman.PacmanEntity
import com.jgpl.utils.sprite.Sprite
import com.jgpl.utils.sprite.SpriteLoader
import ktx.assets.disposeSafely

class SandboxResources : Disposable {
    val level: Sprite = SpriteLoader.getSprite("level")
    val pacman: PacmanEntity = PacmanEntity(Vector2.Zero)

    override fun dispose() {
        level.disposeSafely()
        pacman.disposeSafely()
    }
}
