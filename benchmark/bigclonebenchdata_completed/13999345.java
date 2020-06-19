


class c13999345 {

    private void writeFile(String name, URL url) throws IOException {
        MyHelperClass resourcesHome = new MyHelperClass();
        Location location =(Location)(Object) resourcesHome.resolve(name);
        InputStream input =(InputStream)(Object) url.openStream();
        OutputStream output =(OutputStream)(Object) location.getOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read;
            while (true) {
                read =(int)(Object) input.read(buf);
                if (read == -1) break;
                output.write(buf, 0, read);
            }
        } finally {
            try {
                input.close();
            } finally {
                output.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolve(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Location {

public MyHelperClass getOutputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
