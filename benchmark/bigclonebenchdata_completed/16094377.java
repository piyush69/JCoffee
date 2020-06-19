import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16094377 {
public MyHelperClass jlHead;
	public MyHelperClass jlResId;
public MyHelperClass jlResourceList;
	public MyHelperClass XmlPullParser;
	public MyHelperClass XmlPullParserFactory;
	public MyHelperClass ElvisRegistry;

    protected void xInitGUI()  throws Throwable {
        MyHelperClass formater = new MyHelperClass();
        this.jlHead.setText(formater.getText("select_marc21_title"));
//        MyHelperClass formater = new MyHelperClass();
        this.jlResId.setText(formater.getText("select_marc21_label_text"));
//        MyHelperClass formater = new MyHelperClass();
        this.jlResId.setToolTipText(formater.getText("select_marc21_label_description"));
        ElvisListModel model = new ElvisListModel();
        this.jlResourceList.setModel(model);
        try {
            URL urlListResources = new URL(ElvisRegistry.getInstance().getProperty("elvis.server") + "/servlet/listResources?xpath=document()//Book");
            InputStream streamResources = urlListResources.openStream();
            XmlPullParser xpp =(XmlPullParser)(Object) XmlPullParserFactory.newInstance().newPullParser();
            xpp.setInput(new InputStreamReader(streamResources));
            int type =(int)(Object) xpp.getEventType();
            while (type != (int)(Object)XmlPullParser.END_DOCUMENT) {
                if (type == (int)(Object)XmlPullParser.START_TAG && "Resource".equals(xpp.getName())) {
                    model.add(xpp.getAttributeValue("", "resId"), xpp.getAttributeValue("", "author"), xpp.getAttributeValue("", "title"));
                }
                type =(int)(Object) xpp.next();
            }
            streamResources.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (UncheckedIOException xppe) {
            xppe.printStackTrace();
        }
        ListSelectionModel selectionModel =(ListSelectionModel)(Object) this.jlResourceList.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {

            /**
				 * @param  e  Description of the Parameter
				 * @see       javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
				 */
            public void valueChanged(ListSelectionEvent e) {
                int index =(int)(Object) e.getFirstIndex();
                boolean isAdjusting =(boolean)(Object) e.getValueIsAdjusting();
                if (!isAdjusting) {
                    ElvisListModel _model = (ElvisListModel)(ElvisListModel)(Object) jlResourceList.getModel();
                    MyHelperClass jtfResId = new MyHelperClass();
                    jtfResId.setText(_model.get(index).getId());
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass START_TAG;
	public MyHelperClass END_DOCUMENT;
public MyHelperClass getSelectionModel(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setModel(ElvisListModel o0){ return null; }
	public MyHelperClass getText(String o0){ return null; }
	public MyHelperClass newPullParser(){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass setToolTipText(MyHelperClass o0){ return null; }
	public MyHelperClass getModel(){ return null; }}

class ElvisListModel {

public MyHelperClass add(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class XmlPullParser {

public MyHelperClass setInput(InputStreamReader o0){ return null; }
	public MyHelperClass getEventType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getAttributeValue(String o0, String o1){ return null; }}

class XmlPullParserException extends Exception{
	public XmlPullParserException(String errorMessage) { super(errorMessage); }
}

class ListSelectionModel {

public MyHelperClass addListSelectionListener(){ return null; }
	public MyHelperClass addListSelectionListener( ListSelectionListener o0){ return null; }}

class ListSelectionListener {

}

class ListSelectionEvent {

public MyHelperClass getFirstIndex(){ return null; }
	public MyHelperClass getValueIsAdjusting(){ return null; }}
