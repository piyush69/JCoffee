


class c23241194 {
public MyHelperClass PublishUtil;
	public MyHelperClass JOptionPane;
	public MyHelperClass VueUtil;
	public MyHelperClass VueResources;

    private void publishZip(LWMap map) {
        try {
            if (map.getFile() == null) {
                MyHelperClass VueResources = new MyHelperClass();
                VueUtil.alert(VueResources.getString("dialog.mapsave.message"), VueResources.getString("dialog.mapsave.title"));
                return;
            }
            MyHelperClass Publisher = new MyHelperClass();
            File savedCMap =(File)(Object) PublishUtil.createZip(map, Publisher.resourceVector);
            InputStream istream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(savedCMap));
            MyHelperClass ActionUtil = new MyHelperClass();
            OutputStream ostream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(ActionUtil.selectFile("Export to Zip File", "zip")));
            int fileLength = (int)(int)(Object) savedCMap.length();
            byte bytes[] = new byte[fileLength];
            while ((int)(Object)istream.read(bytes, 0, fileLength) != -1) ostream.write(bytes, 0, fileLength);
            istream.close();
            ostream.close();
        } catch (Exception ex) {
            System.out.println(ex);
            MyHelperClass VUE = new MyHelperClass();
            VueUtil.alert(VUE.getDialogParent(), VueResources.getString("dialog.export.message") + ex.getMessage(), VueResources.getString("dialog.export.title"), JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass resourceVector;
public MyHelperClass alert(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass createZip(LWMap o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDialogParent(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass selectFile(String o0, String o1){ return null; }
	public MyHelperClass alert(MyHelperClass o0, MyHelperClass o1){ return null; }}

class LWMap {

public MyHelperClass getFile(){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}
