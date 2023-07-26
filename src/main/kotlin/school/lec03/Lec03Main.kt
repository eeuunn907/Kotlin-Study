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
/*
fun main(){
    // safe call
    val number1: Int? = null
    val number2 : Long = number1?.toLong() ?:0L

    print(number2)
}
 */

/*
fun printAgeIfPerson(obj : Any){
    if(obj is Person){
        val Person = obj as Person // as Person 생략가능
        println(obj.age)
    }
}*/

/*
fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number1.toLong() ?: 0L
}

fun printAgeIfPerson(obj : Any){
    if(obj is Person){
        val person = obj
        println(person.age)
    }
}*/

// 자바
// if (!(obj instanceof Person))

// 코틀린
// if(obj !is Person)


/*
fun main(){
    printAgeIfPerson(null)
}

fun printAgeIfPerson(obj : Any?){
    val person = obj as Person // as
    println(person.age)
}*/

/*
fun main() {
    printAgeIfPerson(Person("",100))
    //printAgeIfPerson(null)
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}*/


/*
fun main(){
    val name = "joseph"
    val  withoutIndent =
        """
            ABC
            123
            $name // {} 중괄호가 생략가능하지만 보통 {} 중괄호는 써준다
        """.trimIndent()
    println(withoutIndent)
}*/

/*fun main(){
    val person = Person("요셉, 100")
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다"
    println(log)
// 자바의 경우
// Person person = new Person("요셉",100);
// String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다 ", person.getName,person.getAge)
}*/



// 문자열의 특정 문자 가져오기
fun main(){
    val str = "ABCDE"
    val ch = str[1]
    println(ch)
}


