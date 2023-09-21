fun main(){
    var(n,m)=readLine()!!.split(" ").map{it.toInt()}
    var arr=readLine()!!.split(" ").map{it.toInt()}
    var newarr=Array(100000){0}
    for(i in 0 until arr.size){
        newarr[arr[i]]++
    }
    for(i in 1..m){
        println(newarr[i])
    }
}