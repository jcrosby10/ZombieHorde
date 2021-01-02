package com.huntergaming.zombiehorde

import com.jme3.app.SimpleApplication
import com.jme3.app.state.AppState
import com.jme3.system.AppSettings


fun main(args: Array<String>) {
    val settings = AppSettings(true)
    settings.title = "Zombie Horde"
    settings.setResolution(1280, 800)
    settings.setUseJoysticks(true)

    val app = Main()
    app.setDisplayFps(true)
    app.setSettings(settings)
    app.start()
}

class Main() : SimpleApplication() {

    override fun simpleInitApp() {

    }
}