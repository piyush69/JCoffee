import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13852596 {
public MyHelperClass totalMethods;
	public MyHelperClass newSize;
public MyHelperClass CALLSTACK_FILE;
	public MyHelperClass log(String o0){ return null; }
public MyHelperClass log(IOException o0, int o1){ return null; }

    public void execute()  throws Throwable {
        try {
            MyHelperClass methods = new MyHelperClass();
            if (methods == null) {
                return;
            }
            List<Resource> resources = new ArrayList<Resource>();
            MyHelperClass classFiles = new MyHelperClass();
            for (Iterator<Resource> i =(Iterator<Resource>)(Object) classFiles.iterator(); i.hasNext(); ) {
                final Resource classFile = i.next();
                MyHelperClass CALLSTACK_FILE = new MyHelperClass();
                if (!classFile.getName().equals(CALLSTACK_FILE)) {
                    try {
                        InputStream inputStream =(InputStream)(Object) classFile.getInputStream();
                        ClassReader reader = new ClassReader(inputStream);
                        reader.accept(new MethodAnalyzer(), 0);
                        resources.add(classFile);
                        MyHelperClass oldSize = new MyHelperClass();
                       (int)(Object) oldSize += (int)(Object)classFile.getSize();
                    } catch (IllegalStateException e) {
                    }
                }
            }
            for (Iterator<Resource> i = resources.iterator(); i.hasNext(); ) {
                final Resource classFile = i.next();
                try {
                    InputStream inputStream =(InputStream)(Object) classFile.getInputStream();
                    ClassReader reader = new ClassReader(inputStream);
                    MyHelperClass ClassWriter = new MyHelperClass();
                    ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
                    MyHelperClass CALLSTACK_FILE = new MyHelperClass();
                    if (!(Boolean)(Object)classFile.getName().startsWith(CALLSTACK_FILE.substring(0, CALLSTACK_FILE.indexOf('.')))) {
                        reader.accept((MethodAnalyzer)(Object)new MethodInjector(writer), 0);
                        byte[] b =(byte[])(Object) writer.toByteArray();
                        inputStream.close();
                        OutputStream outputStream =(OutputStream)(Object) classFile.getOutputStream();
                        outputStream.write(b);
                        outputStream.close();
                        MyHelperClass injectedClasses = new MyHelperClass();
                        injectedClasses++;
                    }
                } catch (IllegalStateException e) {
                }
                MyHelperClass newSize = new MyHelperClass();
               (int)(Object) newSize += (int)(Object)classFile.getSize();
            }
//            MyHelperClass classFiles = new MyHelperClass();
            File classFile = new File((String)(Object)classFiles.getDir(),(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) CALLSTACK_FILE);
            if (!classFile.exists()) {
                throw new BuildException("Missing net.yura.mobile.logging.CallStack class");
            }
            InputStream inputStream = new FileInputStream(classFile);
            ClassReader reader = new ClassReader(inputStream);
            MyHelperClass ClassWriter = new MyHelperClass();
            ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
            try {
                reader.accept((MethodAnalyzer)(Object)new PushMethodGenerator(writer), 0);
            } finally {
                inputStream.close();
            }
            byte[] b =(byte[])(Object) writer.toByteArray();
            inputStream.close();
            OutputStream outputStream = new FileOutputStream(classFile);
            outputStream.write(b);
            outputStream.close();
            MyHelperClass injectedClasses = new MyHelperClass();
            log(injectedClasses + " classes injected");
            MyHelperClass injectedMethods = new MyHelperClass();
            log(((int)(Object)injectedMethods * 100) / Math.max(1,(int)(Object) totalMethods) + "% of methods injected");
            MyHelperClass oldSize = new MyHelperClass();
            log((100 - (((int)(Object)oldSize * 100) / (int)(Object)newSize)) + "% code size increase");
        } catch (IOException e) {
            log(e, 0);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COMPUTE_MAXS;
	public int injectedClasses;
public MyHelperClass getDir(){ return null; }
	public MyHelperClass indexOf(char o0){ return null; }
	public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Resource {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ClassReader {

ClassReader(InputStream o0){}
	ClassReader(){}
	public MyHelperClass accept(MethodAnalyzer o0, int o1){ return null; }}

class MethodAnalyzer {

}

class ClassWriter {

ClassWriter(ClassReader o0, MyHelperClass o1){}
	ClassWriter(){}
	public MyHelperClass toByteArray(){ return null; }}

class MethodInjector {

MethodInjector(){}
	MethodInjector(ClassWriter o0){}}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class PushMethodGenerator {

PushMethodGenerator(){}
	PushMethodGenerator(ClassWriter o0){}}
