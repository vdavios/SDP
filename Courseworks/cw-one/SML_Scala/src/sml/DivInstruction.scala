package src.sml


class DivInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int) extends
  Instruction(label,op){

  override def execute(m: Machine): Unit = {
    val val1 = m.regs(op1)
    val val2 = m.regs(op2)
    m.regs(result) = val1/val2
  }
  override def toString() = {
    super.toString() + "" + op1 + " / " + op2 + " to " + result + "\n"
  }
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int): DivInstruction =
    new DivInstruction(label, "div", result, op1, op2)
}
