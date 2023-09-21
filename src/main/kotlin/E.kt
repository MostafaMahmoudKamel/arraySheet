fun main(){
    var size=readLine()!!.toInt()
    var list=readLine()!!.split(" ").map{it.toInt()}
    var lawest=list[0]
    var lawestPosition:Int =1//intialization variable
    for(i in 0..list.size-1){
        if(list[i]<lawest){
            lawest=list[i]
            lawestPosition=i+1
        }
    }
    println("${lawest} ${lawestPosition}")

}