import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18129915 {
public MyHelperClass prevCompo;
	public MyHelperClass main;
	public MyHelperClass Display;
	public MyHelperClass SWT;
	public MyHelperClass color;
	public MyHelperClass getDisplay(){ return null; }

    private void album(String albumTitle, String albumNbSong, URL url)  throws Throwable {
        try {
            MyHelperClass color = new MyHelperClass();
            if (color == SWT.COLOR_WHITE) {
//                MyHelperClass color = new MyHelperClass();
                color = SWT.COLOR_GRAY;
            } else {
//                MyHelperClass color = new MyHelperClass();
                color = SWT.COLOR_WHITE;
            }
            url.openConnection();
            InputStream is = url.openStream();
            Image coverPicture = new Image(this.getDisplay(), is);
            Composite albumComposite = new Composite(main, SWT.NONE);
            albumComposite.setLayout(new FormLayout());
            FormData data = new FormData();
            data.left =(MyHelperClass)(Object) new FormAttachment(0, 5);
            data.right =(MyHelperClass)(Object) new FormAttachment(100, -5);
            if (prevCompo == null) {
                data.top =(MyHelperClass)(Object) new FormAttachment(0, 0);
            } else {
                data.top =(MyHelperClass)(Object) new FormAttachment(prevCompo, 0, SWT.BOTTOM);
            }
            albumComposite.setLayoutData(data);
            albumComposite.setBackground(Display.getDefault().getSystemColor(color));
            Label cover = new Label(albumComposite, SWT.LEFT);
            cover.setText("cover");
            cover.setImage(coverPicture);
            data = new FormData(75, 75);
            cover.setLayoutData(data);
            Label title = new Label(albumComposite, SWT.CENTER);
            title.setFont(new Font(this.getDisplay(), "Arial", 10, SWT.BOLD));
            title.setText(albumTitle);
            data = new FormData();
            data.bottom =(MyHelperClass)(Object) new FormAttachment(50, -5);
            data.left =(MyHelperClass)(Object) new FormAttachment(cover, 5);
            title.setBackground(Display.getDefault().getSystemColor(color));
            title.setLayoutData(data);
            Label nbSong = new Label(albumComposite,(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) SWT.LEFT | (int)(Object)SWT.BOLD);
            nbSong.setFont(new Font(this.getDisplay(), "Arial", 8, SWT.ITALIC));
            nbSong.setText("Release date : " + albumNbSong);
            data = new FormData();
            data.top =(MyHelperClass)(Object) new FormAttachment(50, 5);
            data.left =(MyHelperClass)(Object) new FormAttachment(cover, 5);
            nbSong.setBackground(Display.getDefault().getSystemColor(color));
            nbSong.setLayoutData(data);
            prevCompo =(MyHelperClass)(Object) albumComposite;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COLOR_WHITE;
	public MyHelperClass ITALIC;
	public MyHelperClass NONE;
	public MyHelperClass BOTTOM;
	public MyHelperClass COLOR_GRAY;
	public MyHelperClass BOLD;
	public MyHelperClass CENTER;
	public MyHelperClass LEFT;
public MyHelperClass getSystemColor(MyHelperClass o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class Image {

Image(MyHelperClass o0, InputStream o1){}
	Image(){}}

class Composite {

Composite(){}
	Composite(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass setLayout(FormLayout o0){ return null; }
	public MyHelperClass setLayoutData(FormData o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }}

class FormLayout {

}

class FormData {
public MyHelperClass left;
	public MyHelperClass right;
	public MyHelperClass top;
	public MyHelperClass bottom;
FormData(int o0, int o1){}
	FormData(){}}

class FormAttachment {

FormAttachment(MyHelperClass o0, int o1, MyHelperClass o2){}
	FormAttachment(Label o0, int o1){}
	FormAttachment(int o0, int o1){}
	FormAttachment(){}}

class Label {

Label(){}
	Label(Composite o0, MyHelperClass o1){}
	public MyHelperClass setFont(Font o0){ return null; }
	public MyHelperClass setLayoutData(FormData o0){ return null; }
	public MyHelperClass setImage(Image o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }}

class Font {

Font(MyHelperClass o0, String o1, int o2, MyHelperClass o3){}
	Font(){}}
