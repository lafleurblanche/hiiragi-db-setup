package net.konohana.sakuya.hiiragi.model

import org.jetbrains.exposed.sql.Table

object HiiragiRW02 : Table("hiiragi_rw02") {
    val id = integer("id").autoIncrement()
    val routeID = varchar("route_id", length = 20)
    val staCode = varchar("sta_code", length = 20)
    val staName = varchar("sta_name", length = 20)
}
