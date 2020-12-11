import actor.MyActor

object Main{
  def main(args: Array[String]): Unit = {
    val myActor = new MyActor
    myActor.start()
    myActor ! "start"
    myActor ! "stop"
    myActor ! "9898"
  }
}