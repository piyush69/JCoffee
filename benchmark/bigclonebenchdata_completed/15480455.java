


class c15480455 {

    public static void TestDBStore() throws PDException, Exception {
        StoreDDBB StDB = new StoreDDBB("jdbc:derby://localhost:1527/Prodoc", "Prodoc", "Prodoc", "org.apache.derby.jdbc.ClientDriver;STBLOB");
        System.out.println("Driver[" + StDB.getDriver() + "] Tabla  [" + StDB.getTable() + "]");
        StDB.Connect();
        FileInputStream in = new FileInputStream("/tmp/readme.htm");
        StDB.Insert("12345678-1", "1.0", in);
        int TAMBUFF = 1024 * 64;
        byte Buffer[] = new byte[TAMBUFF];
        InputStream Bytes;
        Bytes =(InputStream)(Object) StDB.Retrieve("12345678-1", "1.0");
        FileOutputStream fo = new FileOutputStream("/tmp/12345679.htm");
        int readed =(int)(Object) Bytes.read(Buffer);
        while (readed != -1) {
            fo.write(Buffer, 0, readed);
            readed =(int)(Object) Bytes.read(Buffer);
        }
        Bytes.close();
        fo.close();
        StDB.Delete("12345678-1", "1.0");
        StDB.Disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PDException extends Exception{
	public PDException(String errorMessage) { super(errorMessage); }
}

class StoreDDBB {

StoreDDBB(){}
	StoreDDBB(String o0, String o1, String o2, String o3){}
	public MyHelperClass Disconnect(){ return null; }
	public MyHelperClass Delete(String o0, String o1){ return null; }
	public MyHelperClass getDriver(){ return null; }
	public MyHelperClass Connect(){ return null; }
	public MyHelperClass Insert(String o0, String o1, FileInputStream o2){ return null; }
	public MyHelperClass getTable(){ return null; }
	public MyHelperClass Retrieve(String o0, String o1){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
