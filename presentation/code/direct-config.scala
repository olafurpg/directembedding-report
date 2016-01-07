trait Query[T, C[_]]
  @reifyAsInvoked
  def filter(f: T => Boolean): Query[T, C]

@reifyAs(SlickReification.column _)
def column[T, C](e: T, name: String,
                  tt: TypedType[C]): C
@reifyAs(SlickReification.slick_=== _)
def infix_==(a: Int, b: Int): Boolean = ???

object SlickPredef
  @passThrough
  def implicitly[T]: T

