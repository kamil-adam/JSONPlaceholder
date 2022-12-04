package pl.writeony.jsonplaceholder

import cats.effect._
import com.typesafe.scalalogging.LazyLogging
import org.http4s.client._

class JSONPlaceholderClient extends LazyLogging {

  val httpClient: Client[IO] = JavaNetClientBuilder[IO].create

  val readPosts: IO[String] = httpClient.expect[String]("https://jsonplaceholder.typicode.com/posts")
    .map { response =>
      logger.info(s"response: $response")
      response
    }

}

