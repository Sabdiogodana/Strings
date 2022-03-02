fun main(){
name()
  var x =collection("Sabdio",21)
  println(x)

  var c=city("Nairobi")
    println(c.count())
  realName("Sabdio Godana")
}
fun name(){
  var name ="Akirachix"
  var x =name[0].toString()+name[2]+name[3]
  println(x)
}
fun collection(name:String,age:Int){
  println("Hi, my name is $name and i am $age years old")

  }
fun city(name:String):String{
  return name
}
fun realName(name:String){
  if(name==("Sabdio Godana")){
    println("that is me!")
  }
  else
    println("I don't know who that is")
}