package school.lec05

/*
fun main(score : Int){
    if(score <0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}*/


/*03
fun main(score : Int) : String{
    return if(score >= 50){
        "P"

    }
    else {
        "F"
    }
}*/

/*04
fun getGradeWithSwitch(score : Int):String{
    return when(score/10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
     }
}*/

/*05
fun getGradeWithSwitch(score : Int):String{
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}*/

/*06
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}*/

/*07
fun judgeNumber(number : Int){
    when(number){
        1,0,-1-> println("어디서 많이 본 숫자 입니다.")
        else -> println("1,0,-1이 아닙니다")
    }
}*/

/*
// when 에 ()자체를 생략할 수 있다.
fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0 입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수 입니다")
    }
}*/
