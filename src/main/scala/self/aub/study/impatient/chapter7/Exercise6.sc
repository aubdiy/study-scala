import java.util.Calendar

import scala.collection.mutable

val result: mutable.LinkedHashMap[String, Int] = new mutable.LinkedHashMap[String ,Int]

result("MONDAY")=Calendar.MONDAY
result("TUESDAY")=Calendar.TUESDAY
result("WEDNESDAY")=Calendar.WEDNESDAY
result("THURSDAY")=Calendar.THURSDAY
result("FRIDAY")=Calendar.FRIDAY
result("SATURDAY")=Calendar.SATURDAY
result("SUNDAY")=Calendar.SUNDAY

result.mkString(",")