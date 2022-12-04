package pl.writeony.jsonplaceholder

import cats.effect._

object Main extends IOApp {

  def run(args: List[String]): IO[ExitCode] =
    new JSONPlaceholderClient().readPosts.as(ExitCode.Success)
}
