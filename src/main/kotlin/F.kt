fun main(){
    var size=readLine()!!.toInt()
    var arr=readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    arr.reverse()
    arr.forEach{print("${it} ")}

}