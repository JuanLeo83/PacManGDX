package com.jgpl.screen.gameplay

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.jgpl.utils.Direction

class GamePlayInput {

    fun getDirection(): Direction {
        return if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            Direction.Up
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            Direction.Right
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            Direction.Down
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            Direction.Left
        } else {
            Direction.Stop
        }
    }

    fun getStart(): Boolean = Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)

    fun getRestart(): Boolean = Gdx.input.isKeyJustPressed(Input.Keys.SPACE)

    fun getPause(): Boolean = Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)

    fun getOptionSelection(): Boolean = Gdx.input.isKeyJustPressed(Input.Keys.SPACE)

}
