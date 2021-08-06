package Arunesh
import scala.collection.immutable.Queue


private class SquareQueue extends Queue1
{
  override  def Enque(): Unit =
  {
    println("Elements in the Queue Are:")
    val queue = Queue(5, 7, 9, 11, 13)
    queue.foreach{(element:Int) => print(element + " ")}
    println()
    println("Enqueues the Element After Squaring Them:")
    queue.foreach{(element:Int) => print((element * element) + " ")}
    println()
    println("First Element after Enqueuing is: " + queue.front*queue.front)
    val var_dequeue = queue.dequeue
    println("Dequeued First Element From Queue: " + var_dequeue)
  }

}