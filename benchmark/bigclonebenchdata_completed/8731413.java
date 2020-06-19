


class c8731413 {
public MyHelperClass out;
	public MyHelperClass data;
	public MyHelperClass dc2;
public MyHelperClass JFileChooser;
	public MyHelperClass IOUtils;

    public void ImportFromFile() {
        JFrame jf = new JFrame();
        JFileChooser fc = new JFileChooser(data._path);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal =(int)(Object) fc.showOpenDialog(jf);
        File file = null;
        if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
            file =(File)(Object) fc.getSelectedFile();
            data._path = file.getParent();
            System.out.println(file.getAbsolutePath() + "\n");
        } else {
        }
        if (file != null) {
            File f = new File((int)(Object)data.getHomeDir() + (int)(Object)File.separator + (int)(Object)data.katalogName);
            System.out.println(f + ((boolean)(Object)f.exists() ? " is found " : " is missing "));
            if ((boolean)(Object)f.exists() && !(Boolean)(Object)IOUtils.isNewerContent(file, f)) {
            } else {
                try {
                    IOUtils.copyFile(file, f, true);
                } catch (Exception e) {
                    out.err(e);
                }
            }
            dc2.removeDc("Import");
        } else {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILES_ONLY;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass katalogName;
	public MyHelperClass _path;
public MyHelperClass removeDc(String o0){ return null; }
	public MyHelperClass getHomeDir(){ return null; }
	public MyHelperClass err(Exception o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1, boolean o2){ return null; }
	public MyHelperClass isNewerContent(File o0, File o1){ return null; }}

class JFrame {

}

class JFileChooser {

JFileChooser(){}
	JFileChooser(MyHelperClass o0){}
	public MyHelperClass showOpenDialog(JFrame o0){ return null; }
	public MyHelperClass setFileSelectionMode(MyHelperClass o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class File {
public static MyHelperClass separator;
File(int o0){}
	File(){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}
