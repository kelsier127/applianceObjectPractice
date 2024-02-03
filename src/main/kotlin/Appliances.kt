package org.example

open class Appliances {
    protected var basePrice:Double = 0.0
    protected var color:String = "Blanc"
    protected var consum:Char = 'G'
    protected var weight:Double = 5.0



    constructor(basePrice:Double,color: String,consum:Char,weight:Double) {
        this.basePrice=basePrice
        this.color=color
        this.consum=consum
        this.weight=weight
    }

    private fun consumptionPrice():Double{
        return when(this.consum.uppercaseChar()){
            'A'-> 35.0
            'B'-> 30.0
            'C'-> 25.0
            'D'-> 20.0
            'E'-> 15.0
            'F'-> 10.0
            else -> 0.0
        }
    }

    private fun weigthPrice():Double{
        return if (this.weight in 6.0..20.0) {
            20.0
        }else if(this.weight in 21.0..50.0){
            50.0
        }else if(this.weight in 51.0..80.0){
            80.0
        }else if(this.weight > 80){
            100.0
        }else{
            0.0
        }
    }

    fun finalPrice():Double{
        return weigthPrice()+consumptionPrice()+this.basePrice
    }
}