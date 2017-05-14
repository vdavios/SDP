package src.sml


class OutInstruction(label: String, op: String, val regToPrint: Int) extends Instruction(label, op) {
  override def execute(m: Machine): Unit = println(s"${m.regs(regToPrint)} ")

  override def toString(): String = {
    super.toString + " " + s"prints register: $regToPrint" + "\n"
  }

}

object OutInstruction {
  def apply(label: String, register: Int): OutInstruction =
    new OutInstruction(label, "out", register)
}
