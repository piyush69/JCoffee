
import java.io.UncheckedIOException;


class c11941001 {

    private static void insertFiles(Connection con, File file) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String line =(String)(Object) bf.readLine();
        while (line != null) {
            if (!line.startsWith(" ") && !line.startsWith("#")) {
                try {
                    System.out.println("Exec: " + line);
                    PreparedStatement prep =(PreparedStatement)(Object) con.prepareStatement(line);
                    prep.executeUpdate();
                    prep.close();
                    con.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        con.rollback();
                    } catch (UncheckedIOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            line =(String)(Object) bf.readLine();
        }
        bf.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
