[error] /Users/ollie/Dropbox/epfl/2014-2015/spring/lamp/slick-direct/slick-direct/src/test/scala/ch/epfl/lamp/slick/direct/TakeSpec.scala:17: type mismatch;
[error]  found   : String("")
[error]  required: Long
[error]         users.take("")
[error]                    ^
[error] /Users/ollie/Dropbox/epfl/2014-2015/spring/lamp/slick-direct/slick-direct/src/test/scala/ch/epfl/lamp/slick/direct/TakeSpec.scala:19: overloaded method value take with alternatives:
[error]   (num: Int)slick.lifted.Query[ch.epfl.lamp.slick.direct.Users,ch.epfl.lamp.slick.direct.Users#TableElementType,Seq] <and>
[error]   (num: Long)slick.lifted.Query[ch.epfl.lamp.slick.direct.Users,ch.epfl.lamp.slick.direct.Users#TableElementType,Seq] <and>
[error]   (num: slick.lifted.ConstColumn[Long])slick.lifted.Query[ch.epfl.lamp.slick.direct.Users,ch.epfl.lamp.slick.direct.Users#TableElementType,Seq]
[error]  cannot be applied to (String)
[error]       liftedUsers.take("").result
[error]                   ^
