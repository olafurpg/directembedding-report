  trait Query[T] // Shallow
    def map[S](projection: T => S): Query[S]
  trait YYQuery[T] // Shadow
    def map[S](projection: YYRep[T] => YYRep[S]): YYQuery[S]
          = YYQuery.fromQuery(
            query.map(underlyingProjection(projection))
            (YYShape.ident[S]))
  trait Query[E, T] // Lifted
    def map[F, G, T](f: E => F)(implicit shape: Shape[F, T, G]): Query[G, T]
