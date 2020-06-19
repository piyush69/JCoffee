


class c13950884 {

    public Texture loadTexture(String file) throws IOException {
        MyHelperClass urlFactory = new MyHelperClass();
        URL imageUrl =(URL)(Object) urlFactory.makeUrl(file);
        MyHelperClass textureLoader = new MyHelperClass();
        Texture cached =(Texture)(Object) textureLoader.getImageFromCache(imageUrl);
        if (cached != null) return cached;
        Image image;
        MyHelperClass zip = new MyHelperClass();
        if ((boolean)(Object)zip) {
            MyHelperClass url = new MyHelperClass();
            ZipInputStream zis = new ZipInputStream(url.openStream());
            ZipEntry entry;
            boolean found = false;
            while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
                if (file.equals(entry.getName())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new IOException("Cannot find file \"" + file + "\".");
            }
            int extIndex = file.lastIndexOf('.');
            if (extIndex == -1) {
                throw new IOException("Cannot parse file extension.");
            }
            String fileExt = file.substring(extIndex);
            MyHelperClass TextureManager = new MyHelperClass();
            image =(Image)(Object) TextureManager.loadImage(fileExt, zis, true);
        } else {
            MyHelperClass TextureManager = new MyHelperClass();
            image =(Image)(Object) TextureManager.loadImage(imageUrl, true);
        }
//        MyHelperClass textureLoader = new MyHelperClass();
        return(Texture)(Object) textureLoader.loadTexture(imageUrl, image);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadImage(String o0, ZipInputStream o1, boolean o2){ return null; }
	public MyHelperClass loadImage(URL o0, boolean o1){ return null; }
	public MyHelperClass loadTexture(URL o0, Image o1){ return null; }
	public MyHelperClass makeUrl(String o0){ return null; }
	public MyHelperClass getImageFromCache(URL o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class Texture {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

}

class Image {

}

class ZipInputStream {

ZipInputStream(MyHelperClass o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
