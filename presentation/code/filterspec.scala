  "filter" should "work with string equality" in {
    equalQueries(
      query {
        directUsers.filter(_.name == "Olafur")
      }.result,
      liftedUsers.filter(_.name === "Olafur").result
    )
  } // Success
