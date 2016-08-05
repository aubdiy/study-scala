import java.util.TimeZone

val ds: Array[String] = TimeZone.getAvailableIDs

val americaArr: Array[String] = ds.filter(_.startsWith("America/"))

val sorted: Array[String] = americaArr.map(_.drop(8)).sorted

