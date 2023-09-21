//check if all array list is even number
fun checkEven(list:List<Int>):Boolean{
    list.forEach{
        if(it%2!=0)
            return false
    }
    return true
}
//divide all list element by two
fun divide(list:MutableList<Int>):MutableList<Int>{
    for (i in 0..list.size-1){
        list[i]/=2
    }
    return list
}
fun main(){
    var size=readLine()!!.toInt()
    var list=readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var counter=0
    while(checkEven(list)==true){
        list= divide(list)
        counter++
    }
    print(counter)
}