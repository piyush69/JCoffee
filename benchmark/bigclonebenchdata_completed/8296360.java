import java.io.*;
import java.lang.*;
import java.util.*;



class c8296360 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copiaAnexos(String from, String to, AnexoTO[] anexoTO) {
        FileChannel in = null, out = null;
        for (int i = 0; i < anexoTO.length; i++) {
            try {
                MyHelperClass uploadDiretorio = new MyHelperClass();
                in =(FileChannel)(Object) (new FileInputStream(new File((String)(Object)(uploadDiretorio.concat(from)).concat(File.separator + anexoTO[i].getNome()))).getChannel());
//                MyHelperClass uploadDiretorio = new MyHelperClass();
                out =(FileChannel)(Object) (new FileOutputStream(new File((String)(Object)(uploadDiretorio.concat(to)).concat(File.separator + anexoTO[i].getNome()))).getChannel());
                long size =(long)(Object) in.size();
                MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                out.write(buf);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) try {
                    in.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
                if (out != null) try {
                    out.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass concat(String o0){ return null; }}

class AnexoTO {

public MyHelperClass getNome(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }}

class MappedByteBuffer {

}
