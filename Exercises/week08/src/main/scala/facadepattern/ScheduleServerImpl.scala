package facadepattern

//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = print("Booting \n")


  override def readSystemConfigFile: Unit = print("Reading ConfigFile \n")

  override def init: Unit = print("Initializing \n")

  override def initializeContext: Unit = print("Context \n")

  override def initializeListeners: Unit = print("Listeners \n")

  override def createSystemObjects: Unit = print("System objects  \n")

  override def releaseProcesses: Unit = print("Release processes \n")

  override def destory: Unit = print("Destroy \n")

  override def destroySystemObjects: Unit = print("Destroy objects \n")

  override def destoryListeners: Unit = print("Destroy listeners \n")

  override def destoryContext: Unit = print("Destroy context \n")

  override def shutdown: Unit = print("Shutdown \n")
}
