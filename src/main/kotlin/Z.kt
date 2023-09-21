fun main(){
    var (size,q)=readLine()!!.split(" ").map{it.toInt()}
    var arr=readLine()!!.split(" ").map{it.toInt()}
    var x:Int
    repeat(q){
         x=readLine()!!.toInt()
        if(arr.contains(x)) println("found")else print("not found")
    }
}