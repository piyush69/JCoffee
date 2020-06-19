
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20856618 {
public MyHelperClass downloadWidget;
	public MyHelperClass mylayout;
	public MyHelperClass dataWidget;
	public MyHelperClass mainapp;
	public MyHelperClass QMessageBox;
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass update(){ return null; }
	public MyHelperClass hide(){ return null; }

    public void downloadClicked() {
        String s_url;
        try {
            MyHelperClass minLat = new MyHelperClass();
            double minlat = Double.parseDouble((String)(Object)minLat.text());
            MyHelperClass maxLat = new MyHelperClass();
            double maxlat = Double.parseDouble((String)(Object)maxLat.text());
            MyHelperClass minLong = new MyHelperClass();
            double minlong = Double.parseDouble((String)(Object)minLong.text());
            MyHelperClass maxLong = new MyHelperClass();
            double maxlong = Double.parseDouble((String)(Object)maxLong.text());
            s_url = "http://www.openstreetmap.org/api/0.5/map?bbox=" + minlong + "," + minlat + "," + maxlong + "," + maxlat;
        } catch (Exception e) {
            MyHelperClass QMessageBox = new MyHelperClass();
            QMessageBox.critical(this, "Coordinates Error", "Please check the coordinates entered. Make sure to use proper float values.");
            return;
        }
        try {
            MyHelperClass dataWidget = new MyHelperClass();
            mylayout.removeWidget(dataWidget);
//            MyHelperClass dataWidget = new MyHelperClass();
            dataWidget.hide();
            MyHelperClass downloadWidget = new MyHelperClass();
            mylayout.addWidget(downloadWidget, 0, 0, 1, 4);
//            MyHelperClass downloadWidget = new MyHelperClass();
            downloadWidget.show();
            repaint();
            update();
            URL url = new URL(s_url);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            new Osm2Model(con.getInputStream());
            mainapp.setStatusbarText("OSM data successful imported", 1000);
            mainapp.activateMapDisplay();
            hide();
        } catch (UncheckedIOException e) {
            QMessageBox.critical(this, "OSM import failed", "Data could not be retrieved as download URL is erroneos.");
        } catch (ArithmeticException e) {
            QMessageBox.critical(this, "OSM import failed", "I/O error, aborting.");
        }
        mylayout.removeWidget(downloadWidget);
        downloadWidget.hide();
        mylayout.addWidget(dataWidget, 0, 0, 1, 4);
        dataWidget.show();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass show(){ return null; }
	public MyHelperClass activateMapDisplay(){ return null; }
	public MyHelperClass removeWidget(MyHelperClass o0){ return null; }
	public MyHelperClass critical(c20856618 o0, String o1, String o2){ return null; }
	public MyHelperClass addWidget(MyHelperClass o0, int o1, int o2, int o3, int o4){ return null; }
	public MyHelperClass setStatusbarText(String o0, int o1){ return null; }
	public MyHelperClass hide(){ return null; }
	public MyHelperClass text(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Osm2Model {

Osm2Model(){}
	Osm2Model(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
