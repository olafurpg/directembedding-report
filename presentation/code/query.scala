
  trait Query[T, C[_]] { // Shallow
    @reifyAsInvoked
    def map[U](f: T => U): Query[U, C]
  }

