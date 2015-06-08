query {
  for {
    user <- users
    car <- cars if car.ownerId  === user.id
  } yield user.name ++ " drives a " ++ car.name
}
// select concat(u.name, " drives a ", c.name)
// from User u inner join Car c
// on u.id = c.id
