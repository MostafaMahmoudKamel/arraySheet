fun main(){
    //read number of element in array
    var size=readLine()!!.toInt()
    //read the array of number
    var list=readLine()!!.split(" ").map{it.toInt()}
    var flag=0//isPlaindrome
    for(i in 0..(list.size/2)-1)
    {
        if(list[i]!=list[size-i-1]){
            flag=1
            break}
    }
    //output
    if(flag==1)
        println("NO")
    else
        println("YES")
}