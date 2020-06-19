


class c12312914 {

    public static void testclass(String[] args) throws IOException, CodeCheckException {
        ClassWriter writer = new ClassWriter();
        MyHelperClass ClassWriter = new MyHelperClass();
        writer.emptyClass(ClassWriter.ACC_PUBLIC, "TestClass", "java/lang/Object");
//        MyHelperClass ClassWriter = new MyHelperClass();
        MethodInfo newMethod =(MethodInfo)(Object) writer.addMethod((int)(Object)ClassWriter.ACC_PUBLIC | (int)(Object)ClassWriter.ACC_STATIC, "main", "([Ljava/lang/String;)V");
        CodeAttribute attribute =(CodeAttribute)(Object) newMethod.getCodeAttribute();
        int constantIndex =(int)(Object) writer.getStringConstantIndex("It's alive! It's alive!!");
//        MyHelperClass ClassWriter = new MyHelperClass();
        int fieldRefIndex =(int)(Object) writer.getReferenceIndex(ClassWriter.CONSTANT_Fieldref, "java/lang/System", "out", "Ljava/io/PrintStream;");
//        MyHelperClass ClassWriter = new MyHelperClass();
        int methodRefIndex =(int)(Object) writer.getReferenceIndex(ClassWriter.CONSTANT_Methodref, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
        ArrayList instructions = new ArrayList();
        byte[] operands;
        operands = new byte[2];
        MyHelperClass NetByte = new MyHelperClass();
        NetByte.intToPair(fieldRefIndex, operands, 0);
        MyHelperClass OpCode = new MyHelperClass();
        instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("getstatic"), 0, operands, false));
        operands = new byte[1];
        operands[0] = (byte) constantIndex;
//        MyHelperClass OpCode = new MyHelperClass();
        instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("ldc"), 0, operands, false));
        operands = new byte[2];
//        MyHelperClass NetByte = new MyHelperClass();
        NetByte.intToPair(methodRefIndex, operands, 0);
//        MyHelperClass OpCode = new MyHelperClass();
        instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("invokevirtual"), 0, operands, false));
//        MyHelperClass OpCode = new MyHelperClass();
        instructions.add(new Instruction(OpCode.getOpCodeByMnemonic("return"), 0, null, false));
        attribute.insertInstructions(0, 0, instructions);
        attribute.setMaxLocals(1);
        attribute.codeCheck();
        System.out.println("constantIndex=" + constantIndex + " fieldRef=" + fieldRefIndex + " methodRef=" + methodRefIndex);
        writer.writeClass(new FileOutputStream("c:/cygnus/home/javaodb/classes/TestClass.class"));
        writer.readClass(new FileInputStream("c:/cygnus/home/javaodb/classes/TestClass.class"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACC_PUBLIC;
	public MyHelperClass CONSTANT_Fieldref;
	public MyHelperClass CONSTANT_Methodref;
	public MyHelperClass ACC_STATIC;
public MyHelperClass intToPair(int o0, byte[] o1, int o2){ return null; }
	public MyHelperClass getOpCodeByMnemonic(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CodeCheckException extends Exception{
	public CodeCheckException(String errorMessage) { super(errorMessage); }
}

class ClassWriter {

public MyHelperClass addMethod(int o0, String o1, String o2){ return null; }
	public MyHelperClass getStringConstantIndex(String o0){ return null; }
	public MyHelperClass writeClass(FileOutputStream o0){ return null; }
	public MyHelperClass getReferenceIndex(MyHelperClass o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass emptyClass(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass readClass(FileInputStream o0){ return null; }}

class MethodInfo {

public MyHelperClass getCodeAttribute(){ return null; }}

class CodeAttribute {

public MyHelperClass insertInstructions(int o0, int o1, ArrayList o2){ return null; }
	public MyHelperClass setMaxLocals(int o0){ return null; }
	public MyHelperClass codeCheck(){ return null; }}

class ArrayList {

public MyHelperClass add(Instruction o0){ return null; }}

class Instruction {

Instruction(MyHelperClass o0, int o1, Object o2, boolean o3){}
	Instruction(MyHelperClass o0, int o1, byte[] o2, boolean o3){}
	Instruction(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
