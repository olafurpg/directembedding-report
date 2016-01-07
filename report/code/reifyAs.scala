// Inside Query trait.
@reifyAs(Take)
def take(i: Long): Query[T, C] = ???
// Shallow query.
query {
  query.take(1)
}
// Deep query.
Take(lift(query), lift(1))
