


class c5828731 {
public static MyHelperClass encode(FileOutputStream o0, Image o1, String o2){ return null; }
public static MyHelperClass waitForImage(Image o0){ return null; }
	public static MyHelperClass checkImage(Image o0){ return null; }
//	public MyHelperClass encode(FileOutputStream o0, Image o1, String o2){ return null; }
//public MyHelperClass checkImage(Image o0){ return null; }
//	public MyHelperClass waitForImage(Image o0){ return null; }

    public static void resize(File originalFile, File resizedFile, int width, String format) throws IOException {
        if (format != null && "gif".equals(format.toLowerCase())) {
            resize(originalFile, resizedFile, width,(String)(Object) 1);
            return;
        }
        FileInputStream fis = new FileInputStream(originalFile);
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int readLength = -1;
        int bufferSize = 1024;
        byte bytes[] = new byte[bufferSize];
        while ((readLength =(int)(Object) fis.read(bytes, 0, bufferSize)) != -1) {
            byteStream.write(bytes, 0, readLength);
        }
        byte[] in =(byte[])(Object) byteStream.toByteArray();
        fis.close();
        byteStream.close();
        MyHelperClass Toolkit = new MyHelperClass();
        Image inputImage =(Image)(Object) Toolkit.getDefaultToolkit().createImage(in);
        waitForImage(inputImage);
        int imageWidth =(int)(Object) inputImage.getWidth(null);
        if (imageWidth < 1) throw new IllegalArgumentException("image width " + imageWidth + " is out of range");
        int imageHeight =(int)(Object) inputImage.getHeight(null);
        if (imageHeight < 1) throw new IllegalArgumentException("image height " + imageHeight + " is out of range");
        int height = -1;
        double scaleW = (double) imageWidth / (double) width;
        double scaleY = (double) imageHeight / (double) height;
        if (scaleW >= 0 && scaleY >= 0) {
            if (scaleW > scaleY) {
                height = -1;
            } else {
                width = -1;
            }
        }
        Image outputImage =(Image)(Object) inputImage.getScaledInstance(width, height, java.awt.Image.SCALE_DEFAULT);
        checkImage(outputImage);
        encode(new FileOutputStream(resizedFile), outputImage, format);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createImage(byte[] o0){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class Image {

public MyHelperClass getHeight(Object o0){ return null; }
	public MyHelperClass getWidth(Object o0){ return null; }
	public MyHelperClass getScaledInstance(int o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
