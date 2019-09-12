package br.com.ufu.sd.trab

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.Socket


fun main(args: Array<String>) {
    println("Hello, World Client")
    try {
        val socketClient = Socket("localhost", 5555)
        println("Client: " + "Connection Established")

        val reader = BufferedReader(InputStreamReader(socketClient.getInputStream()))

        val writer = BufferedWriter(OutputStreamWriter(socketClient.getOutputStream()))
        var serverMsg: String? = ""
        writer.write("8\r\n")
        writer.write("10\r\n")
        writer.flush()
        while ( serverMsg!= null) {
            serverMsg = reader.readLine()
            println("Client: $serverMsg")
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }


}

