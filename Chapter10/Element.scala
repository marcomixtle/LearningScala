abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}

val ae = new ArrayElement(Array("hello", "world"))
println (ae)
println (ae.contents)
println (ae.width)
println (ae.width)

val e: Element = new ArrayElement(Array("hello"))
println (e.contents)

val blah = new LineElement("This is mein string")

println(blah.width)
println(blah.height)