package Adapter


class XpayImpl extends Xpay{
  private var creditCardNo: String = _
  private var customerName: String = _
  private var cardExpMonth: String = _
  private var cardExpYear: String = _
  private var cardCVVNo: Short = 0
  private var amount: Double = 0.0


  def getCreditCardNo: String = creditCardNo

  def getCustomerName: String = customerName

  def getCardExpMonth: String = cardExpMonth
  def getCarExpYear: String = cardExpYear
  def getCardCVVNo : Short = cardCVVNo
  def getAmount: Double = amount

  def setCreditCardNo(creditCardNo: String): Unit = {
    this.creditCardNo = creditCardNo
  }
  def setCustomerName(customerName: String): Unit = {
    this.customerName = customerName
  }
  def setCardExpMonth(cardExpMonth: String): Unit = {
    this.cardExpMonth = cardExpMonth
  }
  def setCardExpYear(cardExpYear: String): Unit = {
    this.cardExpYear = cardExpYear
  }
  def setCardCVVNo(cardCvvNo: Short): Unit = {
    this.cardCVVNo = cardCvvNo
  }
  def setAmount(amount: Double): Unit = {
    this.amount = amount
  }

}
