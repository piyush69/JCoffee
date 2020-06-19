


class c5271062 {
public MyHelperClass fileList;
	public MyHelperClass FileUtils;

    private void copyThemeProviderClass() throws Exception {
        InputStream is =(InputStream)(Object) getClass().getResourceAsStream("/zkthemer/ThemeProvider.class");
        if (is == null) throw new RuntimeException("Cannot find ThemeProvider.class");
        MyHelperClass theme = new MyHelperClass();
        File outFile = new File(theme.getJarRootFile(), "zkthemer/ThemeProvider.class");
        outFile.getParentFile().mkdirs();
        FileOutputStream out = new FileOutputStream(outFile);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, out);
        out.close();
//        MyHelperClass theme = new MyHelperClass();
        FileUtils.writeStringToFile(new File(theme.getJarRootFile(), "zkthemer.properties"), "theme=" + theme.getName() + "\r\nfileList=" + fileList.deleteCharAt((int)(Object)fileList.length() - 1).toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getJarRootFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass writeStringToFile(File o0, String o1){ return null; }
	public MyHelperClass deleteCharAt(int o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
