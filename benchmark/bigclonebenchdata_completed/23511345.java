
import java.io.UncheckedIOException;


class c23511345 {
public static MyHelperClass BitmapFactory;
	public static MyHelperClass lat2tile(double o0, int o1){ return null; }
	public static MyHelperClass lon2tile(double o0, int o1){ return null; }
//public MyHelperClass BitmapFactory;
//	public MyHelperClass lon2tile(double o0, int o1){ return null; }
//	public MyHelperClass lat2tile(double o0, int o1){ return null; }

    public static Bitmap[] getMaps(double lat, double lon, int zoom) throws MalformedURLException, IOException {
        int latitudeTileNumber =(int)(Object) lat2tile(lat, zoom);
        int longitudeTileNumber =(int)(Object) lon2tile(lon, zoom);
        Bitmap[] maps = new Bitmap[10];
        int cpt = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    URL url = new URL(("http://tile.openstreetmap.org/" + zoom + "/" + (longitudeTileNumber + j) + "/" + (latitudeTileNumber + i) + ".png"));
                    Bitmap bmImg =(Bitmap)(Object) BitmapFactory.decodeStream(url.openStream());
                    maps[cpt] = bmImg;
                    cpt++;
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        return maps;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeStream(MyHelperClass o0){ return null; }}

class Bitmap {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
