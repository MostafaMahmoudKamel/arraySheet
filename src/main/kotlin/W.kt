fun main(){
    var(n,m)=readLine()!!.split(" ").map{it.toInt()}
    var arr=Array(n){LongArray(m)}

    for(i in 0 until n){
        var rowarr=readLine()!!.split(" ").map{it.toLong()}.toLongArray()
        for(j in 0 until m){
            arr[i][j]=rowarr[j]
        }
    }
//output
    for(i in 0 until n) {
        for (j in (m - 1) downTo 0) {
            print("${arr[i][j]} ")
        }
        println()
    }

}