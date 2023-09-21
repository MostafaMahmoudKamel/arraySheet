fun main(){
    //read array size
    var size=readLine()!!.toInt()
    //read array
    var list=readLine()!!.split(" ").map{it.toInt()}
    //min element in array
    var min=list[0]
    //count min element frequency in array
    var counter=0
    for(element in list){
        if(element<min)
            min=element
    }
    for(element in list){
        if(element==min)
            counter++
    }
    if(counter%2==0)//even
        println("Unlucky")
    else
        println("Lucky")
}