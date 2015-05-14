// slick.lifted
def filter[T <: Rep[_]](f: E => T)(implicit wt: CanBeQueryCondition[T]): Query[E, U, C]
// slick.direct
def map[U](f: T => U): Query[U, C]

