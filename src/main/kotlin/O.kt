fun main(){
    var list = mutableListOf<Long>(0,0,1)
    for(i in 3..55)
        list.add(list[i-2]+list[i-1])
    var x=readLine()!!.toInt()
    print(list[x])

}