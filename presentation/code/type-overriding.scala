class MyInt {
  @reifyAs(IntPlus)
  def +(x: Int): Int = ???
}
// Shallow
dsl {
  val x = 1
  x + 2
}
// Deep
IntPlus(x, lift(1))

