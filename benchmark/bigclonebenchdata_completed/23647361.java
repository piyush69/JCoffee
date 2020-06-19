
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23647361 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/test";
        String user = "root";
        String password = "password";
        String imageLocation = "C:\\Documents and Settings\\EddyM\\Desktop\\Nick\\01100002.tif";
        String imageLocation2 = "C:\\Documents and Settings\\EddyM\\Desktop\\Nick\\011000022.tif";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            File f = new File(imageLocation);
            InputStream fis =(InputStream)(Object) new FileInputStream(f);
            MyHelperClass DriverManager = new MyHelperClass();
            Connection c =(Connection)(Object) DriverManager.getConnection(url, user, password);
            ResultSet rs =(ResultSet)(Object) c.createStatement().executeQuery("SELECT Image FROM ImageTable WHERE ImageID=12345678");
            new File(imageLocation2).createNewFile();
            rs.first();
            System.out.println("GotFirst");
            InputStream is =(InputStream)(Object) rs.getAsciiStream("Image");
            System.out.println("gotStream");
            FileOutputStream fos = new FileOutputStream(new File(imageLocation2));
            int readInt;
            int i = 0;
            while (true) {
                readInt =(int)(Object) is.read();
                if (readInt == -1) {
                    System.out.println("ReadInt == -1");
                    break;
                }
                i++;
                if (i % 1000000 == 0) System.out.println(i + " / " + is.available());
                fos.write(readInt);
            }
            c.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class ResultSet {

public MyHelperClass getAsciiStream(String o0){ return null; }
	public MyHelperClass first(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
