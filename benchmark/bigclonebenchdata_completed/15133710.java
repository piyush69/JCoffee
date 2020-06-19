
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15133710 {
public MyHelperClass URLEncoder;
	public MyHelperClass psdCgi;

    private Image retrievePdsImage(double lat, double lon) {
        boolean imageDone;// = new boolean();
        imageDone = false;
        try {
            MyHelperClass psdUrl = new MyHelperClass();
            StringBuffer urlBuff = new StringBuffer((int)(Object)psdUrl + (int)(Object)psdCgi + "?");
            MyHelperClass dataSet = new MyHelperClass();
            urlBuff.append("DATA_SET_NAME=" + dataSet);
            MyHelperClass version = new MyHelperClass();
            urlBuff.append("&VERSION=" + version);
            MyHelperClass pixelType = new MyHelperClass();
            urlBuff.append("&PIXEL_TYPE=" + pixelType);
            MyHelperClass projection = new MyHelperClass();
            urlBuff.append("&PROJECTION=" + projection);
            MyHelperClass stretch = new MyHelperClass();
            urlBuff.append("&STRETCH=" + stretch);
            MyHelperClass gridlineFrequency = new MyHelperClass();
            urlBuff.append("&GRIDLINE_FREQUENCY=" + gridlineFrequency);
            MyHelperClass scale = new MyHelperClass();
            urlBuff.append("&SCALE=" + URLEncoder.encode(scale));
            MyHelperClass resolution = new MyHelperClass();
            urlBuff.append("&RESOLUTION=" + resolution);
            MyHelperClass latbox = new MyHelperClass();
            urlBuff.append("&LATBOX=" + latbox);
            MyHelperClass lonbox = new MyHelperClass();
            urlBuff.append("&LONBOX=" + lonbox);
            MyHelperClass bandsSelected = new MyHelperClass();
            urlBuff.append("&BANDS_SELECTED=" + bandsSelected);
            urlBuff.append("&LAT=" + lat);
            urlBuff.append("&LON=" + lon);
            URL url = new URL(urlBuff.toString());
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String result = null;
            String line;
            String imageSrc;
            int count = 0;
            while ((line =(String)(Object) in.readLine()) != null) {
                if (count == 6) result = line;
                count++;
            }
            int startIndex = result.indexOf("<TH COLSPAN=2 ROWSPAN=2><IMG SRC = \"") + 36;
            int endIndex = result.indexOf("\"", startIndex);
            imageSrc = result.substring(startIndex, endIndex);
            URL imageUrl = new URL(imageSrc);
            MyHelperClass Toolkit = new MyHelperClass();
            return ((Image)(Object)Toolkit.getDefaultToolkit().getImage(imageUrl));
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getImage(URL o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }}

class Image {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
