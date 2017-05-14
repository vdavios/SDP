package src.sml;


import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ArrayList;

public class InstructionFactory {
  private List<String> op = new ArrayList<String>(){{
  add("add");
  add("bnz");
  add("div");
  add("lin");
  add( "mul");
  add("out");
  add("sub");
  }};

  public List<String> getOp(){
    return op;
  }

  public Instruction iSwitch(String[] fields) {
    switch (fields[1]) {
      case "add" :
        return add(fields[0],"add", fields[2], fields[3], fields[4]);
      case "bnz" :
        return bnz(fields[0],"bnz", fields[2], fields[3]);
      case "div" :
        return div(fields[0],"div", fields[2], fields[3], fields[4]);
      case "lin" :
        return lin(fields[0], "lin", fields[2], fields[3]);
      case "mul" :
        return mul(fields[0],"mul", fields[2], fields[3], fields[4]);
      case "out" :
        return out(fields[0], "out", fields[2]);
      case "sub" :
        return sub(fields[0],"sub", fields[2], fields[3], fields[4]);
        default:
          return null;
    }

  }

  private Instruction add(String label, String op, String result, String op1, String op2 ) {
    Class<AddInstruction> rClass = AddInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, int.class, int.class).
              newInstance(label, op, Integer.parseInt(result), Integer.parseInt(op1), Integer.parseInt(op2));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction bnz(String label, String op, String register, String jumpTo ) {
    Class<BnzInstruction> rClass = BnzInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, String.class).
              newInstance(label, op, Integer.parseInt(register), jumpTo);
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction div(String label, String op, String result, String op1, String op2 ) {
    Class<DivInstruction> rClass = DivInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, int.class, int.class).
              newInstance(label, op, Integer.parseInt(result), Integer.parseInt(op1), Integer.parseInt(op2));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction lin(String label, String op, String register, String value) {
    Class<LinInstruction> rClass = LinInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, int.class).
              newInstance(label, op, Integer.parseInt(register), Integer.parseInt(value));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction mul(String label, String op, String result, String op1, String op2 ) {
    Class<MulInstruction> rClass = MulInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, int.class, int.class).
              newInstance(label, op, Integer.parseInt(result), Integer.parseInt(op1), Integer.parseInt(op2));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction out(String label, String op, String valToPrint ) {
    Class<OutInstruction> rClass = OutInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class).
              newInstance(label, op, Integer.parseInt(valToPrint));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

  private Instruction sub(String label, String op, String result, String op1, String op2 ) {
    Class<SubInstruction> rClass = SubInstruction.class;
    Object constructor = null;
    try {
      constructor = rClass.getConstructor(String.class, String.class, int.class, int.class, int.class).
              newInstance(label, op, Integer.parseInt(result), Integer.parseInt(op1), Integer.parseInt(op2));
    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    return (Instruction) constructor;
  }

}
