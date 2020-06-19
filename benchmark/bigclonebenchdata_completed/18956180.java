


class c18956180 {
public MyHelperClass IOUtils;
	public MyHelperClass getConf(){ return null; }

    private void copyMerge(Path[] sources, OutputStream out) throws IOException {
        Configuration conf =(Configuration)(Object) getConf();
        for (int i = 0; i < sources.length; ++i) {
            FileSystem fs =(FileSystem)(Object) sources[i].getFileSystem(conf);
            InputStream in =(InputStream)(Object) fs.open(sources[i]);
            try {
                IOUtils.copyBytes(in, out, conf, false);
            } finally {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2, boolean o3){ return null; }}

class Path {

public MyHelperClass getFileSystem(Configuration o0){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Configuration {

}

class FileSystem {

public MyHelperClass open(Path o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
