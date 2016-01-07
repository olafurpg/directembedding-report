import DslConfig._
class UserTable extends Table[User] { /* ... */ }
lift(UserTable).filter { u => slick_===(
    deepColumn(u, lift("name"),
      implicitly[TypedType[String]]),
    lift("Olafur")
  )
}
