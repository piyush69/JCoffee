


class c7998445 {

    public static BufferedImage readDicom(final URL url, final SourceImage src) {
        assert url != null;
        assert src != null;
        BufferedImage bi = null;
        try {
            DicomInputStream dis = new DicomInputStream(new BufferedInputStream(url.openStream()));
            src.read(dis);
            dis.close();
            bi =(BufferedImage)(Object) src.getBufferedImage();
        } catch (Exception exc) {
            System.out.println("ImageFactory::readDicom(): exc=" + exc);
        }
        return bi;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class SourceImage {

public MyHelperClass getBufferedImage(){ return null; }
	public MyHelperClass read(DicomInputStream o0){ return null; }}

class BufferedImage {

}

class DicomInputStream {

DicomInputStream(BufferedInputStream o0){}
	DicomInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
