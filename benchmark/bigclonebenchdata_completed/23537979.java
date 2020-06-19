import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c23537979 {
public MyHelperClass SWT;

    private void addLine(AmazonItem coverAdress) {
        try {
            URL url = new URL("" + coverAdress.getMediumImageURL());
            MyHelperClass table = new MyHelperClass();
            TableItem ligne1 = new TableItem(table,(int)(Object) SWT.DRAW_DELIMITER | (int)(Object)SWT.DRAW_TAB | (int)(Object)SWT.DRAW_MNEMONIC);
            url.openConnection();
            InputStream is =(InputStream)(Object) url.openStream();
            MyHelperClass display = new MyHelperClass();
            Image coverPicture = new Image(display, is);
            MyHelperClass coverAvailable = new MyHelperClass();
            coverAvailable.add(url);
            ligne1.setImage(new Image[] { coverPicture, null });
            ligne1.setText(new String[] { null, coverAdress.getArtist() + "\n" + coverAdress.getCDTitle() + "\nTrack : " + coverAdress.getNbTrack() });
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DRAW_TAB;
	public MyHelperClass DRAW_MNEMONIC;
	public MyHelperClass DRAW_DELIMITER;
public MyHelperClass add(URL o0){ return null; }}

class AmazonItem {

public MyHelperClass getArtist(){ return null; }
	public MyHelperClass getCDTitle(){ return null; }
	public MyHelperClass getNbTrack(){ return null; }
	public MyHelperClass getMediumImageURL(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class TableItem {

TableItem(){}
	TableItem(MyHelperClass o0, int o1){}
	public MyHelperClass setText(String[] o0){ return null; }
	public MyHelperClass setImage(Image[] o0){ return null; }}

class Image {

Image(){}
	Image(MyHelperClass o0, InputStream o1){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
