package ###PACKAGE_NAME###

import com.twitter.finatra._
import com.twitter.finatra.ContentType._
import com.twitter.ostrich.stats.Stats

object App {

  __EXAMPLEAPP__

  def main(args: Array[String]) = {
    FinatraServer.register(app)
    FinatraServer.start()
  }
}
