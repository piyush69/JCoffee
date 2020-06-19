import java.io.*;
import java.lang.*;
import java.util.*;



class c17470307 {
public int soundbankRevision;
//public MyHelperClass soundbankRevision;
	public MyHelperClass StandardLocation;
	public MyHelperClass ToolProvider;
	public MyHelperClass assertTrue(boolean o0){ return null; }

    private void createSoundbank(String testSoundbankFileName) throws Exception {
        System.out.println("Create soundbank");
        File packageDir = new File("testsoundbank");
        if (packageDir.exists()) {
            for (File file : packageDir.listFiles()) assertTrue(file.delete());
            assertTrue(packageDir.delete());
        }
        packageDir.mkdir();
        String sourceFileName = "testsoundbank/TestSoundBank.java";
        File sourceFile = new File(sourceFileName);
        FileWriter writer = new FileWriter(sourceFile);
        writer.write("package testsoundbank;\n" + "public class TestSoundBank extends com.sun.media.sound.ModelAbstractOscillator { \n" + "    @Override public int read(float[][] buffers, int offset, int len) throws java.io.IOException { \n" + "   return 0;\n" + " }\n" + "    @Override public String getVersion() {\n" + "   return \"" + (soundbankRevision++) + "\";\n" + "    }\n" + "}\n");
        writer.close();
        JavaCompiler compiler =(JavaCompiler)(Object) ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager =(StandardJavaFileManager)(Object) compiler.getStandardFileManager(null, null, null);
        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File(".")));
        compiler.getTask(null, fileManager, null, null, null, fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile))).call();
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(testSoundbankFileName));
        ZipEntry ze = new ZipEntry("META-INF/services/javax.sound.midi.Soundbank");
        zos.putNextEntry(ze);
        zos.write("testsoundbank.TestSoundBank".getBytes());
        ze = new ZipEntry("testsoundbank/TestSoundBank.class");
        zos.putNextEntry(ze);
        FileInputStream fis = new FileInputStream("testsoundbank/TestSoundBank.class");
        int b = fis.read();
        while (b != -1) {
            zos.write(b);
            b = fis.read();
        }
        zos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLASS_OUTPUT;
public MyHelperClass getSystemJavaCompiler(){ return null; }
	public MyHelperClass call(){ return null; }}

class JavaCompiler {

public MyHelperClass getStandardFileManager(Object o0, Object o1, Object o2){ return null; }
	public MyHelperClass getTask(Object o0, StandardJavaFileManager o1, Object o2, Object o3, Object o4, MyHelperClass o5){ return null; }}

class StandardJavaFileManager {

public MyHelperClass getJavaFileObjectsFromFiles(List<File> o0){ return null; }
	public MyHelperClass setLocation(MyHelperClass o0, List<File> o1){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}}
