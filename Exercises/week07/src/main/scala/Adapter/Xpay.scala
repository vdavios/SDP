package Adapter

trait Xpay {

  def getCreditCardNo: String
  def getCustomerName: String
  def getCardExpMonth: String
  def getCarExpYear: String
  def getCardCVVNo : Short
  def getAmount: Double

  def setCreditCardNo(creditCardNo: String): Unit
  def setCustomerName(customerName: String): Unit
  def setCardExpMonth(cardExpMonth: String): Unit
  def setCardExpYear(cardExpYear: String): Unit
  def setCardCVVNo(cardCvvNo: Short): Unit
  def setAmount(amount: Double): Unit


}
