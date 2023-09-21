fun main(){
    var (sizeA,sizeB)=readLine()!!.split(" ").map { it.toInt() }
    var arrA=readLine()!!.split(" ").map{it.toInt()}
    var arrB=readLine()!!.split(" ").map{it.toInt()}
    var j=0//as loop
    var counter=0//count subsequence same in arr
    for(i in 0 until arrA.size){
        if(arrA[i]==arrB[j]){
            j++
            counter++
        }
        if(counter==arrB.size)break
    }
    if(counter==arrB.size)
        print("YES")
    else
        print("NO")

}