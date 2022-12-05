package pl.writeony.jsonplaceholder

import cats.effect._
import cats.implicits._
import io.circe.syntax.EncoderOps
import pl.writeony.jsonplaceholder.FileUtil.writeLinesToFile

import java.nio.file.Path

object Main extends IOApp {

  def run(args: List[String]): IO[ExitCode] = (for {
    posts <- new JSONPlaceholderClient().readPosts
    result <- posts.traverse_ { post =>
      writeLinesToFile(post.asJson.toString)(Path.of(post.id.toString + ".json"))
    }
  } yield result).as(ExitCode.Success)
}
