


class c3459107 {
public static MyHelperClass notifyCopyStart(File o0){ return null; }
	public static MyHelperClass notifyCopyEnd(File o0){ return null; }
//public MyHelperClass notifyCopyEnd(File o0){ return null; }
	public static MyHelperClass handleException(String o0, Exception o1, StringBuffer o2){ return null; }
//	public MyHelperClass notifyCopyStart(File o0){ return null; }
//public MyHelperClass handleException(String o0, Exception o1, StringBuffer o2){ return null; }

    private static boolean hardCopy(File sourceFile, File destinationFile, StringBuffer errorLog) {
        boolean result = true;
        try {
            notifyCopyStart(destinationFile);
            destinationFile.getParentFile().mkdirs();
            byte[] buffer = new byte[4096];
            int len = 0;
            FileInputStream in = new FileInputStream(sourceFile);
            FileOutputStream out = new FileOutputStream(destinationFile);
            while ((len =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, len);
            in.close();
            out.close();
        } catch (Exception e) {
            result = false;
            handleException("\n Error in method: copy!\n", e, errorLog);
        } finally {
            notifyCopyEnd(destinationFile);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
