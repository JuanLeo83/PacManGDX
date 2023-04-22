package com.jgpl.utils

import com.badlogic.gdx.math.Vector2

sealed class Direction(val name: String, val orientation: Vector2) {
    object Up : Direction("up", Vector2(0f, 1f))
    object Right : Direction("right", Vector2(1f, 0f))
    object Down : Direction("down", Vector2(0f, -1f))
    object Left : Direction("left", Vector2(-1f, 0f))

    object Stop : Direction("right", Vector2(0f, 0f))
}
