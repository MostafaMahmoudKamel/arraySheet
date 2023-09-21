import kotlin.math.*
fun main(){
    var num=readLine()!!.toInt()
    repeat(num){
        //read list
        var size=readLine()!!.toInt()
        var list=readLine()!!.split(" ").map{it.toInt()}

        //create two list to find maxmum element to each other
        var newList= mutableListOf<Int>()
        var newList2= mutableListOf<Int>()

        //printing list element
        list.forEach{print("$it ")}
        //printing max between each two element in list and add max to newList
        for(i in 0..list.size-2){
            var max=max(list[i],list[i+1])
            newList.add(max)

        }
        newList.forEach{print("$it ")}
        //loop for two new lists
        while(true) {
            //comparing each two element in newlist1 and push it in (newList2)
            if (newList.size>1) {
                for (i in 0..newList.size - 2) {
                    var max = max(newList[i], newList[i + 1])
                    newList2.add(max)
                }
                newList2.forEach { print("$it ") }
                newList.clear()
            }else{
                newList2.forEach{print("$it ")}
                break
            }
            //comparing each two element in newlist2 and push it in (newList1)

            if (newList2.size>1) {
                for (i in 0..newList2.size - 2) {
                    var max = max(newList2[i], newList2[i + 1])
                    newList.add(max)
                }
                newList.forEach { print("$it ") }
                newList2.clear()
            }
            else{
                newList.forEach{print("$it ")}
                break
            }

        }
    println()
    }
}