package com.gmr458.plugins

import com.gmr458.routes.customerRouting
import com.gmr458.routes.getOrderRoute
import com.gmr458.routes.listOrdersRoute
import com.gmr458.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
