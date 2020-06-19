


class c3731077 {

    public static void copyFile(File from, File to) throws IOException {
        assert (from != null);
        assert (to != null);
        if (!(Boolean)(Object)to.exists()) {
            File parentDir =(File)(Object) to.getParentFile();
            if (!(Boolean)(Object)parentDir.exists()) parentDir.mkdirs();
            to.createNewFile();
        }
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(from);
            try {
                out = new FileOutputStream(to);
                FileChannel ic =(FileChannel)(Object) in.getChannel();
                try {
                    FileChannel oc =(FileChannel)(Object) out.getChannel();
                    try {
                        oc.transferFrom(ic, 0, from.length());
                    } finally {
                        if (oc != null) {
                            oc.close();
                        }
                    }
                } finally {
                    if (ic != null) {
                        ic.close();
                    }
                }
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

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
