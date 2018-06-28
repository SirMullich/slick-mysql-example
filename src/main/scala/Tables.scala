import slick.lifted.{ProvenShape, Tag}
import slick.jdbc.MySQLProfile.api._

class Suppliers(tag: Tag) extends Table[Supplier](tag, "SUPPLIERS") {
  // This is the primary key column:
  def id: Rep[Int] = column[Int]("SUP_ID", O.PrimaryKey, O.AutoInc)
  def name: Rep[String] = column[String]("SUP_NAME")

  def * : ProvenShape[Supplier] = (id.?, name) <> (Supplier.tupled, Supplier.unapply)
}
