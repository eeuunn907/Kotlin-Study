package school.lec01


fun main(){
    var number1 = 1000L // (1) 가변 Variable
    number1 = 5L

    val  number2 = 1000L // (2) 불변 Value
    // number2 = 5L (불가능)

    var number3 : Long = 10L // 타입을 명시적으로 작성해준다

    var number4 : Long
    //println(number4) 초기화하지 않고 사용할 수 없음

    /*
    number4 = 10L
    println(number4) // 초기화 해주면 사용 가능
     */

    val number5 : Long // val 은 타입을 명시해주어야 에러가 사라짐
    number5 = 20L
    println(number5)

    // * 모든 변수는 우선 val 로 만든고 꼭 필요한 경우만 변경한다

    var num1 : Long? = 10L
    num1 = null
    // Long 뒤에 ? 가 들어가면 변수에 null 값이 들어갈 수 있고 붙어있지 않으면 들어갈 수 없다

    var  person = Person("코틀린 선생님")
    // 객체 인스턴스화를 할 때에는 new 를 붙이지 않아야 한다

    val a: Int =11
    val b: Double =1.4
    val c: Boolean = true
    val d:String="hi"
    val e:Char='z'
    val f:String = """hi
        |my name
        |is
        |joseph
    """.trimMargin()

    print(f)
}