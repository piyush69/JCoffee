


class c12269678 {

    private void copyResource(String relResourceName) {
        MyHelperClass layout = new MyHelperClass();
        String projectName =(String)(Object) layout.getRootDir().getName();
        String resourceName = "/protoj/" + projectName + "/" + relResourceName;
        InputStream source =(InputStream)(Object) getClass().getResourceAsStream(resourceName);
        if (source == null) {
            throw new RuntimeException("couldn't find resource " + resourceName);
        }
//        MyHelperClass layout = new MyHelperClass();
        File dest = new File(layout.getRootDir(), relResourceName);
        dest.getParentFile().mkdirs();
        dest.createNewFile();
        InputStreamReader in = new InputStreamReader(source);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStreamReader o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStreamReader o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRootDir(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
