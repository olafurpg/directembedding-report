object SlickReification {
  def slick_===[T](lhs: lifted.Rep[T], rhs: lifted.Rep[T]): Rep[Option[Boolean]] = {
    columnExtensionMethods(lhs) === rhs
  }
  def column[T, C](e: AnyRef,
        field: Rep[String],
        tt: TypedType[C]): Rep[C]
  // 20 more LOC
}
