import kotlin.math.*

fun main(){
var number=readLine()!!.toInt()
//    var arr=Array(number){0}
    var input=readLine()!!.split(" ")
    var sum:Long=0
    for(i:Int in 0..(number-1)){
        var x=input[i].toLong()
        sum+=x
    }
    println(abs(sum))

}