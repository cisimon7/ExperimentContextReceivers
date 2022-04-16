package com.cisimon7.experimentcontextreceivers

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}