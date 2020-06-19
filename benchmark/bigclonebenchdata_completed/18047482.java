import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18047482 {

//    @Transactional(readOnly = false)
    public void saveOrUpdateProduct(Product product, File[] doc, String[] docFileName, String[] docContentType) throws Throwable, IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.info("addOrUpdateProduct()");
        List<Images> imgList = new ArrayList<Images>();
        InputStream in = null;
        OutputStream out = null;
        MyHelperClass ServletActionContext = new MyHelperClass();
        String saveDirectory = ServletActionContext.getServletContext().getRealPath("common/userfiles/image/");
        if (doc != null && doc.length > 0) {
            File uploadPath = new File(saveDirectory);
            if (!uploadPath.exists()) uploadPath.mkdirs();
            for (int i = 0; i < doc.length; i++) {
                Images img = new Images();
                in = new FileInputStream(doc[i]);
                img.setName(docFileName[i].substring(0, docFileName[i].lastIndexOf(".")));
                img.setRenameAs(docFileName[i]);
                imgList.add(img);
                out = new FileOutputStream(saveDirectory + "/" + img.getRenameAs());
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) > 0) out.write(buffer, 0, len);
                out.flush();
            }
        }
        product.setImagesCollection(imgList);
        MyHelperClass productDao = new MyHelperClass();
        productDao.saveOrUpdateProduct(product);
        if (null != in) {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (null != out) {
            try {
                out.close();
            } catch (Exception e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("addOrUpdateProduct() **********" + e.getStackTrace());
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass saveOrUpdateProduct(Product o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Product {

public MyHelperClass setImagesCollection(List<Images o0){ return null; }}

class Transactional {

}

class Images {

public MyHelperClass setRenameAs(String o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass getRenameAs(){ return null; }}
