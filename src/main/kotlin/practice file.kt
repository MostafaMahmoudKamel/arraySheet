fun main(){
    var (m,n)=readLine()!!.split(" ").map{it.toInt()}
    var arr=Array(m){IntArray(n)}
    for(i in 0..m-1){
        var rowarr=readLine()!!.split(" ").map{it.toInt()}
        for(j in 0..n-1){
            arr[i][j]=rowarr[j]
        }
    }
    for (i in 0..m-1){
        for(j in 0..n-1){
            print(arr[i][j])
        }
        println()
    }

}