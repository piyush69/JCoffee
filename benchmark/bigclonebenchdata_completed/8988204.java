import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8988204 {
public MyHelperClass getCardImageURL(MyHelperClass o0){ return null; }
	public MyHelperClass fireActionEvent(Class<MainWindow o0, MyHelperClass o1, String o2){ return null; }
public MyHelperClass m_loading;
	public MyHelperClass Dialog;
	public MyHelperClass m_content;
	public MyHelperClass FileUtils;
	public MyHelperClass Action;
	public MyHelperClass m_card;
	public MyHelperClass m_frame;
	public MyHelperClass parseHtml(){ return null; }
	public MyHelperClass getDocument(){ return null; }

//    @Override
    public void onLoadingEnded()  throws Throwable {
        MyHelperClass m_frame = new MyHelperClass();
        if (m_frame != null) {
            try {
                String urltext =(String)(Object) getDocument().getDocumentURI();
                URL url = new URL(urltext);
                InputStreamReader isr = new InputStreamReader(url.openStream());
                BufferedReader in = new BufferedReader(isr);
                String inputLine;
                urltext = null;
                url = null;
                m_content.clear();
                while ((inputLine = in.readLine()) != null) {
                    m_content.add(inputLine);
                }
                in.close();
                isr = null;
                in = null;
                inputLine = null;
                Action action =(Action)(Object) parseHtml();
                if (action.value() == Action.ACTION_BROWSER_LOADING_DONE && action.toString().equals(Action.COMMAND_CARD_PREVIEW)) {
                    FileUtils.copyURLToFile(new URL(getCardImageURL(m_card.MID)), new File((String)(Object)m_card.getImagePath()));
                    fireActionEvent(MainWindow.class, action.value(), action.toString());
                }
                action = null;
            } catch (Exception ex) {
                Dialog.ErrorBox(m_frame, ex.getStackTrace());
            }
        }
        m_loading =(MyHelperClass)(Object) false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MID;
	public MyHelperClass ACTION_BROWSER_LOADING_DONE;
	public MyHelperClass COMMAND_CARD_PREVIEW;
public MyHelperClass getImagePath(){ return null; }
	public MyHelperClass copyURLToFile(URL o0, File o1){ return null; }
	public MyHelperClass getDocumentURI(){ return null; }
	public MyHelperClass ErrorBox(MyHelperClass o0, StackTraceElement[] o1){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Action {

public MyHelperClass value(){ return null; }}

class MainWindow {

}
