fun main(){
    var size=readLine()!!.toInt()
    var list =readLine()!!.split(" ").map{it.toInt() }
//    list.map{if(it>0)it=1 else it=2}//must safe in new list
    var newList=list.map{
        if(it>0)
            1
        else if(it<0)
        2
        else
            0

    }
    
    for (i in newList){
        print("$i ")
    }
}

