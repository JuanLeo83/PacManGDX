package com.jgpl.screen.sandbox

import com.badlogic.gdx.utils.Disposable
import com.jgpl.utils.sprite.Sprite
import com.jgpl.utils.sprite.SpriteLoader
import ktx.assets.disposeSafely

class SandboxResources : Disposable {
    val level: Sprite = SpriteLoader.getSprite("level")

    override fun dispose() {
        level.disposeSafely()
    }
}
