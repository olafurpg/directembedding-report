// slick.lifted
for {
  user <- users
  car <- cars if car.ownerId  === user.id
} yield user.name ++ " drives a " ++ car.name
// slick.direct
query {
  for {
    user <- users
    car <- cars if car.ownerId  == user.id
  } yield user.name + " drives a " + car.name
}
