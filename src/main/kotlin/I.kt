fun main(){
    var testcase=readLine()!!.toInt()
    //loop repeat
    repeat(testcase)
    {
        //read size array
        var size=readLine()!!.toInt()
        var list=readLine()!!.split(" ").map{it.toInt()}
        //decalare output sum
        var minsum:Int=Int.MAX_VALUE//intialized with max int value

        var sum:Int=0
        for(i in 0..list.size-2){
            for(j in i+1..list.size-1){
                sum=list[i]+list[j]+j-i
                if(sum<minsum)
                    minsum=sum
            }
        }
        println(minsum)

    }
}