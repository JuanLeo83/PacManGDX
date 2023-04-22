package com.jgpl.entity.node

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.jgpl.utils.Direction

data class LabyrinthNodeEntity(
    private val position: Vector2,
    val directions: List<Direction>,
    private val debug: Boolean = false
) {

    private lateinit var shapeRenderer: ShapeRenderer

    init {
        if (debug) {
            shapeRenderer = ShapeRenderer()
        }
    }

    fun draw() {
        if (!debug) return

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        shapeRenderer.color = Color.GREEN
        shapeRenderer.rect(position.x, position.y, 4f, 4f)
        shapeRenderer.end()
    }
}
