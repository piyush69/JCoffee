
import java.io.UncheckedIOException;


class c14776145 {
public MyHelperClass dialog;
	public MyHelperClass JOptionPane;
	public MyHelperClass updateComponentList(){ return null; }

    private void addPNMLFileToLibrary(File selected) {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(selected.getAbsolutePath()).getChannel());
            MyHelperClass matchingOrderXML = new MyHelperClass();
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(new File(matchingOrderXML).getParent() + "/" + selected.getName()).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
            MyHelperClass order = new MyHelperClass();
            order.add(new ComponentDescription(false, selected.getName().replaceAll(".pnml", ""), 1.0));
            updateComponentList();
        } catch (UncheckedIOException ioe) {
            JOptionPane.showMessageDialog(dialog, "Could not add the PNML file " + selected.getName() + " to the library!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showMessageDialog(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass add(ComponentDescription o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ComponentDescription {

ComponentDescription(){}
	ComponentDescription(boolean o0, MyHelperClass o1, double o2){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
