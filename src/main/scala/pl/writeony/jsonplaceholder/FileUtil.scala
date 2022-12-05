package pl.writeony.jsonplaceholder

import cats.effect._

import java.io._
import java.nio.file.Path

object FileUtil {

  def writeLinesToFile(content: String)(path: Path): IO[Unit] =
    fileWriter(path.toFile).use(writeLines(content)(_))

  def fileWriter(f: File): Resource[IO, FileWriter] =
    Resource.make(IO(new FileWriter(f))) { writer =>
      IO(writer.close()).handleErrorWith(_ => IO.unit)
    }

  def writeLines(content: String)(writer: FileWriter): IO[Unit] =
    IO(writer.write(content))

  def closeWriteFile(writer: FileWriter): IO[Unit] =
    IO(writer.close())
}
