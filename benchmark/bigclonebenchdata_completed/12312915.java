import java.io.*;
import java.lang.*;
import java.util.*;



class c12312915 {

    public static void entering(String[] args) throws IOException, CodeCheckException {
        ClassWriter writer = new ClassWriter();
        writer.readClass(new BufferedInputStream(new FileInputStream(args[0])));
        int constantIndex =(int)(Object) writer.getStringConstantIndex("Entering ");
        MyHelperClass ClassWriter = new MyHelperClass();
        int fieldRefIndex =(int)(Object) writer.getReferenceIndex(ClassWriter.CONSTANT_Fieldref, "java/lang/System", "out", "Ljava/io/PrintStream;");
//        MyHelperClass ClassWriter = new MyHelperClass();
        int printlnRefIndex =(int)(Object) writer.getReferenceIndex(ClassWriter.CONSTANT_Methodref, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
//        MyHelperClass ClassWriter = new MyHelperClass();
        int printRefIndex =(int)(Object) writer.getReferenceIndex(ClassWriter.CONSTANT_Methodref, "java/io/PrintStream", "print", "(Ljava/lang/String;)V");
        for (Iterator i =(Iterator)(Object) writer.getMethods().iterator(); i.hasNext(); ) {
            MethodInfo method = (MethodInfo) i.next();
            if (method.getName().equals("readConstant")) continue;
            CodeAttribute attribute =(CodeAttribute)(Object) method.getCodeAttribute();
            ArrayList instructions = new ArrayList(10);
            byte[] operands;
            operands = new byte[2];
            MyHelperClass NetByte = new MyHelperClass();
            NetByte.intToPair(fieldRefIndex, operands, 0);
            MyHelperClass OpCode = new MyHelperClass();
            instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("getstatic"), 0, operands, false));
//            MyHelperClass OpCode = new MyHelperClass();
            instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("dup"), 0, null, false));
            MyHelperClass Instruction = new MyHelperClass();
            instructions.add(Instruction.appropriateLdc(constantIndex, false));
            operands = new byte[2];
//            MyHelperClass NetByte = new MyHelperClass();
            NetByte.intToPair(printRefIndex, operands, 0);
//            MyHelperClass OpCode = new MyHelperClass();
            instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("invokevirtual"), 0, operands, false));
//            MyHelperClass Instruction = new MyHelperClass();
            instructions.add(Instruction.appropriateLdc((int)(Object)writer.getStringConstantIndex((String)(Object)method.getName()), false));
            operands = new byte[2];
//            MyHelperClass NetByte = new MyHelperClass();
            NetByte.intToPair(printlnRefIndex, operands, 0);
//            MyHelperClass OpCode = new MyHelperClass();
            instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("invokevirtual"), 0, operands, false));
            attribute.insertInstructions(0, 0, instructions);
            attribute.codeCheck();
        }
        BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(args[1]));
        writer.writeClass(outStream);
        outStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONSTANT_Methodref;
	public MyHelperClass CONSTANT_Fieldref;
public MyHelperClass getOpCodeByMnemonic(String o0){ return null; }
	public MyHelperClass appropriateLdc(int o0, boolean o1){ return null; }
	public MyHelperClass intToPair(int o0, byte[] o1, int o2){ return null; }
	public MyHelperClass iterator(){ return null; }}

class CodeCheckException extends Exception{
	public CodeCheckException(String errorMessage) { super(errorMessage); }
}

class ClassWriter {

public MyHelperClass readClass(BufferedInputStream o0){ return null; }
	public MyHelperClass getReferenceIndex(MyHelperClass o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass writeClass(BufferedOutputStream o0){ return null; }
	public MyHelperClass getStringConstantIndex(String o0){ return null; }
	public MyHelperClass getMethods(){ return null; }}

class MethodInfo {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getCodeAttribute(){ return null; }}

class CodeAttribute {

public MyHelperClass codeCheck(){ return null; }
	public MyHelperClass insertInstructions(int o0, int o1, ArrayList o2){ return null; }}

class Instruction {

Instruction(){}
	Instruction(MyHelperClass o0, int o1, byte[] o2, boolean o3){}
	Instruction(MyHelperClass o0, int o1, Object o2, boolean o3){}}
