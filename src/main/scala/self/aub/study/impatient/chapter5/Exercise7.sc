class Person(var user:String){
  var userArr = user.split(' ');
  val firstName = userArr(0);
  val lastName = userArr(1);
}

new Person("liu jinxin").firstName