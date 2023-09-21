import kotlin.system.exitProcess
fun check(a:Int ,b:Int,s:String):String{
    if(s.length!=a+b+1)
        return "No"
    if(s[a]!='-')
        return "No"
    for(i in 0..s.length-1){
        if(!s[i].isDigit()&&i!=a)
            return "No"
    }
    return "Yes"
}
fun main(){
    //read list of two variable a,b
    var list=readLine()!!.split(" ")
    var a=list[0].toInt()
    var b=list[1].toInt()
    //string
    var s=readLine()!!
    println(check(a,b,s))







}