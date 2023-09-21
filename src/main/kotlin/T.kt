import kotlin.math.*

fun main(){
    //read size 2d array
    var len=readLine()!!.toInt()
    //build array[[]]
    var arr=Array(len){IntArray(len)}
    //sum output diagonal
    var sumDiagonal1=0
    var sumDiagonal2=0
    for(i in 0..len-1){
        var rowArr=readLine()!!.split(" ").map{it.toInt()}.toIntArray()
        for(j in 0 until len){
            arr[i][j]=rowArr[j]
            if(i==j)
                sumDiagonal1+=arr[i][j]
            if((i+j)==len-1)
                sumDiagonal2+=arr[i][j]
        }
    }
    print(abs(sumDiagonal1-sumDiagonal2))

}