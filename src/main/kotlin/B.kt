//fun main(){
//    var len=readLine()!!.toInt()
//    var listInput=readLine()!!.split(" ")
//    var search=readLine()!!
//    if(listInput.contains(search)) println(listInput.indexOf(search)) else println(-1)
//
//}
fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val x = readLine()!!.toInt()
    var found = false
    for (i in 0 until n) {
        if (arr[i] == x) {
            println(i)
            found = true
            break
        }
    }
    if (!found) {
        println("-1")
    }
}
