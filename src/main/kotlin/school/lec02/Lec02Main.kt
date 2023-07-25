package school.lec02


fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}



fun startsWithA5(str: String): Boolean? {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA6(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA7(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA8(str: String?): Boolean {
    return true
}

fun startsWithA9(str: String?): Boolean {
    return str!!.startsWith("A")
}