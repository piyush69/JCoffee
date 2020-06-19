import java.io.*;
import java.lang.*;
import java.util.*;



class c5389524 {
public int current;
public MyHelperClass JAI;
	public MyHelperClass TFileUtils;
	public MyHelperClass PREVIEW_HEIGHT;
	public MyHelperClass PREVIEW_WIDTH;
	public MyHelperClass MediaTracker;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass lengthOfTask;
//	public MyHelperClass current;
	public MyHelperClass RenderingHints;
	public MyHelperClass imageFile;
	public MyHelperClass JPEGCodec;
	public MyHelperClass myTask;
	public MyHelperClass stop;
	public MyHelperClass BufferedImage;

        public void ActualTask(TEditor editor, TIGDataBase dataBase, String directoryPath) {
            File myDirectory = new File(directoryPath);
            String[] list = myDirectory.list();
            int i;
            for (i = 0; ((i < list.length) && !(Boolean)(Object)stop); i++) {
                current =(int)(Object)(MyHelperClass)(Object) i;
                if ((list[i].compareTo("Images") != 0) && ((list[i].substring(list[i].lastIndexOf('.'), list[i].length()).toLowerCase().compareTo(".jpg") == 0) || (list[i].substring(list[i].lastIndexOf('.'), list[i].length()).toLowerCase().compareTo(".bmp") == 0) || (list[i].substring(list[i].lastIndexOf('.'), list[i].length()).toLowerCase().compareTo(".png") == 0))) {
                    String name = list[i];
                    String pathSrc = directoryPath.concat(list[i]);
                    name = name.replace(' ', '_').replace(',', '-').replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u').replace('Á', 'A').replace('É', 'E').replace('Í', 'I').replace('Ó', 'O').replace('Ú', 'U');
                    String pathDst = directoryPath.concat(name);
                    Vector aux = new Vector();
                    aux =(Vector)(Object) dataBase.imageSearch(name.substring(0, name.lastIndexOf('.')));
                    if (aux.size() != 0) pathDst = pathDst.substring(0, pathDst.lastIndexOf('.')) + '_' + aux.size() + ".png";
                    File src = new File(pathSrc);
                    File absPath = new File("");
                    String nameSrc = '.' + src.separator + "Images" + src.separator + name.substring(0, 1).toUpperCase() + src.separator + pathDst.substring(pathDst.lastIndexOf(src.separator) + 1, pathDst.length());
                    String newDirectory = '.' + src.separator + "Images" + src.separator + name.substring(0, 1).toUpperCase();
                    String imagePathThumb = (nameSrc.substring(0, nameSrc.lastIndexOf("."))).concat("_th.jpg");
                    ImageIcon image = null;
                    if (src != null) {
                        if ((boolean)(Object)TFileUtils.isJAIRequired(src)) {
                            RenderedOp src_aux =(RenderedOp)(Object) JAI.create("fileload", src.getAbsolutePath());
                            BufferedImage bufferedImage =(BufferedImage)(Object) src_aux.getAsBufferedImage();
                            image = new ImageIcon(bufferedImage);
                        } else {
                            image = new ImageIcon(src.getAbsolutePath());
                        }
                        if (image.getImageLoadStatus() == MediaTracker.ERRORED) {
                            System.out.print("Error al insertar imagen: ");
                            System.out.println(pathDst);
                        } else {
                            int option = 0;
                            imageFile =(MyHelperClass)(Object) new File(directoryPath + "Images");
                            if (!(Boolean)(Object)imageFile.exists()) {
                                TIGNewImageDataDialog dialog = new TIGNewImageDataDialog(editor, dataBase, image, nameSrc.substring(nameSrc.lastIndexOf(File.separator) + 1, nameSrc.length()), list[i].substring(0, list[i].lastIndexOf('.')), myTask);
                                option =(int)(Object) dialog.getOption();
                                if (option != 0) {
                                    File newDirectoryFolder = new File(newDirectory);
                                    newDirectoryFolder.mkdirs();
                                    try {
                                        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pathSrc).getChannel());
                                        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(nameSrc).getChannel());
                                        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                                        srcChannel.close();
                                        dstChannel.close();
                                    } catch (IOException exc) {
                                        System.out.println(exc.getMessage());
                                        System.out.println(exc.toString());
                                    }
                                }
                            }
                            if ((boolean)(Object)imageFile.exists()) {
                                dataBase.insertImageDB(list[i].substring(0, list[i].lastIndexOf('.')), nameSrc.substring(nameSrc.lastIndexOf(File.separator) + 1, nameSrc.length()));
                                File newDirectoryFolder = new File(newDirectory);
                                newDirectoryFolder.mkdirs();
                                try {
                                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pathSrc).getChannel());
                                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(nameSrc).getChannel());
                                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                                    srcChannel.close();
                                    dstChannel.close();
                                } catch (IOException exc) {
                                    System.out.println(exc.getMessage());
                                    System.out.println(exc.toString());
                                }
                            }
                            try {
                                int thumbWidth =(int)(Object) PREVIEW_WIDTH;
                                int thumbHeight =(int)(Object) PREVIEW_HEIGHT;
                                double thumbRatio = (double) thumbWidth / (double) thumbHeight;
                                int imageWidth =(int)(Object) image.getIconWidth();
                                int imageHeight =(int)(Object) image.getIconHeight();
                                double imageRatio = (double) imageWidth / (double) imageHeight;
                                if (thumbRatio < imageRatio) {
                                    thumbHeight = (int) (thumbWidth / imageRatio);
                                } else {
                                    thumbWidth = (int) (thumbHeight * imageRatio);
                                }
                                BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
                                Graphics2D graphics2D =(Graphics2D)(Object) thumbImage.createGraphics();
                                graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                                graphics2D.drawImage(image.getImage(), 0, 0, thumbWidth, thumbHeight, null);
                                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(imagePathThumb));
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
            if ((boolean)(Object)imageFile.exists() && !(Boolean)(Object)stop) {
                try {
                    DocumentBuilderFactory docBuilderFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder =(DocumentBuilder)(Object) docBuilderFactory.newDocumentBuilder();
                    Document doc =(Document)(Object) docBuilder.parse(imageFile);
                    Element dataBaseElement =(Element)(Object) doc.getDocumentElement();
                    if (dataBaseElement.getTagName().equals("dataBase")) {
                        NodeList imageNodeList =(NodeList)(Object) dataBaseElement.getElementsByTagName("image");
                        for (int j = 0; j < (int)(Object)imageNodeList.getLength(); j++) {
                            current++;
                            Node imageNode =(Node)(Object) imageNodeList.item(j);
                            NodeList lista =(NodeList)(Object) imageNode.getChildNodes();
                            Node nameNode =(Node)(Object) imageNode.getChildNodes().item(0);
                            String imageName =(String)(Object) nameNode.getChildNodes().item(0).getNodeValue();
                            int imageKey =(int)(Object) dataBase.imageKeySearchName(imageName.substring(0, imageName.lastIndexOf('.')));
                            if (imageKey != -1) {
                                for (int k = 1; k < (int)(Object)imageNode.getChildNodes().getLength(); k++) {
                                    Node keyWordNode =(Node)(Object) imageNode.getChildNodes().item(k);
                                    String keyWord =(String)(Object) keyWordNode.getChildNodes().item(0).getNodeValue();
                                    int conceptKey =(int)(Object) dataBase.conceptKeySearch(keyWord);
                                    if (conceptKey == -1) {
                                        dataBase.insertConceptDB(keyWord);
                                        conceptKey =(int)(Object) dataBase.conceptKeySearch(keyWord);
                                    }
                                    dataBase.insertAsociatedDB(conceptKey, imageKey);
                                }
                            }
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    System.out.println(ex.toString());
                }
            }
            current =(int)(Object) lengthOfTask;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VALUE_INTERPOLATION_BILINEAR;
	public MyHelperClass ERRORED;
	public MyHelperClass KEY_INTERPOLATION;
	public MyHelperClass TYPE_INT_RGB;
public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass isJAIRequired(File o0){ return null; }
	public MyHelperClass createJPEGEncoder(BufferedOutputStream o0){ return null; }
	public MyHelperClass getLength(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass create(String o0, String o1){ return null; }
	public MyHelperClass exists(){ return null; }}

class TEditor {

}

class TIGDataBase {

public MyHelperClass imageSearch(String o0){ return null; }
	public MyHelperClass insertConceptDB(String o0){ return null; }
	public MyHelperClass insertAsociatedDB(int o0, int o1){ return null; }
	public MyHelperClass conceptKeySearch(String o0){ return null; }
	public MyHelperClass insertImageDB(String o0, String o1){ return null; }
	public MyHelperClass imageKeySearchName(String o0){ return null; }}

class ImageIcon {

ImageIcon(String o0){}
	ImageIcon(BufferedImage o0){}
	ImageIcon(){}
	public MyHelperClass getImage(){ return null; }
	public MyHelperClass getIconHeight(){ return null; }
	public MyHelperClass getImageLoadStatus(){ return null; }
	public MyHelperClass getIconWidth(){ return null; }}

class RenderedOp {

public MyHelperClass getAsBufferedImage(){ return null; }}

class BufferedImage {

BufferedImage(){}
	BufferedImage(int o0, int o1, MyHelperClass o2){}
	public MyHelperClass createGraphics(){ return null; }}

class TIGNewImageDataDialog {

TIGNewImageDataDialog(TEditor o0, TIGDataBase o1, ImageIcon o2, String o3, String o4, MyHelperClass o5){}
	TIGNewImageDataDialog(){}
	public MyHelperClass getOption(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class Graphics2D {

public MyHelperClass drawImage(MyHelperClass o0, int o1, int o2, int o3, int o4, Object o5){ return null; }
	public MyHelperClass setRenderingHint(MyHelperClass o0, MyHelperClass o1){ return null; }}

class JPEGImageEncoder {

public MyHelperClass getDefaultJPEGEncodeParam(BufferedImage o0){ return null; }
	public MyHelperClass encode(BufferedImage o0){ return null; }
	public MyHelperClass setJPEGEncodeParam(JPEGEncodeParam o0){ return null; }}

class JPEGEncodeParam {

public MyHelperClass setQuality(float o0, boolean o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getTagName(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getChildNodes(){ return null; }}
