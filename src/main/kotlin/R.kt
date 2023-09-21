fun main(){
    var size=readLine()!!.toInt()
    var listA=readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var listB=readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    listA.sort()
    listB.sort()
    if(listA==listB) print("yes") else print("no")
}