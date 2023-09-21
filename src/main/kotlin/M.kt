import java.util.*

//import kotlin.math*
fun main(){
    var size=readLine()!!.toInt()
    var list=readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    //find min,max in list
    var min=list.min()
    var max=list.max()


    var minIndex=list.indexOf(min)
    var maxIndex=list.indexOf(max)
    //update values min==max,max=min
    list[minIndex]=max
    list[maxIndex]=min
    list.forEach{print("$it ")}
}