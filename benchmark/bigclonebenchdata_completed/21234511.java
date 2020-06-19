


class c21234511 {

    public static void unzip(String destDir, String zipPath) {
        PrintWriter stdout = new PrintWriter((PrintStream)(Object)System.out, true);
        int read = 0;
        byte[] data = new byte[1024];
        ZipEntry entry;
        try {
            ZipInputStream in = new ZipInputStream(new FileInputStream(zipPath));
            stdout.println(zipPath);
            while ((entry =(ZipEntry)(Object) in.getNextEntry()) != null) {
                MyHelperClass ZipEntry = new MyHelperClass();
                if (entry.getMethod() == ZipEntry.DEFLATED) {
                    stdout.println("  Inflating: " + entry.getName());
                } else {
                    stdout.println(" Extracting: " + entry.getName());
                }
                MyHelperClass File = new MyHelperClass();
                FileOutputStream out = new FileOutputStream(destDir + File.separator + entry.getName());
                while ((read =(int)(Object) in.read(data, 0, 1024)) != -1) {
                    out.write(data, 0, read);
                }
                out.close();
            }
            in.close();
            stdout.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
	public MyHelperClass separator;
}

class PrintWriter {

PrintWriter(PrintStream o0, boolean o1){}
	PrintWriter(){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass println(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getMethod(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class PrintStream {

}
