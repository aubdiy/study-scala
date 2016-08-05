class Person(var age: Int = 0) {
  if (age < 0) {
    age = 0
  }
}

new Person(-11).age