package com.example

import io.ktor.application.*
import io.ktor.features.ContentNegotiation
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
        routing {
            get("/sajjad") {
            call.respondText { "sajjad" }
            }
        }
        /*get("/") {
            call.respondText { "hasan" }
        }
        post("/reza") {
            call.respondText { "yousefnia" }
        }*/

}

