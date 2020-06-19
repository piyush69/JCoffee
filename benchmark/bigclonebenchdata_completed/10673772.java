


class c10673772 {

    private File extractResource(String resourceName, File destDir) {
        File file = new File(destDir, resourceName);
        InputStream in =(InputStream)(Object) getClass().getResourceAsStream(resourceName);
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            FileOutputStream out =(FileOutputStream)(Object) FileUtils.openOutputStream(file);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            } finally {
                if (out != null) {
                    out.close();
                }
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

public MyHelperClass close(){ return null; }}
