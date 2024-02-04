package org.example.objects

class Television : Appliances {
    private var size:Int = 28
    constructor(basePrice:Int,color: String,consum:Char,weight:Int,size:Int) : super(basePrice,color,consum,weight){
        this.size=size
    }

    private fun sizePrice():Int{
        return if (this.size in (29..32)) {
            50
        }else if(this.size in 33..42){
            100
        }else if(this.size in 44..50){
            150
        }else if(this.size >= 51){
            200
        }else{
            0
        }
    }

    override fun toString(): String {
        return "Television: \nBase price: ${this.basePrice}\nFinal price: ${finalPrice()+sizePrice()}\nColor: $color\nConsum Type: $consum\nWeight: ${weight}kg\nSize: $size"
    }
}