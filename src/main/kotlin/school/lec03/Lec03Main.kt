package school.lec03

/*
fun main() {
//    val str : String? = null // null 을 넣어보고 결과 비교하기
//    //safe Call : null 이 아니면 실행하고, null 이면 실행하지 않는다 (값 그대로가 null 이기 때문)
//    println(str?.length) //실행가능
//    //println(str.length) //불가능
    val number1: Int? = null
    val number2: Long = number1!!.toLong() ?: 0L

    print(number2)
}

 */

fun main(){
    // safe call
    val number1: Int? = null
    val number2 : Long = number1?.toLong() ?:0L

    print(number2)
}