import slick.lifted.TableQuery

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.Await


object Boot extends App {
  val suppliers = TableQuery[Suppliers]

  val db = Database.forConfig("mysql")

  try {
    Await.result(db.run(DBIO.seq(

      suppliers.schema.create,

      suppliers += Supplier(name = "Daulet"),
      suppliers += Supplier(name = "Rustem"),

      suppliers.result.map(println)

    )), Duration.Inf)
  } finally db.close()
}
