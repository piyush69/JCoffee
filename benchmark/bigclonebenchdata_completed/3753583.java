import java.io.*;
import java.lang.*;
import java.util.*;



class c3753583 {
public static MyHelperClass Consts;
	public static MyHelperClass IOUtils;
	public static MyHelperClass generateCode(File o0, String o1, File o2){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass Consts;
//	public MyHelperClass generateCode(File o0, String o1, File o2){ return null; }

    public static void generateCode(File flowFile, String packagePath, File destDir, File scriptRootFolder) throws IOException {
        InputStream javaSrcIn =(InputStream)(Object) generateCode(flowFile, packagePath, scriptRootFolder);
        File outputFolder = new File(destDir, packagePath.replace('.', File.separatorChar));
        String fileName = flowFile.getName();
        fileName = fileName.substring(0, fileName.lastIndexOf(".") + 1) + Consts.FILE_EXTENSION_GROOVY;
        File outputFile = new File(outputFolder, fileName);
        OutputStream javaSrcOut = new FileOutputStream(outputFile);
        IOUtils.copyBufferedStream(javaSrcIn, javaSrcOut);
        javaSrcIn.close();
        javaSrcOut.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE_EXTENSION_GROOVY;
public MyHelperClass copyBufferedStream(InputStream o0, OutputStream o1){ return null; }}
