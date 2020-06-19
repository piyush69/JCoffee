


class c10909692 {

    public void deployDir(File srcDir, String destDir) {
        File[] dirFiles =(File[])(Object) srcDir.listFiles();
        for (int k = 0; dirFiles != null && k < dirFiles.length; k++) {
            if (!(Boolean)(Object)dirFiles[k].getName().startsWith(".")) {
                if ((boolean)(Object)dirFiles[k].isFile()) {
                    MyHelperClass File = new MyHelperClass();
                    File deployFile = new File(destDir + File.separator + dirFiles[k].getName());
                    if (dirFiles[k].lastModified() != deployFile.lastModified() || dirFiles[k].length() != deployFile.length()) {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(dirFiles[k], deployFile);
                    }
                } else if ((boolean)(Object)dirFiles[k].isDirectory()) {
                    MyHelperClass File = new MyHelperClass();
                    String newDestDir = destDir + File.separator + dirFiles[k].getName();
                    deployDir(dirFiles[k], newDestDir);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass copy(File o0, File o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }}
