package abstractfactory

trait XMLParser {
  def parse : String

}

case class NYCErrorXMLParser() extends XMLParser {
  override def parse: String = "NYC error message"
}

case class NYCFeedbackXMLParser() extends  XMLParser {
  override def parse: String = "NYC feedback"
}

case class NYCRESPONSEXMLParser() extends  XMLParser {
  override def parse: String = "NYC response"
}

case class NYCOrderXMLParser() extends XMLParser {
  override def parse: String = "NYC order"
}

case class LondonOrderXMLParser() extends XMLParser {
  override def parse: String = "London order"
}
case class LondonErrorXMLParser() extends  XMLParser {
  override def parse: String = "London error message"
}
case class LondonFeedbackXMLParser() extends XMLParser {
  override def parse: String = "London feedback"
}
case class LondonResponseXMLParser() extends XMLParser {
  override def parse: String = "London response"
}




