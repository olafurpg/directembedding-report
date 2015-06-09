users
// select * from User

user.map(_.name)
// select u.name from User u

user.filter(_.id === 1)
// select * from User where id = 1

for {
  user <- users
  car <- cars if car.ownerId  === user.id
} yield user.name ++ " drives a " ++ car.name
// select concat(u.name, " drives a ", c.name)
// from User u, Car c
// where u.id = c.id

for {
  (u, c) <- user leftJoin cars on (_.ownerId === _.id)
} yield (u.name, c.map(_.name))
// select u.name, c.name
// from User u left out inner join Car c
// on u.id = c.id
