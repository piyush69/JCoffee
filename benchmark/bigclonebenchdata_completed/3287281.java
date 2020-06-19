
import java.io.UncheckedIOException;


class c3287281 {
public MyHelperClass add(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass BorderLayout;
	public MyHelperClass artist;
	public MyHelperClass getContentPane(){ return null; }
public MyHelperClass pack(){ return null; }

    private void googleImageSearch() {
        boolean bottomShowing;// = new boolean();
        bottomShowing = true;
        boolean googleSearched;// = new boolean();
        googleSearched = true;
        int googleImageLocation;// = new int();
        googleImageLocation = 0;
        Vector googleImages;// = new Vector();
        googleImages = new Vector();
        String custom;// = new String();
        custom = "";
        MyHelperClass JOptionPane = new MyHelperClass();
        int r =(int)(Object) JOptionPane.showConfirmDialog(this, "Customize google search?", "Google Search", JOptionPane.YES_NO_OPTION);
//        MyHelperClass JOptionPane = new MyHelperClass();
        if (r == (int)(Object)JOptionPane.YES_OPTION) {
//            MyHelperClass custom = new MyHelperClass();
            custom =(String)(Object) JOptionPane.showInputDialog("Custom Search", "");
        } else {
//            MyHelperClass custom = new MyHelperClass();
            custom =(String)(Object) artist;
        }
        try {
//            MyHelperClass custom = new MyHelperClass();
            String u = "http://images.google.com/images?q=" + custom;
            if (u.contains(" ")) {
                u = u.replace(" ", "+");
            }
            URL url = new URL(u);
            HttpURLConnection httpcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
            BufferedReader readIn = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
//            MyHelperClass googleImages = new MyHelperClass();
            googleImages.clear();
            String lin = new String();
            while ((lin =(String)(Object) readIn.readLine()) != null) {
                while (lin.contains("href=\"/imgres?imgurl=")) {
                    while (!lin.contains(">")) {
                        lin += readIn.readLine();
                    }
                    String s = lin.substring(lin.indexOf("href=\"/imgres?imgurl="), lin.indexOf(">", lin.indexOf("href=\"/imgres?imgurl=")));
                    lin = lin.substring(lin.indexOf(">", lin.indexOf("href=\"/imgres?imgurl=")));
                    if (s.contains("&amp;") && s.indexOf("http://") < s.indexOf("&amp;")) {
                        s = s.substring(s.indexOf("http://"), s.indexOf("&amp;"));
                    } else {
                        s = s.substring(s.indexOf("http://"), s.length());
                    }
//                    MyHelperClass googleImages = new MyHelperClass();
                    googleImages.add(s);
                }
            }
            readIn.close();
        } catch (Exception ex4) {
            MyHelperClass MusicBoxView = new MyHelperClass();
            MusicBoxView.showErrorDialog(ex4);
        }
        MyHelperClass jButton1 = new MyHelperClass();
        jButton1.setEnabled(false);
        MyHelperClass jLabel1 = new MyHelperClass();
        getContentPane().remove(jLabel1);
        ImageIcon icon;
        try {
//            MyHelperClass googleImageLocation = new MyHelperClass();
            icon = new ImageIcon(new URL((String)(Object)googleImages.elementAt(googleImageLocation)));
            int h =(int)(Object) icon.getIconHeight();
            int w =(int)(Object) icon.getIconWidth();
//            MyHelperClass jLabel1 = new MyHelperClass();
            jLabel1.setSize(w, h);
//            MyHelperClass jLabel1 = new MyHelperClass();
            jLabel1.setIcon(icon);
//            MyHelperClass jLabel1 = new MyHelperClass();
            add(jLabel1, BorderLayout.CENTER);
        } catch (UncheckedIOException ex) {
            MyHelperClass MusicBoxView = new MyHelperClass();
            MusicBoxView.showErrorDialog(ex);
//            MyHelperClass MusicBoxView = new MyHelperClass();
            jLabel1.setIcon((ImageIcon)(Object)MusicBoxView.noImage);
        }
        MyHelperClass jPanel1 = new MyHelperClass();
        add(jPanel1, BorderLayout.PAGE_END);
        pack();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_NO_OPTION;
	public MyHelperClass PAGE_END;
	public MyHelperClass CENTER;
	public MyHelperClass YES_OPTION;
	public MyHelperClass noImage;
public MyHelperClass clear(){ return null; }
	public MyHelperClass showConfirmDialog(c3287281 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setIcon(ImageIcon o0){ return null; }
	public MyHelperClass showErrorDialog(Exception o0){ return null; }
	public MyHelperClass elementAt(MyHelperClass o0){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
	public MyHelperClass showInputDialog(String o0, String o1){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass showErrorDialog(MalformedURLException o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class ImageIcon {

ImageIcon(){}
	ImageIcon(URL o0){}
	public MyHelperClass getIconHeight(){ return null; }
	public MyHelperClass getIconWidth(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class Vector {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}
