// Shallow
dsl {
  val s = "foobar"
  s.charAt(1)
}
// Compiler error
[error] method charAt on class String is not supported in example.dsl:
  s.charAt(1)
    ^
