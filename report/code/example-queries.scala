users
// select * from User

user.map(_.name)
// select u.name from User u

user.filter(_.id == 1)
// select * from User where id = 1

for {
  user <- users
  car <- cars if car.ownerId  === user.id
} yield (user.name, car.name)
// select u.name, c.name
// from User u, Car c
// where u.id = c.id
