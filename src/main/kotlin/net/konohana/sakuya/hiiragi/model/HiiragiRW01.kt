package net.konohana.sakuya.hiiragi.model

import org.jetbrains.exposed.sql.Table

object HiiragiRW01 : Table("hiiragi_rw01") {
    val id = integer("id").autoIncrement()
    val routeID = varchar("route_id", length = 20)
    val staCode = varchar("sta_code", length = 20)
    val staName = varchar("sta_name", length = 20)
}
