// Inside Query trait.
@reifyAs(Take)
def take(i: Long): Query[T, C] = ???
// Shallow query.
query {
  Query.take(1)
}
// Deep query.
Take(Query, lift(1))
