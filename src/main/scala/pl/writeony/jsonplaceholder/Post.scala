package pl.writeony.jsonplaceholder

import io.circe._
import io.circe.generic.semiauto._

object Post {
  type Posts = List[Post]
  implicit val postDecoder: Decoder[Post] = deriveDecoder
  implicit val postEncoder: Encoder[Post] = deriveEncoder
  val postsDecoder: Decoder[Posts] = Decoder.decodeList

  def decodeList(input: String): Either[Error, Posts] = parser.decode(input)(postsDecoder)
}

case class Post(userId: Int, id: Int, title: String, body: String)
