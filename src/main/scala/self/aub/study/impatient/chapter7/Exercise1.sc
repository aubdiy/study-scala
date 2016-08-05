package com {

  class C1 {}
  package horstmann {

    class C2(c1: C1) {}

    package impatient {

      class C3(c1: C1, c2: C2) {}

    }

  }

}