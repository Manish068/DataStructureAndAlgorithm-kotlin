package firstKotlin

//Take name as input and print a greeting message for that particular name.
class GreetingMessage {
   companion object{
       fun greet(name:String){
           println("Hello $name")
       }
   }
}

fun main(){
    GreetingMessage.greet("Manish")
}