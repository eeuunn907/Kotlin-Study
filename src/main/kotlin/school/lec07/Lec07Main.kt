package school.lec07

import java.lang.NumberFormatException

fun parseIntOrThrow(str : String):Int{
    try {
        return str.toInt()
    }catch (e:NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}