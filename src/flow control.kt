fun main() {
    numbers()
     println(names(arrayOf("billy","miriam","oluoch")))
    robot(6)
    robot(15)
    robot(20)
    robot(4)
    robot(12)
    number()


}
fun numbers(){
    for(k in 1..100){
        if (k%2!=0){
            println(k)
        }
    }
}
fun names(name:Array<String>):Int{
    var m=0
    for (jina in name){
        if (jina.length>5){
            m++
        }
    }
return m
}fun robot(age:Int){
    if (age<6){
        println("Have a glass of milk")
    }
    else if (age>6 && age<15){
        println("You can have your bottles of fanta orange")
    }
    else{
        println("You all can have cocacola bottles")
    }
}
fun number() {
    for (b in 1..100) {
        if (b % 3 ==0) {
            println("Fizz")
        } else if (b % 5==0) {
            println("Buzz")
        } else if (b%3==0 && b%5==0){
            println("FizzBuzz")
        }else if (b%3!=0 && b%5!=0){
            println(b)
        }


    }
}















