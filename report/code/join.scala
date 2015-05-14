// slick.lifted
def joinFull[E1 >: E, E2, U2, D[_], O1, U1, O2](q2: Query[E2, _, D])
  (implicit ol1: OptionLift[E1, O1],
            sh1: Shape[FlatShapeLevel, O1, U1, _],
            ol2: OptionLift[E2, O2],
            sh2: Shape[FlatShapeLevel, O2, U2, _]): BaseJoinQuery[O1, O2, U1, U2, C, E1, E2]
// slick.direct
def joinFull[T2, D[_]](q: Query[T2, D]): BaseJoinQuery[Option[T], Option[T2], T, T2, C]

