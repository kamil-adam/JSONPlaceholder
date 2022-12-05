package pl.writeony.jsonplaceholder

import cats.effect._
import org.http4s.client._

class JSONPlaceholderClient {

  val httpClient: Client[IO] = JavaNetClientBuilder[IO].create

  val readPosts: IO[List[Post]] =
    for {
      response <- httpClient.expect[String]("https://jsonplaceholder.typicode.com/posts")
      result <- IO.fromEither(Post.decodeList(response))
    } yield result

}

