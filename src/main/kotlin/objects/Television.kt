package org.example.objects

class Television : Appliances {
    private var size:Int = 28
    constructor(basePrice:Double,color: String,consum:Char,weight:Double,size:Int) : super(basePrice,color,consum,weight){
        this.size=size
    }

    private fun sizePrice():Double{
        return if (this.size in (29..32)) {
            50.0
        }else if(this.size in 33..42){
            100.0
        }else if(this.size in 44..50){
            150.0
        }else if(this.size >= 51){
            200.0
        }else{
            0.0
        }
    }

    override fun toString(): String {
        return "Television: \nBase price: ${this.basePrice}\nFinal price: ${finalPrice()+sizePrice()}\nColor: $color\nConsum Type: $consum\nWeight: $weight\nSize: $size"
    }
}