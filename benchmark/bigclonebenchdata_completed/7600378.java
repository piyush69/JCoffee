
import java.io.UncheckedIOException;


class c7600378 {
public MyHelperClass fiConf;
public MyHelperClass getUserBrailleTableFolder(){ return null; }

    public void setTableBraille(String tableBraille, boolean sys) {
        MyHelperClass OptNames = new MyHelperClass();
        fiConf.setProperty(OptNames.fi_braille_table, tableBraille);
//        MyHelperClass OptNames = new MyHelperClass();
        fiConf.setProperty(OptNames.fi_is_sys_braille_table, Boolean.toString(sys));
        FileChannel in = null;
        FileChannel out = null;
        try {
            String fichTable;
            if (!(tableBraille.endsWith(".ent"))) {
                tableBraille = tableBraille + ".ent";
            }
            if (sys) {
                MyHelperClass ConfigNat = new MyHelperClass();
                fichTable = ConfigNat.getInstallFolder() + "xsl/tablesBraille/" + tableBraille;
            } else {
                MyHelperClass ConfigNat = new MyHelperClass();
                fichTable = ConfigNat.getUserBrailleTableFolder() + tableBraille;
            }
            in =(FileChannel)(Object) (new FileInputStream(fichTable).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(getUserBrailleTableFolder() + "Brltab.ent").getChannel());
            in.transferTo(0, in.size(), out);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fi_is_sys_braille_table;
	public MyHelperClass fi_braille_table;
public MyHelperClass setProperty(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getUserBrailleTableFolder(){ return null; }
	public MyHelperClass getInstallFolder(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
