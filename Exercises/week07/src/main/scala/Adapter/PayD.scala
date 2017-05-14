package Adapter

trait PayD {

  def getCustCardNo: String
  def getCardOwnerName: String
  def getCardExpMonthDate: String
  def getCVVNo: Int
  def getTotalAmount: Double

  def setCustCardNo(custCardNo: String)
  def setCardOwnerName(cardOwnerName: String)
  def setCardExpMonthDate(cardExpMonthDate: String)
  def setCVVNo(cvvNo: Int)
  def setTotalAmount(totalAmount: Double)

}
