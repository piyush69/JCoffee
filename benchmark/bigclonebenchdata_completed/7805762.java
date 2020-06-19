
import java.io.UncheckedIOException;


class c7805762 {
public MyHelperClass offset;
	public MyHelperClass IOUtils;
	public MyHelperClass outputStream;

    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Blob blob =(Blob)(Object) rs.getBlob(1);
        if ((boolean)(Object)rs.wasNull()) return null;
        try {
            InputStream inputStream =(InputStream)(Object) blob.getBinaryStream();
            MyHelperClass length = new MyHelperClass();
            if ((int)(Object)length > 0) IOUtils.copy(inputStream, outputStream, offset, length); else IOUtils.copy(inputStream, outputStream);
            inputStream.close();
        } catch (UncheckedIOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass getBlob(int o0){ return null; }
	public MyHelperClass wasNull(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Blob {

public MyHelperClass getBinaryStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
