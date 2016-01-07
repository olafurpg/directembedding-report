class UserTable extends Table[User] { /* ... */ }
UserTable.filter { u =>
  column(u, "name", implicitly[TypedType[String]]) == "Olafur"
}
