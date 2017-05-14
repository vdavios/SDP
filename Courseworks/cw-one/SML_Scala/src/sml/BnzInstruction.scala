package src.sml


class BnzInstruction(label: String, op: String, register: Int, toLabel: String) extends Instruction(label, op) {
  override def execute(m: Machine): Unit = {
    if (m.regs(register) != 0) {
      m.pc = m.labels.labels.indexWhere(p => p.equals(toLabel), 0)
    }
  }

  override def toString(): String =
    super.toString() + s" if reg: $register != 0 jump to $toLabel" + "\n"

}

object BnzInstruction {
  def apply(label: String, register: Int, toLabel: String): BnzInstruction =
    new BnzInstruction(label, "bnz", register, toLabel)
}
