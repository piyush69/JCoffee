
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18293811 {
public static MyHelperClass abort(String o0){ return null; }
//public MyHelperClass abort(String o0){ return null; }

    private static void copy(String from_name, String to_name) throws IOException {
        File from_file = new File(from_name);
        File to_file = new File(to_name);
        if (!(Boolean)(Object)from_file.exists()) abort("�������� ���� �� ���������" + from_file);
        if (!(Boolean)(Object)from_file.isFile()) abort("���������� ����������� ��������" + from_file);
        if (!(Boolean)(Object)from_file.canRead()) abort("�������� ���� ���������� ��� ������" + from_file);
        if ((boolean)(Object)from_file.isDirectory()) to_file = new File(to_file, from_file.getName());
        if ((boolean)(Object)to_file.exists()) {
            if (!(Boolean)(Object)to_file.canWrite()) abort("�������� ���� ���������� ��� ������" + to_file);
            System.out.println("������������ ������� ����?" + to_file.getName() + "?(Y/N):");
            System.out.flush();
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)System.in));
            String response =(String)(Object) in.readLine();
            if (!response.equals("Y") && !response.equals("y")) abort("������������ ���� �� ��� �����������");
        } else {
            String parent =(String)(Object) to_file.getParent();
            if (parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) abort("������� ���������� �� ���������" + parent);
            if (!(Boolean)(Object)dir.isFile()) abort("�� �������� ���������" + parent);
            if (!(Boolean)(Object)dir.canWrite()) abort("������ �� ������" + parent);
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytes_read);
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
                ;
            }
            if (to != null) try {
                to.close();
            } catch (UncheckedIOException e) {
                ;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass getParent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class InputStream {

}
