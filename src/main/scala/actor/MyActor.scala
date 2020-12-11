package actor

import scala.actors.Actor

class MyActor extends Actor{
  override def act(): Unit = {
    loop{
      react{
        case "start" => println("starting...")
        case "stop" =>
          println("stop")
        case _ =>
          println("error")
      }
    }
  }
}
