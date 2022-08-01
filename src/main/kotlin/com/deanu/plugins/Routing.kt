package com.deanu.plugins

import com.deanu.room.RoomController
import com.deanu.routes.chatSocket
import com.deanu.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()

    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
