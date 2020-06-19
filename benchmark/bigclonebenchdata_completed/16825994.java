


class c16825994 {

    public int run(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Download dir local");
            return 1;
        }
        OutputStream out =(OutputStream)(Object) new FileOutputStream(args[1]);
        Path srcDir = new Path(args[0]);
        Configuration conf = new Configuration();
        MyHelperClass FileSystem = new MyHelperClass();
        FileSystem srcFS =(FileSystem)(Object) FileSystem.get(conf);
        if (!(Boolean)(Object)srcFS.getFileStatus(srcDir).isDirectory()) {
            System.err.println(args[0] + " is not a directory.");
            return 1;
        }
        try {
            FileStatus contents[] =(FileStatus[])(Object) srcFS.listStatus(srcDir);
            for (int i = 0; i < contents.length; i++) {
                if ((boolean)(Object)contents[i].isFile()) {
                    System.err.println(contents[i].getPath());
                    InputStream in =(InputStream)(Object) srcFS.open(contents[i].getPath());
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copyBytes(in, out, conf, false);
                    } finally {
                        in.close();
                    }
                }
            }
        } finally {
            out.close();
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(Configuration o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2, boolean o3){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Path {

Path(String o0){}
	Path(){}}

class Configuration {

}

class FileSystem {

public MyHelperClass listStatus(Path o0){ return null; }
	public MyHelperClass open(MyHelperClass o0){ return null; }
	public MyHelperClass getFileStatus(Path o0){ return null; }}

class FileStatus {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
