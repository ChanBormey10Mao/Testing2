package example.myApp

/*
class Aquarium{
    var width : Int = 20;
    var  height :Int = 40
    var length :Int = 100

    fun printSize(){
        println("Length: $length cm\n"+
        "Width: $width cm\n"+
        "Height: $height cm\n")
    }

}*/
/*class Aquarium(length : Int = 100, width: Int = 20, height :Int =40){
    var width = width
    var  height =height
    var length = length
    fun printSize(){
        println("Length: $length cm\n"+
                "Width: $width cm\n"+
                "Height: $height cm\n")
    }

}*/
/*class Aquarium(var length : Int = 100,var width: Int = 20,var height :Int =40){

    fun printSize(){
        println("Length: $length cm\n"+
                "Width: $width cm\n"+
                "Height: $height cm\n")
    }
    init{
        println("aquarium initializing")
    }
    init{
        println("Volume: ${(width*length*height) / 1000} L")
    }

}*/
/*class Aquarium(var length : Int = 100,var width: Int = 20,var height :Int =40){
    var volume: Int
    get() = width*height*length/ 1000
    private set(value){
        height = (value * 1000) / width* length
    }
    fun printSize(){
        println("Length: $length cm\n"+
                "Width: $width cm\n"+
                "Height: $height cm\n")
    }
}*/

open class Aquarium(open var length : Int = 100,open var width: Int = 20,open var height :Int =40){
    open var volume: Int
        get() = width*height*length/ 1000
        set(value){
            height = (value * 1000) / width* length
        }
    open var shape= "rectangle"
    open var water : Double = 0.0
    get() = volume * 0.9
    fun printSize(){
        println("Length: $length cm\n"+
                "Width: $width cm\n"+
                "Height: $height cm\n")
        println("Volume : $volume l\nWater: $water l\n (${water/volume * 100.0}% full)")
    }
}

