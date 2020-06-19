
import java.io.UncheckedIOException;


class c19295911 {
public MyHelperClass fiConf;

    public void setTableEmbossage(String te, boolean sys) {
        MyHelperClass OptNames = new MyHelperClass();
        fiConf.setProperty(OptNames.pr_emboss_table, te);
//        MyHelperClass OptNames = new MyHelperClass();
        fiConf.setProperty(OptNames.fi_is_sys_emboss_table, Boolean.toString(sys));
        FileChannel in = null;
        FileChannel out = null;
        try {
            String fichTable;
            if (!(te.endsWith(".ent"))) {
                te = te + ".ent";
            }
            if (sys) {
                MyHelperClass ConfigNat = new MyHelperClass();
                fichTable = ConfigNat.getInstallFolder() + "/xsl/tablesEmbosseuse/" + te;
            } else {
                MyHelperClass ConfigNat = new MyHelperClass();
                fichTable = ConfigNat.getUserEmbossTableFolder() + "/" + te;
            }
            in =(FileChannel)(Object) (new FileInputStream(fichTable).getChannel());
            MyHelperClass ConfigNat = new MyHelperClass();
            out =(FileChannel)(Object) (new FileOutputStream(ConfigNat.getUserEmbossTableFolder() + "/Embtab.ent").getChannel());
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
public MyHelperClass fi_is_sys_emboss_table;
	public MyHelperClass pr_emboss_table;
public MyHelperClass setProperty(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getInstallFolder(){ return null; }
	public MyHelperClass getUserEmbossTableFolder(){ return null; }}

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
