  case class User(id: Int, name: String)

  // Lifted embedding table
  class Users(tag: Tag)
    extends Table[User](tag, "User") {

    def id: Rep[Int] = column[Int]("id")
    def name: Rep[String] = column[String]("name")

    def * = ProvenShape.proveShapeOf((id, name) <> ((User.apply _).tupled, User.unapply))
  }
