import java.io.*;
import java.lang.*;
import java.util.*;



class c18665067 {
public MyHelperClass NULL;
public MyHelperClass dataBase;
	public MyHelperClass imageFile;
	public MyHelperClass MediaTracker;

    public void actionPerformed(ActionEvent e) {
        MyHelperClass path = new MyHelperClass();
        if ((int)(Object)path.compareTo("") != 0) {
            MyHelperClass imageName = new MyHelperClass();
            imageName = (path.substring((int)(Object)path.lastIndexOf((char)(Object)imageFile.separator) + 1,(int)(Object) path.length()));
//            MyHelperClass path = new MyHelperClass();
            File imageFile = new File((String)(Object)path);
            String directoryPath =(String)(Object) NULL; //new String();
            directoryPath = "Images" + imageFile.separator + imageName.substring(0, 1).toUpperCase();
//            MyHelperClass directoryPath = new MyHelperClass();
            File directory = new File((String)(Object)directoryPath);
            directory.mkdirs();
            String imagePath =(String)(Object) NULL; //new String();
            imagePath = "." + imageFile.separator + "Images" + imageFile.separator + imageName.substring(0, 1).toUpperCase() + imageFile.separator + imageName;
//            MyHelperClass imagePath = new MyHelperClass();
            File newFile = new File((String)(Object)imagePath);
            int i = 1;
            while (newFile.exists()) {
//                MyHelperClass imagePath = new MyHelperClass();
                imagePath = "." + imageFile.separator + "Images" + imageFile.separator + imageName.substring(0,(int)(Object) imageName.lastIndexOf('.')) + "_" + i + imageName.substring((int)(Object)imageName.lastIndexOf('.'),(int)(Object) imageName.length());
//                MyHelperClass imagePath = new MyHelperClass();
                newFile = new File((String)(Object)imagePath);
                i++;
            }
            String imagePathThumb =(String)(Object) NULL; //new String();
            imagePathThumb = (imagePath.substring(0,(int)(Object) imagePath.lastIndexOf("."))).concat("_th.jpg");
            MyHelperClass theConcepts = new MyHelperClass();
            dataBase.insertDB(theConcepts, imageName, imageName.substring(0,(int)(Object) imageName.lastIndexOf('.')));
            try {
//                MyHelperClass path = new MyHelperClass();
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream((String)(Object)path).getChannel());
//                MyHelperClass imagePath = new MyHelperClass();
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream((String)(Object)imagePath).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
                System.out.println(exc.toString());
            }
            MyHelperClass image = new MyHelperClass();
            image = null;
            if (imageFile != null) {
                MyHelperClass TFileUtils = new MyHelperClass();
                if ((boolean)(Object)TFileUtils.isJAIRequired(imageFile)) {
                    MyHelperClass JAI = new MyHelperClass();
                    RenderedOp src =(RenderedOp)(Object) JAI.create("fileload", imageFile.getAbsolutePath());
                    BufferedImage bufferedImage =(BufferedImage)(Object) src.getAsBufferedImage();
//                    MyHelperClass image = new MyHelperClass();
                    image =(MyHelperClass)(Object) new ImageIcon(bufferedImage);
                } else {
//                    MyHelperClass image = new MyHelperClass();
                    image =(MyHelperClass)(Object) new ImageIcon(imageFile.getAbsolutePath());
                }
//                MyHelperClass image = new MyHelperClass();
                if (image.getImageLoadStatus() == MediaTracker.ERRORED) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    int choosenOption =(int)(Object) JOptionPane.NO_OPTION;
                    MyHelperClass TLanguage = new MyHelperClass();
                    choosenOption =(int)(Object) JOptionPane.showConfirmDialog(null, TLanguage.getString("TIGInsertImageAction.MESSAGE"), TLanguage.getString("TIGInsertImageAction.NAME"), JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        MyHelperClass PREVIEW_WIDTH = new MyHelperClass();
                        int thumbWidth =(int)(Object) PREVIEW_WIDTH;
                        MyHelperClass PREVIEW_HEIGHT = new MyHelperClass();
                        int thumbHeight =(int)(Object) PREVIEW_HEIGHT;
                        double thumbRatio = (double) thumbWidth / (double) thumbHeight;
//                        MyHelperClass image = new MyHelperClass();
                        int imageWidth =(int)(Object) image.getIconWidth();
//                        MyHelperClass image = new MyHelperClass();
                        int imageHeight =(int)(Object) image.getIconHeight();
                        double imageRatio = (double) imageWidth / (double) imageHeight;
                        if (thumbRatio < imageRatio) {
                            thumbHeight = (int) (thumbWidth / imageRatio);
                        } else {
                            thumbWidth = (int) (thumbHeight * imageRatio);
                        }
                        MyHelperClass BufferedImage = new MyHelperClass();
                        BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
                        Graphics2D graphics2D =(Graphics2D)(Object) thumbImage.createGraphics();
                        MyHelperClass RenderingHints = new MyHelperClass();
                        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//                        MyHelperClass image = new MyHelperClass();
                        graphics2D.drawImage(image.getImage(), 0, 0, thumbWidth, thumbHeight, null);
//                        MyHelperClass imagePathThumb = new MyHelperClass();
                        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream((String)(Object)imagePathThumb));
                        MyHelperClass JPEGCodec = new MyHelperClass();
                        JPEGImageEncoder encoder =(JPEGImageEncoder)(Object) JPEGCodec.createJPEGEncoder(out);
                        JPEGEncodeParam param =(JPEGEncodeParam)(Object) encoder.getDefaultJPEGEncodeParam(thumbImage);
                        int quality = 100;
                        quality = Math.max(0, Math.min(quality, 100));
                        param.setQuality((float) quality / 100.0f, false);
                        encoder.setJPEGEncodeParam(param);
                        encoder.encode(thumbImage);
                        out.close();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        System.out.println(ex.toString());
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLOSED_OPTION;
	public MyHelperClass TYPE_INT_RGB;
	public MyHelperClass ERRORED;
	public MyHelperClass KEY_INTERPOLATION;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass VALUE_INTERPOLATION_BILINEAR;
	public MyHelperClass NO_OPTION;
	public MyHelperClass separator;
public MyHelperClass isJAIRequired(File o0){ return null; }
	public MyHelperClass getImage(){ return null; }
	public MyHelperClass getIconHeight(){ return null; }
	public MyHelperClass createJPEGEncoder(BufferedOutputStream o0){ return null; }
	public MyHelperClass concat(String o0){ return null; }
	public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass lastIndexOf(char o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass getIconWidth(){ return null; }
	public MyHelperClass insertDB(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getImageLoadStatus(){ return null; }
	public MyHelperClass create(String o0, String o1){ return null; }}

class ActionEvent {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class RenderedOp {

public MyHelperClass getAsBufferedImage(){ return null; }}

class BufferedImage {

BufferedImage(){}
	BufferedImage(int o0, int o1, MyHelperClass o2){}
	public MyHelperClass createGraphics(){ return null; }}

class Graphics2D {

public MyHelperClass drawImage(MyHelperClass o0, int o1, int o2, int o3, int o4, Object o5){ return null; }
	public MyHelperClass setRenderingHint(MyHelperClass o0, MyHelperClass o1){ return null; }}

class JPEGImageEncoder {

public MyHelperClass getDefaultJPEGEncodeParam(BufferedImage o0){ return null; }
	public MyHelperClass encode(BufferedImage o0){ return null; }
	public MyHelperClass setJPEGEncodeParam(JPEGEncodeParam o0){ return null; }}

class JPEGEncodeParam {

public MyHelperClass setQuality(float o0, boolean o1){ return null; }}

class ImageIcon {

ImageIcon(BufferedImage o0){}
	ImageIcon(String o0){}
	ImageIcon(){}}
