import java.util.*

//fun main(args: Array<String>) {
//    val isUnit = println("This is an expression")
//    println(isUnit)
//}
//main()


fun FeedTheFish(){
    var day = randomDay()
    var food = FishFood(day)
    println("Today is $day , and Fish eats $food.")
    if(ShouldChangeWater(day) == true) println("You need to change water") else println("No need to change water")
}
fun randomDay(): String{
    var week = arrayOf("Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

/*fun main(){
    FeedTheFish()
    swim()
    swim ("Slow")
    swim(speed = "turtle-like")

}*/
//fun FishFood(day: String) : String {
//    var food = ""
//    when(day){
//        "Monday" -> food= "Den Den Noodle"
//        "Tuesday" -> food = "Den Den Noodle"
//        "Wednesday" -> food= "Bor Bor Chicken Breast"
//        "Thursday" -> food= "Bor Bor Chicken Breast"
//        "Friday" -> food= "Bor Bor Chicken Breast"
//        "Saturday"-> food= "Sngo Ji Chhay"
//        "Sunday" -> food= "Sngo Ji Chhay"
//    }
//    return food;
//}

//fun FishFood(day: String) : String {
//    var food : String
//    when(day){
//        "Monday" -> food= "Den Den Noodle"
//        "Tuesday" -> food = "Den Den Noodle"
//        "Wednesday" -> food= "Bor Bor Chicken Breast"
//        "Thursday" -> food= "Bor Bor Chicken Breast" //"Friday" -> food= "Bor Bor Chicken Breast"
//        "Saturday"-> food= "Sngo Ji Chhay"
//        "Sunday" -> food= "Sngo Ji Chhay"
//        else -> food = "nothing"
//    }
//    return food;
//}
fun FishFood(day: String) : String {

    return when(day){
        "Monday" ->"Den Den Noodle"
        "Tuesday" -> "Den Den Noodle"
        "Wednesday" -> "Bor Bor Chicken Breast"
        "Thursday" -> "Bor Bor Chicken Breast" //"Friday" -> food= "Bor Bor Chicken Breast"
        "Saturday"-> "Sngo Ji Chhay"
        "Sunday" ->  "Sngo Ji Chhay"
        else ->
            "nothing"
    }

}
fun swim(speed: String = "fast"){
    println("swimming $speed")
}

//fun ShouldChangeWater(day: String, temperature: Int=  22, dirty: Int =20): Boolean{
//    return when {
//        day == "Sunday" -> true
//        temperature >30 ->true
//        dirty >30 -> true
//        else -> false
//    }
//}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun ShouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

/*
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    ...*/
/*
val decorations = listOf("rock","pagoda","plastic plants","alligator","flower pots")

fun main(){
    println(decorations.filter {it[0] == 'p'})
}*/
/*
fun decoration(){
    val decorations = listOf("rock","pagoda","plastic plants","alligator","flower pots")
    // eager, creates a new list
    var eager  = decorations.filter{it[0] == 'p'}
    println("eager: $eager")
    // lazy, will wait until asked to evaluate
    var filtered = decorations.asSequence().filter{it[0] == 'p'}
    var newList= filtered.toList()
    println("newlist : $newList")

    val lazymap = decorations.asSequence().map{
        println("access: $it")
        it
    }
    println("\n------")
    println("lazy : $lazymap")
    println("------")
    println("first: ${lazymap.first()}")
    println("------")
    println("all: ${lazymap.toList()}")

    val lazyMap2= decorations.asSequence().filter {it[0] == 'p'}.map{
        println("access: $it")
        it
    }
    println("\n------")
    println("filtered : ${lazyMap2.toList()}")
}
*/
fun dirtyFilter(){
    var DirtyLevel = 20
    /*val waterFilter = {dirty : Int ->dirty/2}*/
    val waterFilter : (Int) ->Int= {dirty ->dirty/2}
    println(waterFilter(DirtyLevel))
}

fun updateDirty(dirty:Int, operation: (Int)->Int): Int {
    return operation(dirty)
}

fun main(){
    val waterFilter :(Int) -> Int = {dirty ->dirty/2}
    println(updateDirty(30, waterFilter))
    println(updateDirty(34, :: InceaseDirty))
    var dirtyLevel = 19;
     dirtyLevel= updateDirty(dirtyLevel){dirtyLevel->dirtyLevel +23}
    print(dirtyLevel)
}
fun InceaseDirty (start: Int)= start+1
