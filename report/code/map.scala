// slick.lifted
def map[F, G, T](f: E => F)
  (implicit shape: Shape[_ <: FlatShapeLevel, F, T, G]): Query[G, T, C]
// slick.direct
def map[F](f: E => F): Query[F, C]

