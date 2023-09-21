fun main(){
    //read array size
    var size=readLine()!!.toInt()
    //read array element
    var arr=readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    arr.sort()



    arr.forEach{print("${it} ")}

}