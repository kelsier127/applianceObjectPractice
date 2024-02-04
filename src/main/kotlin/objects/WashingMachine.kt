package org.example.objects

class WashingMachine : Appliances {

    private var chargeAmount:Int = 5

    constructor(basePrice:Int,color: String,consum:Char,weight:Int,chargeAmount:Int) : super(basePrice,color,consum,weight){
        this.chargeAmount=chargeAmount
    }

    private fun chargePrice():Int{
        return if (this.chargeAmount in (6..7)) {
            55
        }else if(this.chargeAmount == 8){
            70
        }else if(this.chargeAmount == 9){
            85
        }else if(this.chargeAmount == 10){
            100
        }else{
            0
        }
    }

    override fun toString(): String {
        return "Washiong Machine: \nBase price: ${this.basePrice}\nFinal price: ${finalPrice()+chargePrice()}\nColor: $color\nConsum Type: $consum\nWeight: ${weight}kg\nCharge amount: $chargeAmount"
    }
}