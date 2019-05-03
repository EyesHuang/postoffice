package com.yt.kotlin

import java.util.*

fun main() {
    var box3: Box3
    var box5: Box5
    var number = 0
    val scanner = Scanner(System.`in`)
    var length: Float
    var width: Float
    var height: Int

    while (number != -1) {
        println("If you input -1, it will close the program.\n" +
                "Please choose box.\nBox3: input 3.\nBox5: input 5")
        number = scanner.nextInt()

        if (number != -1) {
            println("Please enter object's length:")
            length = scanner.nextFloat()
            println("Please enter object's width:")
            width = scanner.nextFloat()
            println("Please enter object's height:")
            height = scanner.nextInt()

            if (length < 0 || width < 0 || height < 0) {
                println("Need to set values > 0")
                continue
            }

            when(number) {
                3 -> {
                    box3 = Box3(length, width, height)
                    println("Things could place in the box3:" + box3.validate())
                }
                5 -> {
                    box5 = Box5(length, width, height)
                    println("Things could place in the box5:" + box5.validate())
                }
                else -> println("Please select the right box.")
            }


        }



    }


}


open class Box3(var length: Float, var width: Float, var height: Int) {
    companion object {
        const val LENGTH = 23f
        const val WIDTH = 14f
        const val HEIGHT = 13
    }

    open fun validate() =
        (length < LENGTH && width < WIDTH && height < HEIGHT)

}


class Box5(length: Float, width: Float, height: Int): Box3(length, width, height) {
    companion object {
        const val LENGTH = 39.5f
        const val WIDTH = 27.5f
        const val HEIGHT = 23
    }

    override fun validate() =
        (length < LENGTH && width < WIDTH && height < HEIGHT)

}