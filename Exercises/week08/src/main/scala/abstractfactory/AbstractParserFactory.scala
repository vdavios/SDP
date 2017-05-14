package abstractfactory

trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}

case class NYCFactory() extends AbstractParserFactory{
   override def getParserInstance(parserType: String): XMLParser = parserType.toUpperCase match {
     case "NYCORDER" => NYCOrderXMLParser()
     case "NYCERROR" => NYCErrorXMLParser()
     case "NYCFEEDBACK" => NYCFeedbackXMLParser()
     case "NYCRESPONSE" => NYCRESPONSEXMLParser()
   }

}

case class LondonFactory() extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType.toUpperCase match {
    case "LONDONORDER" => LondonOrderXMLParser()
    case "LONDONERROR" => LondonErrorXMLParser()
    case "LONDONFEEDBACK" => LondonFeedbackXMLParser()
    case "LONDONRESPONSE" => LondonResponseXMLParser()
  }
}
