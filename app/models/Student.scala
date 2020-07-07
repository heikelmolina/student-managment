package models

import play.api.libs.json.Json

case class Student(document: Long,
                   name: String,
                   lastName: String,
                   courses: List[Course])

object Student {
  implicit val studentFormat = Json.format[Student]
}
