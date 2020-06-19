


class c545112 {

    public static void main(String[] args) throws Exception {
        String uri = args[0];
        Configuration conf = new Configuration();
        MyHelperClass URI = new MyHelperClass();
        FileSystem fs =(FileSystem)(Object) FileSystem.get(URI.create(uri), conf);
        Path inputPath = new Path(uri);
        CompressionCodecFactory factory = new CompressionCodecFactory(conf);
        CompressionCodec codec =(CompressionCodec)(Object) factory.getCodec(inputPath);
        if (codec == null) {
            System.err.println("No codec found for " + uri);
            System.exit(1);
        }
        MyHelperClass CompressionCodecFactory = new MyHelperClass();
        String outputUri =(String)(Object) CompressionCodecFactory.removeSuffix(uri, codec.getDefaultExtension());
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) codec.createInputStream(fs.open(inputPath));
            out =(OutputStream)(Object) fs.create(new Path(outputUri));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyBytes(in, out, conf);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeStream(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeStream(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass create(String o0){ return null; }
	public MyHelperClass removeSuffix(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2){ return null; }
	public MyHelperClass closeStream(OutputStream o0){ return null; }}

class Configuration {

}

class FileSystem {

public static MyHelperClass get(MyHelperClass o0, Configuration o1){ return null; }
	public MyHelperClass create(Path o0){ return null; }
	public MyHelperClass open(Path o0){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class CompressionCodecFactory {

CompressionCodecFactory(Configuration o0){}
	CompressionCodecFactory(){}
	public MyHelperClass getCodec(Path o0){ return null; }}

class CompressionCodec {

public MyHelperClass getDefaultExtension(){ return null; }
	public MyHelperClass createInputStream(MyHelperClass o0){ return null; }}

class InputStream {

}

class OutputStream {

}
