package Arunesh

import scala.collection.immutable.Queue

class DoubleQueue extends Queue1
{
  override def Enque(): Unit =
  {
    println("elements in the queue:")
    val queue = Queue(15, 17, 19, 21, 23)
    queue.foreach{(element:Int) => print(element + " ")}

    println("\nEnqueues the Element After Doubling Them:")
    queue.foreach{(element:Int) => print((element * 2) + " ")}

    println("\nFirst Element  after Enqueuing is: " + queue.front * 2)
    val var_dequeue = queue.dequeue
    println("\nDequeued First Element From Queue: " + var_dequeue)

  }
}