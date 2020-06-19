


class c16902397 {
public MyHelperClass getStatusFlags(MyHelperClass o0){ return null; }
public MyHelperClass transformClass(ClassWriter o0, ClassWriter[] o1){ return null; }

    private void convertClasses(File source, File destination) throws PostProcessingException, CodeCheckException, IOException {
        Stack sourceStack = new Stack();
        Stack destinationStack = new Stack();
        sourceStack.push(source);
        destinationStack.push(destination);
        while (!(Boolean)(Object)sourceStack.isEmpty()) {
            source = (File)(File)(Object) sourceStack.pop();
            destination = (File)(File)(Object) destinationStack.pop();
            if (!(Boolean)(Object)destination.exists()) destination.mkdirs();
            File[] files =(File[])(Object) source.listFiles();
            for (int i = 0; i < files.length; i++) {
                File current = (File) files[i];
                if ((boolean)(Object)current.isDirectory()) {
                    sourceStack.push(current);
                    destinationStack.push(new File(destination,(String)(Object) current.getName()));
                } else if ((boolean)(Object)current.getName().endsWith(".class")) {
                    ClassWriter writer = new ClassWriter();
                    InputStream is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(current));
                    writer.readClass(is);
                    is.close();
                    MyHelperClass PP_PROCESSED = new MyHelperClass();
                    if (((int)(Object)getStatusFlags(writer.getClassName(writer.getCurrentClassIndex())) & (int)(Object)PP_PROCESSED) != 0) {
                        ClassWriter[] auxWriter = new ClassWriter[1];
                        transformClass(writer, auxWriter);
                        File output = new File(destination,(String)(Object) current.getName());
                        OutputStream os =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(output));
                        writer.writeClass(os);
                        os.close();
                        if (auxWriter[0] != null) {
                            String className =(String)(Object) auxWriter[0].getClassName(auxWriter[0].getCurrentClassIndex());
                            className = className.substring(className.lastIndexOf('.') + 1, className.length());
                            output = new File(destination, className + ".class");
                            os =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(output));
                            auxWriter[0].writeClass(os);
                            os.close();
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class PostProcessingException extends Exception{
	public PostProcessingException(String errorMessage) { super(errorMessage); }
}

class CodeCheckException extends Exception{
	public CodeCheckException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Stack {

public MyHelperClass push(File o0){ return null; }
	public MyHelperClass pop(){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class ClassWriter {

public MyHelperClass readClass(InputStream o0){ return null; }
	public MyHelperClass getClassName(MyHelperClass o0){ return null; }
	public MyHelperClass writeClass(OutputStream o0){ return null; }
	public MyHelperClass getCurrentClassIndex(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
