


class c12312913 {

    public static void rewrite(String[] args) throws IOException, CodeCheckException {
        ClassWriter writer = new ClassWriter();
        writer.readClass(new FileInputStream(args[0]));
        for (Iterator i =(Iterator)(Object) writer.getMethods().iterator();(boolean)(Object) i.hasNext(); ) {
            MethodInfo method = (MethodInfo)(MethodInfo)(Object) i.next();
            CodeAttribute attribute =(CodeAttribute)(Object) method.getCodeAttribute();
            int origStack =(int)(Object) attribute.getMaxStack();
            System.out.print(method.getName());
            attribute.codeCheck();
            System.out.println(" " + origStack + " " + attribute.getMaxStack());
        }
        BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(args[1]));
        writer.writeClass(outStream);
        outStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CodeCheckException extends Exception{
	public CodeCheckException(String errorMessage) { super(errorMessage); }
}

class ClassWriter {

public MyHelperClass readClass(FileInputStream o0){ return null; }
	public MyHelperClass getMethods(){ return null; }
	public MyHelperClass writeClass(BufferedOutputStream o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class MethodInfo {

public MyHelperClass getCodeAttribute(){ return null; }
	public MyHelperClass getName(){ return null; }}

class CodeAttribute {

public MyHelperClass getMaxStack(){ return null; }
	public MyHelperClass codeCheck(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
