import java.util.TreeSet

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a = isPalindrome("deed")

    println("To check palindrome string $a")
}
fun isPalindrome(str:String):Boolean{
    var rev =""
    var ans = false


    for(i in str.length-1 downTo 0){

        rev += str[i]

    }
    if (str == rev){
        ans = true
    }

    return ans
}

