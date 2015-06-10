// Inside Query trait.
@passThrough
def take(i: Long): Query[T, C]
def missingAnnotation(): Int = 1
// Shallow query.
query {
  Query.take(missingAnnotation())
}
// Deep query.
lift(Query).take(missingAnnotation())
