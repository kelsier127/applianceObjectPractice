package org.example

import org.example.objects.*

fun main() {
    var applianceList = ArrayList<Appliances>()

    val appliance1 = Appliances(462,"Silver",'A',44)
    val appliance2 = Appliances(965,"Gold",'B',5)
    val appliance3 = Appliances(154,"White",'C',23)
    val appliance4 = Appliances(123,"Black",'F',8)
    val appliance5 = Appliances(735,"Blue",'G',32)
    val appliance6 = Appliances(164,"Cyan",'E',32)
    val tele1 = Television(345,"Green",'E',12,33)
    val tele2 = Television(345,"Black",'C',11,46)
    val washing1 = WashingMachine(256,"White",'A',60,8)
    val washing2 = WashingMachine(256,"Silver",'B',50,7)

    applianceList.add(appliance1)
    applianceList.add(appliance2)
    applianceList.add(appliance3)
    applianceList.add(appliance4)
    applianceList.add(appliance5)
    applianceList.add(appliance6)
    applianceList.add(tele1)
    applianceList.add(tele2)
    applianceList.add(washing1)
    applianceList.add(washing2)

    var sumaFinal = 0
    var sumaBase = 0

    for (i in applianceList.indices){
        println("Appliance ${i+1}: \n${applianceList[i]}\n")
        sumaFinal += applianceList[i].finalPrice()

    }

    println("Preu final: $sumaFinal")

}