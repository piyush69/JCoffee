


class c4686922 {

    public void extractResourceToFile(String resourcePath, File dest) {
        InputStream in =(InputStream)(Object) getClass().getResourceAsStream(resourcePath);
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            FileOutputStream out =(FileOutputStream)(Object) FileUtils.openOutputStream(dest);
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
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }}

class File {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

public MyHelperClass close(){ return null; }}
