


class c11658686 {
public MyHelperClass NewGenLibRoot;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/zip");
        response.setHeader("Content-Disposition", "inline; filename=c:/server1.zip");
        try {
            BufferedInputStream origin = null;
            FileOutputStream dest = new FileOutputStream("server.zip");
            ZipOutputStream zipOut = new ZipOutputStream(new BufferedOutputStream(dest));
            MyHelperClass BUFFER = new MyHelperClass();
            byte data[] = new byte[(int)(Object)BUFFER];
            java.util.Properties props = new java.util.Properties();
            props.load(new java.io.FileInputStream(NewGenLibRoot.getRoot() + "/SystemFiles/ENV_VAR.txt"));
            String jbossHomePath = props.getProperty("JBOSS_HOME");
            jbossHomePath = jbossHomePath.replaceAll("deploy", "log");
            FileInputStream fis = new FileInputStream(new File(jbossHomePath + "/server.log"));
//            MyHelperClass BUFFER = new MyHelperClass();
            origin = new BufferedInputStream(fis, BUFFER);
            ZipEntry entry = new ZipEntry(jbossHomePath + "/server.log");
            zipOut.putNextEntry(entry);
            int count;
//            MyHelperClass BUFFER = new MyHelperClass();
            while ((count =(int)(Object) origin.read(data, 0, BUFFER)) != -1) {
                zipOut.write(data, 0, count);
            }
            origin.close();
            zipOut.closeEntry();
            java.io.FileInputStream fis1 = new java.io.FileInputStream(new java.io.File("server.zip"));
            java.nio.channels.FileChannel fc1 = fis1.getChannel();
            int length1 = (int) fc1.size();
            byte buffer[] = new byte[length1];
            System.out.println("size of zip file = " + length1);
            fis1.read(buffer);
            OutputStream out1 =(OutputStream)(Object) response.getOutputStream();
            out1.write(buffer);
            fis1.close();
            out1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRoot(){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class File {

File(String o0){}
	File(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
