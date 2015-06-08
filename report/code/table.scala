class Users(tag: Tag) extends Table[User](tag, "User") {

  def id: Rep[Int] = column[Int]("id")
  def name: Rep[String] = column[String]("name")

  def * = ProvenShape.proveShapeOf((id, name) <> ((User.apply _).tupled, User.unapply))
}

class Cars(tag: Tag)
  extends Table[Car](tag, "Car") {

  def id: Rep[Int] = column[Int]("id", O.PrimaryKey)
  def name: Rep[String] = column[String]("name")
  def ownerId: Rep[Int] = column[Int]("ownerId")
  // Foreign key constraint
  def ownerIdFk = foreignKey("ownerIdFk", ownerId, TableQuery[Users])(_.id)

  def * = ProvenShape.proveShapeOf((id, name, ownerId) <> (Car.tupled, Car.unapply))
}
