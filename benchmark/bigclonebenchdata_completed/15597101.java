import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15597101 {
public MyHelperClass MediaTracker;
	public MyHelperClass myImagesBehaviour;
	public MyHelperClass TIGDataBase;
public MyHelperClass createThumbnail(){ return null; }

    public void actionPerformed(ActionEvent e)  throws Throwable {
        MyHelperClass path = new MyHelperClass();
        if (path.compareTo("") != 0) {
            MyHelperClass imageName = new MyHelperClass();
            imageName = (path.substring(path.lastIndexOf(File.separator) + 1, path.length()));
//            MyHelperClass imageName = new MyHelperClass();
            String name = imageName.substring(0, imageName.lastIndexOf('.'));
//            MyHelperClass imageName = new MyHelperClass();
            String extension = imageName.substring(imageName.lastIndexOf('.') + 1, imageName.length());
//            MyHelperClass path = new MyHelperClass();
            File imageFile = new File((String)(Object)path);
            MyHelperClass directoryPath = new MyHelperClass();
            directoryPath = "images" + File.separator + imageName.substring(0, 1).toUpperCase();
//            MyHelperClass directoryPath = new MyHelperClass();
            File directory = new File((String)(Object)directoryPath);
            directory.mkdirs();
            MyHelperClass imagePath = new MyHelperClass();
            imagePath = "." + File.separator + "images" + File.separator + imageName.substring(0, 1).toUpperCase() + File.separator + imageName;
//            MyHelperClass imagePath = new MyHelperClass();
            File newFile = new File((String)(Object)imagePath);
            MyHelperClass TLanguage = new MyHelperClass();
            if (myImagesBehaviour.equals(TLanguage.getString("TIGManageGalleryDialog.REPLACE_IMAGE"))) {
                MyHelperClass TIGDataBase = new MyHelperClass();
                Vector<Vector<String>> aux = TIGDataBase.imageSearchByName(name);
                if (aux.size() != 0) {
//                    MyHelperClass TIGDataBase = new MyHelperClass();
                    int idImage = TIGDataBase.imageKeySearchName(name);
//                    MyHelperClass TIGDataBase = new MyHelperClass();
                    TIGDataBase.deleteAsociatedOfImage(idImage);
                }
            }
//            MyHelperClass TLanguage = new MyHelperClass();
            if (myImagesBehaviour.equals(TLanguage.getString("TIGManageGalleryDialog.ADD_IMAGE"))) {
                int i = 1;
                while (newFile.exists()) {
//                    MyHelperClass imagePath = new MyHelperClass();
                    imagePath = "." + File.separator + "images" + File.separator + imageName.substring(0, 1).toUpperCase() + File.separator + imageName.substring(0, imageName.lastIndexOf('.')) + "_" + i + imageName.substring(imageName.lastIndexOf('.'), imageName.length());
                    name = name + "_" + i;
//                    MyHelperClass imagePath = new MyHelperClass();
                    newFile = new File((String)(Object)imagePath);
                    i++;
                }
            }
            MyHelperClass imagePathThumb = new MyHelperClass();
            imagePathThumb = (imagePath.substring(0, imagePath.lastIndexOf("."))).concat("_th.jpg");
//            MyHelperClass imageName = new MyHelperClass();
            imageName = name + "."(MyHelperClass)(Object) + extension;
            try {
//                MyHelperClass path = new MyHelperClass();
                FileChannel srcChannel = new FileInputStream((String)(Object)path).getChannel();
//                MyHelperClass imagePath = new MyHelperClass();
                FileChannel dstChannel = new FileOutputStream((String)(Object)imagePath).getChannel();
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
                System.out.println(exc.toString());
            }
            MyHelperClass theConcepts = new MyHelperClass();
            TIGDataBase.insertDB(theConcepts, imageName, imageName.substring(0, imageName.lastIndexOf('.')));
            MyHelperClass image = new MyHelperClass();
            image = null;
            if (imageFile != null) {
                MyHelperClass TFileUtils = new MyHelperClass();
                if (TFileUtils.isJAIRequired(imageFile)) {
                    MyHelperClass JAI = new MyHelperClass();
                    RenderedOp src = JAI.create("fileload", imageFile.getAbsolutePath());
                    BufferedImage bufferedImage = src.getAsBufferedImage();
//                    MyHelperClass image = new MyHelperClass();
                    image = new ImageIcon(bufferedImage);
                } else {
//                    MyHelperClass image = new MyHelperClass();
                    image = new ImageIcon(imageFile.getAbsolutePath());
                }
//                MyHelperClass image = new MyHelperClass();
                if (image.getImageLoadStatus() == MediaTracker.ERRORED) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    int choosenOption = JOptionPane.NO_OPTION;
//                    MyHelperClass TLanguage = new MyHelperClass();
                    choosenOption = JOptionPane.showConfirmDialog(null, TLanguage.getString("TIGInsertImageAction.MESSAGE"), TLanguage.getString("TIGInsertImageAction.NAME"), JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
                } else {
                    createThumbnail();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLOSED_OPTION;
	public MyHelperClass NO_OPTION;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass imageSearchByName(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass create(String o0, String o1){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass getImageLoadStatus(){ return null; }
	public MyHelperClass lastIndexOf(char o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass imageKeySearchName(String o0){ return null; }
	public MyHelperClass isJAIRequired(File o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass deleteAsociatedOfImage(int o0){ return null; }}

class ActionEvent {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class RenderedOp {

public MyHelperClass getAsBufferedImage(){ return null; }}

class BufferedImage {

}

class ImageIcon {

}
