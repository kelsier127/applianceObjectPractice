package org.example.objects

open class Appliances {
    protected var basePrice:Int = 0
    protected var color:String = "Blanc"
    protected var consum:Char = 'G'
    protected var weight:Int = 5



    constructor(basePrice:Int,color: String,consum:Char,weight:Int) {
        this.basePrice=basePrice
        this.color=color
        this.consum=consum
        this.weight=weight
    }

    private fun consumptionPrice():Int{
        return when(this.consum.uppercaseChar()){
            'A'-> 35
            'B'-> 30
            'C'-> 25
            'D'-> 20
            'E'-> 15
            'F'-> 10
            else -> 0
        }
    }

    private fun weigthPrice():Int{
        return if (this.weight in 6..20) {
            20
        }else if(this.weight in 21..50){
            50
        }else if(this.weight in 51..80){
            80
        }else if(this.weight > 80){
            100
        }else{
            0
        }
    }

    fun finalPrice():Int{
        return weigthPrice()+consumptionPrice()+this.basePrice
    }

    override fun toString(): String {
        return "Base price: ${this.basePrice}\nFinal price: ${finalPrice()}\nColor: $color\nConsum Type: $consum\nWeight: ${weight}kg"
    }
}