package com.abelespino.mysuperheroeapp.utils

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

class Constants {
    companion object {
        const val BASE_URL = "https://gateway.marvel.com/"
        val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
        const val API_KEY = "01168bd7ea76f5cd7f18da9de4092682"
        const val PRIVATE_KEY = "b3b84eb436233a2d4cfa495e4604451f8886eea0"
        const val limit = "20"
        fun hash(): String {
            val input = "$timeStamp$PRIVATE_KEY$API_KEY"
            val md = MessageDigest.getInstance("MD5")
            return BigInteger(
                1,
                md.digest(input.toByteArray())
            ).toString(16).padStart(32, '0')
        }
    }
}