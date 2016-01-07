  @Table("USER")
  case class User(
    @PrimaryKey @Column("ID")
    id: Int,
    @Column("NAME")
    name: String
  )
