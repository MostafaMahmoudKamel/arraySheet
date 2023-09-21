
fun main (){
var size=readLine()!!.toInt()

    var s=readLine()!!
    var sum=0
    for(i in 0..s.length-1){
        sum+=s[i].digitToInt()
    }
    println(sum)
}














