package net.konohana.sakuya.hiiragi.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.hiiragi.controller.hiiragiDbCrudController

fun Route.hiiragiDbCrudRouter() {
    hiiragiDbCrudController()
}
