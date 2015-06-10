// Inside Query trait.
@reifyAsInvoked
def take(i: Long): Query[T, C] = ???
// Shallow query.
query {
  Query.take(1)
}
// Deep query.
lift(Query).take(lift(1))
