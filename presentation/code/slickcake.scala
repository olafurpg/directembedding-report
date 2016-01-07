trait YYSlickCakeTuples {
  type Tuple2[T1,T2] = YYTuple2[T1,T2]
  implicit def yyRepTuple2ToYYTuple[T1,T2](x: CakeRep[scala.Tuple2[T1,T2]]): Tuple2[T1,T2]
        = x.asInstanceOf[Tuple2[T1,T2]]
  // 1300 more LOC for up to Tuple22...
}
trait YYSlickCake with YYSlickCakeTuples {
    implicit def yyColumnOptionToYYOption[T](x: YYColumn[scala.Option[T]]): YYOption[T]
                  = YYOption.fromYYColumn(x)
  // ...
}
