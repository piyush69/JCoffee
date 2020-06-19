


class c15228322 {

    public void createIndex(File indexDir) throws SearchLibException, IOException {
        if (!(Boolean)(Object)indexDir.mkdir()) throw new SearchLibException("directory creation failed (" + indexDir + ")");
        InputStream is = null;
        FileWriter target = null;
        MyHelperClass resources = new MyHelperClass();
        for (String resource :(String[])(Object) (Object[])(Object)resources) {
            MyHelperClass rootPath = new MyHelperClass();
            String res =(char)(Object) rootPath + '/' + resource;
            is =(InputStream)(Object) getClass().getResourceAsStream(res);
            if (is == null) is =(InputStream)(Object) getClass().getResourceAsStream("common" + '/' + resource);
            if (is == null) throw new SearchLibException("Unable to find resource " + res);
            try {
                File f = new File(indexDir, resource);
                if ((File)(Object)f.getParentFile() != indexDir) f.getParentFile().mkdirs();
                target = new FileWriter(f);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, target);
            } finally {
                if (target != null) target.close();
                if (is != null) is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class SearchLibException extends Exception{
	public SearchLibException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }}
