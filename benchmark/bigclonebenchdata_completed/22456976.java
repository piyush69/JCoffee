


class c22456976 {

    private static void copyFile(File in, File out) throws Exception {
        final FileInputStream input = new FileInputStream(in);
        try {
            final FileOutputStream output = new FileOutputStream(out);
            try {
                final byte[] buf = new byte[4096];
                int readBytes = 0;
                while ((readBytes =(int)(Object) input.read(buf)) != -1) {
                    output.write(buf, 0, readBytes);
                }
            } finally {
                output.close();
            }
        } finally {
            input.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
