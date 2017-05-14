package Adapter

class XpToPdAdapter {

  implicit def adapt(xpay: XpayImpl) : PayD = new PayD {
    override def getCardExpMonthDate: String = xpay.getCardExpMonth

    override def getCardOwnerName: String = xpay.getCustomerName

    override def getCustCardNo: String = xpay.getCreditCardNo

    override def getCVVNo: Int = xpay.getCardCVVNo.toInt

    override def getTotalAmount: Double = xpay.getAmount

    override def setCardExpMonthDate(cardExpMonthDate: String): Unit = xpay.
      setCardExpMonth(cardExpMonthDate)

    override def setCardOwnerName(cardOwnerName: String): Unit = xpay.
      setCustomerName(cardOwnerName)

    override def setCustCardNo(custCardNo: String): Unit = xpay.
      setCreditCardNo(custCardNo)

    override def setCVVNo(cvvNo: Int): Unit = xpay.setCardCVVNo(cvvNo.shortValue())

    override def setTotalAmount(totalAmount: Double): Unit = xpay.setAmount(totalAmount)

  }

}
