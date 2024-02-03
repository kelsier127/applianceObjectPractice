package org.example

import org.example.objects.*

fun main() {
    val tele1 = Television(345.6,"Blue",'C',10.5,33)
    val appliance = Appliances(861.6,"Yellow",'E',6.5)
    val washing = WashingMachine(256.6,"Silver",'B',23.5,33)

    println(tele1)
    println()
    println(appliance)
    println()
    println(washing)
}