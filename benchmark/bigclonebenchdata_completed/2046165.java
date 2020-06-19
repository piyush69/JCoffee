


class c2046165 {
public MyHelperClass chooseHGVersion(MyHelperClass o0){ return null; }
public MyHelperClass readUCSCLocation(String o0, BufferedReader o1){ return null; }
public MyHelperClass selPanel;
	public MyHelperClass moveViewer(String o0, int o1, int o2){ return null; }

            public void mouseClicked(MouseEvent e) {
                if ((int)(Object)e.getClickCount() == 2) {
                    MyHelperClass lst = new MyHelperClass();
                    int index =(int)(Object) lst.locationToIndex(e.getPoint());
                    try {
//                        MyHelperClass lst = new MyHelperClass();
                        String location = (String)(String)(Object) lst.getModel().getElementAt(index), refStr, startStr, stopStr;
                        if (location.indexOf("at chr") != -1) {
                            location = location.substring(location.indexOf("at ") + 3);
                            refStr = location.substring(0, location.indexOf(":"));
                            location = location.substring(location.indexOf(":") + 1);
                            startStr = location.substring(0, location.indexOf("-"));
                            stopStr = location.substring(location.indexOf("-") + 1);
                            moveViewer(refStr, Integer.parseInt(startStr), Integer.parseInt(stopStr));
                        } else {
                            String hgsid =(String)(Object) chooseHGVersion(selPanel.dsn);
                            URL connectURL = new URL("http://genome.ucsc.edu/cgi-bin/hgTracks?hgsid=" + hgsid + "&position=" + location);
                            InputStream urlStream =(InputStream)(Object) connectURL.openStream();
                            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));
                            readUCSCLocation(location, reader);
                        }
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass dsn;
public MyHelperClass getModel(){ return null; }
	public MyHelperClass getElementAt(int o0){ return null; }
	public MyHelperClass locationToIndex(MyHelperClass o0){ return null; }}

class MouseEvent {

public MyHelperClass getClickCount(){ return null; }
	public MyHelperClass getPoint(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
