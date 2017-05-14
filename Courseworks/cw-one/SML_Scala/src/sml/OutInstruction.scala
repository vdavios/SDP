package src.sml


class OutInstruction(label: String, op: String, val valToPrint: Int) extends Instruction(label, op) {
  override def execute(m: Machine): Unit = println(s"${m.regs(valToPrint)} ")

  override def toString(): String = {
    super.toString + " " + s"prints register: $valToPrint" + "\n"
  }

}

object OutInstruction {
  def apply(label: String, register: Int): OutInstruction =
    new OutInstruction(label, "out", register)
}
