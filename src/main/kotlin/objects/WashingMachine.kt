package org.example.objects

class WashingMachine : Appliances {

    private var chargeAmount:Int = 5

    constructor(basePrice:Double,color: String,consum:Char,weight:Double,chargeAmount:Int) : super(basePrice,color,consum,weight){
        this.chargeAmount=chargeAmount
    }

    private fun chargePrice():Double{
        return if (this.chargeAmount in (6..7)) {
            55.0
        }else if(this.chargeAmount == 8){
            70.0
        }else if(this.chargeAmount == 9){
            85.0
        }else if(this.chargeAmount == 10){
            100.0
        }else{
            0.0
        }
    }

    override fun toString(): String {
        return "Washiong Machine: \nBase price: ${this.basePrice}\nFinal price: ${finalPrice()+chargePrice()}\nColor: $color\nConsum Type: $consum\nWeight: $weight\nCharge amount: $chargeAmount"
    }
}