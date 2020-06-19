


class c14077808 {
public MyHelperClass init(EndianDataInputStream o0){ return null; }
public MyHelperClass DEBUG;
	public MyHelperClass DBC;

    public void Dbf(URL url) throws java.io.IOException, DbfFileException {
        if ((boolean)(Object)DEBUG) System.out.println("---->uk.ac.leeds.ccg.dbffile.Dbf constructed. Will identify itself as " + DBC);
        URLConnection uc =(URLConnection)(Object) url.openConnection();
        InputStream in =(InputStream)(Object) uc.getInputStream();
        EndianDataInputStream sfile = new EndianDataInputStream(in);
        init(sfile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class DbfFileException extends Exception{
	public DbfFileException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class EndianDataInputStream {

EndianDataInputStream(){}
	EndianDataInputStream(InputStream o0){}}
