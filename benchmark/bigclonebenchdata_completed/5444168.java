


class c5444168 {

    public static void writeFullImageToStream(Image scaledImage, String javaFormat, OutputStream os) throws IOException {
        MyHelperClass BufferedImage = new MyHelperClass();
        BufferedImage bufImage = new BufferedImage(scaledImage.getWidth(null), scaledImage.getHeight(null), BufferedImage.TYPE_BYTE_BINARY);
        Graphics gr =(Graphics)(Object) bufImage.getGraphics();
        gr.drawImage(scaledImage, 0, 0, null);
        gr.dispose();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MyHelperClass ImageIO = new MyHelperClass();
        ImageIO.write(bufImage, javaFormat, bos);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStreams(new ByteArrayInputStream(bos.toByteArray()), os);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_BYTE_BINARY;
public MyHelperClass write(BufferedImage o0, String o1, ByteArrayOutputStream o2){ return null; }
	public MyHelperClass copyStreams(ByteArrayInputStream o0, OutputStream o1){ return null; }}

class Image {

public MyHelperClass getHeight(Object o0){ return null; }
	public MyHelperClass getWidth(Object o0){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedImage {

BufferedImage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	BufferedImage(){}
	public MyHelperClass getGraphics(){ return null; }}

class Graphics {

public MyHelperClass dispose(){ return null; }
	public MyHelperClass drawImage(Image o0, int o1, int o2, Object o3){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}
