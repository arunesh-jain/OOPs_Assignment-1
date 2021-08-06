package Arunesh

import java.util.Scanner

object MainQueue {
  def main(args: Array[String]): Unit =
  {
    println("Enter your choice: ")
    println("1 For SquareQueue:")
    println("2 For DoubleQueue:")
    val scan=new Scanner(System.in)
    val number = scan.nextInt()
    number match
    {
      case 1=>
        val value1=new SquareQueue()
        value1.Enque();

      case 2=>
        val value2=new DoubleQueue()
        value2.Enque();

    }
  }

}
