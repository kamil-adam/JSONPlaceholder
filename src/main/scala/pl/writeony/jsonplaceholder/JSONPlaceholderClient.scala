package pl.writeony.jsonplaceholder

import cats.effect._
import org.http4s.client._

//
class JSONPlaceholder {

  val httpClient: Client[IO] = JavaNetClientBuilder[IO].create

  val readPosts: IO[String] = httpClient.expect[String]("https://jsonplaceholder.typicode.com/posts")

}

