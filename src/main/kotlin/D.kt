fun main(){
    var size=readLine()!!.toInt()
    var list=readLine()!!.split(" ").map{it.toInt() }
    for (i in 0..list.size-1){
        if(list[i]<=10)
            println("A[$i] = ${list[i]}")
    }
}