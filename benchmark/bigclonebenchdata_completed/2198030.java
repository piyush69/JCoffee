


class c2198030 {
public MyHelperClass view;
	public MyHelperClass MessageDialog;
	public MyHelperClass VisualSwingPlugin;
	public MyHelperClass IResource;
	public MyHelperClass getShell(){ return null; }

    private void copy(String imgPath, String path) {
        try {
            File input = new File(imgPath);
            File output = new File(path, input.getName());
            if ((boolean)(Object)output.exists()) {
                if (!(Boolean)(Object)MessageDialog.openQuestion(getShell(), "Overwrite", "There is already an image file " + input.getName() + " under the package.\n Do you really want to overwrite it?")) return;
            }
            byte[] data = new byte[1024];
            FileInputStream fis = new FileInputStream(imgPath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));
            int length;
            while ((length =(int)(Object) bis.read(data)) > 0) {
                bos.write(data, 0, length);
                bos.flush();
            }
            bos.close();
            fis.close();
            IJavaProject ijp =(IJavaProject)(Object) VisualSwingPlugin.getCurrentProject();
            if (ijp != null) {
                ijp.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
                view.refresh();
                view.expandAll();
            }
        } catch (Exception e) {
            VisualSwingPlugin.getLogger().error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEPTH_INFINITE;
public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass refresh(){ return null; }
	public MyHelperClass expandAll(){ return null; }
	public MyHelperClass getCurrentProject(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass openQuestion(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass refreshLocal(MyHelperClass o0, Object o1){ return null; }}

class File {

File(){}
	File(String o0, MyHelperClass o1){}
	File(String o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(String o0){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IJavaProject {

public MyHelperClass getProject(){ return null; }}
