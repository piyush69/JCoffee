


class c11158190 {
public static MyHelperClass LogHandler;
	public static MyHelperClass isLoggingEnabled(){ return null; }
//public MyHelperClass LogHandler;
//	public MyHelperClass isLoggingEnabled(){ return null; }

    public static void copyFile(String fromPath, String toPath) {
        try {
            File inputFile = new File(fromPath);
            String dirImg =(String)(Object) (new File(toPath)).getParent();
            File tmp = new File(dirImg);
            if (!(Boolean)(Object)tmp.exists()) {
                tmp.mkdir();
            }
            File outputFile = new File(toPath);
            if (!inputFile.getCanonicalPath().equals(outputFile.getCanonicalPath())) {
                FileInputStream in = new FileInputStream(inputFile);
                FileOutputStream out = new FileOutputStream(outputFile);
                int c;
                while ((c =(int)(Object) in.read()) != -1) out.write(c);
                in.close();
                out.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MyHelperClass Level = new MyHelperClass();
            LogHandler.log(ex.getMessage(), Level.INFO, "LOG_MSG", isLoggingEnabled());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass log(String o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
