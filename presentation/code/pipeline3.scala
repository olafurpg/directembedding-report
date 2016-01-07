import DslConfig._
class UserTable extends Table[User] { /* ... */ }
UserTable.filter { u => infix_==(
    shallowColumn(u, "name",
      implicitly[TypedType[String]]),
    "Olafur"
  )
}
