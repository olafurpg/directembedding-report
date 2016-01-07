// Inside Query trait.
@reifyAsInvoked
def take(i: Long): Query[T, C] = ???
// Shallow query.
query {
  query.take(1)
}
// Deep query.
lift(query).take(lift(1))
