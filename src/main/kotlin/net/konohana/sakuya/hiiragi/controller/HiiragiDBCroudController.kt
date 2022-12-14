package net.konohana.sakuya.hiiragi.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.hiiragi.model.HiiragiRW01
import net.konohana.sakuya.hiiragi.model.HiiragiRW02
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Route.hiiragiDbCrudController() {
    route("crud") {
        route("hiiragi") {
            route("rw01") {
                post {
                    transaction {
                        SchemaUtils.create(HiiragiRW01)
                    }
                    call.respond(mapOf("Created:" to "HiiragiRW01"))
                }
            }
            route("rw02") {
                post {
                    transaction {
                        SchemaUtils.create(HiiragiRW02)
                    }
                    call.respond(mapOf("Created:" to "HiiragiRW02"))
                }
            }
        }
    }
}
