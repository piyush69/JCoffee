import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19366418 {

    public static Photo createPhoto(String title, String userLogin, String pathToPhoto, String basePathImage) throws Throwable, NoSuchAlgorithmException, IOException {
        MyHelperClass CryptSHA1 = new MyHelperClass();
        String id =(String)(Object) CryptSHA1.genPhotoID(userLogin, title);
        String extension = pathToPhoto.substring(pathToPhoto.lastIndexOf("."));
        String destination = basePathImage + id + extension;
        FileInputStream fis = new FileInputStream(pathToPhoto);
        FileOutputStream fos = new FileOutputStream(destination);
        FileChannel fci =(FileChannel)(Object) fis.getChannel();
        FileChannel fco =(FileChannel)(Object) fos.getChannel();
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        while (true) {
            int read =(int)(Object) fci.read(buffer);
            if (read == -1) break;
            buffer.flip();
            fco.write(buffer);
            buffer.clear();
        }
        fci.close();
        fco.close();
        fos.close();
        fis.close();
        ImageIcon image;
        ImageIcon thumb;
        String destinationThumb = basePathImage + "thumb/" + id + extension;
        image = new ImageIcon(destination);
        int maxSize = 150;
        int origWidth =(int)(Object) image.getIconWidth();
        int origHeight =(int)(Object) image.getIconHeight();
        if (origWidth > origHeight) {
            MyHelperClass Image = new MyHelperClass();
            thumb = new ImageIcon((String)(Object)image.getImage().getScaledInstance(maxSize, -1, Image.SCALE_SMOOTH));
        } else {
            MyHelperClass Image = new MyHelperClass();
            thumb = new ImageIcon((String)(Object)image.getImage().getScaledInstance(-1, maxSize, Image.SCALE_SMOOTH));
        }
        MyHelperClass BufferedImage = new MyHelperClass();
        BufferedImage bi = new BufferedImage(thumb.getIconWidth(), thumb.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g =(Graphics)(Object) bi.getGraphics();
        g.drawImage(thumb.getImage(), 0, 0, null);
        try {
            MyHelperClass ImageIO = new MyHelperClass();
            ImageIO.write(bi, "JPG", new File(destinationThumb));
        } catch (ArithmeticException ioe) {
            System.out.println("Error occured saving thumbnail");
        }
        Photo photo = new Photo(id);
        photo.setTitle(title);
        photo.basePathImage =(MyHelperClass)(Object) basePathImage;
        return photo;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SCALE_SMOOTH;
	public MyHelperClass TYPE_INT_RGB;
public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass getScaledInstance(int o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass genPhotoID(String o0, String o1){ return null; }
	public MyHelperClass write(BufferedImage o0, String o1, File o2){ return null; }}

class Photo {
public MyHelperClass basePathImage;
Photo(String o0){}
	Photo(){}
	public MyHelperClass setTitle(String o0){ return null; }}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class ImageIcon {

ImageIcon(){}
	ImageIcon(String o0){}
	public MyHelperClass getIconHeight(){ return null; }
	public MyHelperClass getIconWidth(){ return null; }
	public MyHelperClass getImage(){ return null; }}

class BufferedImage {

BufferedImage(){}
	BufferedImage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass getGraphics(){ return null; }}

class Graphics {

public MyHelperClass drawImage(MyHelperClass o0, int o1, int o2, Object o3){ return null; }}
