import java.io.*;
import java.lang.*;
import java.util.*;



class c6556152 {
public static MyHelperClass XSD_SUFFIX;
	public static MyHelperClass NULL;
public static MyHelperClass BASE_PACKAGE;
//	public MyHelperClass NULL;
//	public MyHelperClass XSD_SUFFIX;
	public static MyHelperClass argMap;
	public static MyHelperClass FileUtil;
//public MyHelperClass BASE_PACKAGE;
//	public MyHelperClass FileUtil;
//	public MyHelperClass argMap;

    private static File[] getWsdls(File dirfile) throws Exception {
        File[] allfiles = dirfile.listFiles();
        List<File> files = new ArrayList<File>();
        if (allfiles != null) {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass OUTPUT_DIR = new MyHelperClass();
            String outputDir =(String)(Object) argMap.get(OUTPUT_DIR);
            for (File file : allfiles) {
                MyHelperClass WSDL_SUFFIX = new MyHelperClass();
                if (file.getName().endsWith((String)(Object)WSDL_SUFFIX)) {
                    files.add(file);
                }
//                MyHelperClass WSDL_SUFFIX = new MyHelperClass();
                if (file.getName().endsWith((String)(Object)WSDL_SUFFIX) || file.getName().endsWith((String)(Object)XSD_SUFFIX)) {
                    MyHelperClass FileUtil = new MyHelperClass();
                    md.update(FileUtil.getBytes(file));
                }
            }
            MyHelperClass computedHash = new MyHelperClass();
            computedHash = md.digest();
            File hashFile =(File)(Object) NULL; //new File();
            hashFile = new File(outputDir + File.separator + argMap.get(BASE_PACKAGE).replace('.', File.separatorChar) + File.separator + "hash.md5");
//            MyHelperClass hashFile = new MyHelperClass();
            if (hashFile.exists()) {
//                MyHelperClass hashFile = new MyHelperClass();
                byte[] readHash =(byte[])(Object) FileUtil.getBytes(hashFile);
//                MyHelperClass computedHash = new MyHelperClass();
                if (Arrays.equals((long[])(Object)readHash,(long[])(Object) computedHash)) {
                    System.out.println("Skipping generation, files not changed.");
                    files.clear();
                }
            }
        }
        File[] filesarr = new File[files.size()];
        files.toArray(filesarr);
        return filesarr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(File o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}
