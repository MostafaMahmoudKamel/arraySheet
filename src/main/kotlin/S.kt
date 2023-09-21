fun main(){
    //read size of 2d array
    var l=readLine()!!.split(" ")
    var row= l[0].toInt()
    var col= l[1].toInt()
//    val (row, col) = readLine()!!.split(" ").map { it.toInt() }

    //read 2d array
    var arr= Array(row){ IntArray(col)}
    for(i in 0..row-1){
        var rowarr=readLine()!!.split(" ").map{it.toInt()}
        for(j in 0..col-1){
            arr[i][j]=rowarr[j]
        }
    }
    var search=readLine()!!.toInt()
    //printing 2d
    var flag=1
    for(i in 0..row-1) {
        for(j in 0..col-1){
        if(arr[i][j]==search){
            flag=0
            break
        }
        }

    }
if(flag==1)print("will take number") else  print("will not take number")
}



