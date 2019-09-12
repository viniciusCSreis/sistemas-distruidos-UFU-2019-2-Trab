package br.com.ufu.sd.trab

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.ServerSocket


fun main(args: Array<String>) {
    println("Hello, World")
    val socket = ServerSocket(5555)
    while (true) {
        val connectionSocket = socket.accept()

        val reader = BufferedReader(InputStreamReader(connectionSocket.getInputStream()))
        val writer = BufferedWriter(OutputStreamWriter(connectionSocket.getOutputStream()))

        writer.write("*** Welcome to the Calculation Server (Addition Only) ***\n")
        writer.write("*** Please type in the first number and press Enter : \n")
        writer.flush()
        val data1 = reader.readLine().trim { it <= ' ' }

        writer.write("*** Please type in the second number and press Enter : \n")
        writer.flush()
        val data2 = reader.readLine().trim { it <= ' ' }

        val num1 = Integer.parseInt(data1)
        val num2 = Integer.parseInt(data2)

        val result = num1 + num2
        println("Addition operation done ")

        writer.write("\n=== Result is  : $result")
        writer.flush()
        connectionSocket.close()
    }


}

