package observer

import scala.collection.mutable.ListBuffer

object TestObserver extends App {
    val obj: Subject = new CommentaryObject(ListBuffer[Observer](), "Soccer Match [2014AUG24]")
    val observer: Observer = new SMSUsers(obj, "Adam Warner [New York]")
    val observer2: Observer = new SMSUsers(obj, "Tim Ronney [London]")
    observer.subscribe()
    observer2.subscribe()
    println("-"*40)

    obj.asInstanceOf[Commentary].setDesc("Welcome to live Soccer match")
    obj.asInstanceOf[Commentary].setDesc("Current score 0-0")
    observer.unSubscribe
    obj.asInstanceOf[Commentary].setDesc("It's a goal!!")
    obj.asInstanceOf[Commentary].setDesc("Current score 1-0")
}
