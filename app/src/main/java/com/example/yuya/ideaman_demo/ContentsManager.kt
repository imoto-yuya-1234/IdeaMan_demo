package com.example.yuya.ideaman_demo

object ListContent {
    var id = 0
    var contents = arrayListOf<String>()

    fun addContent(text: String) {
        this.contents.add(text)
        id++
    }
}