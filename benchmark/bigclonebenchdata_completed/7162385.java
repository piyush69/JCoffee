


class c7162385 {
public MyHelperClass JOptionPane;
	public MyHelperClass MySpaceBlogExporterGuiApp;

//    @Override
    public boolean postPage() {
        MyHelperClass myResourceMap = new MyHelperClass();
        MySpaceBlogExporterGuiApp.getApplication().getWizContainer().showStatus(myResourceMap.getString("CheckingBlogUrl.text"));
        URL url;
        try {
            MyHelperClass txtBlogUrl = new MyHelperClass();
            url = new URL(txtBlogUrl.getText());
            URLConnection con =(URLConnection)(Object) url.openConnection();
            con.getContentType();
            String newLink = con.getURL().toString();
//            MyHelperClass txtBlogUrl = new MyHelperClass();
            if (!newLink.equalsIgnoreCase((String)(Object)txtBlogUrl.getText())) {
//                MyHelperClass myResourceMap = new MyHelperClass();
                JOptionPane.showMessageDialog(new JFrame(), myResourceMap.getString("InvalidBlogUrl.text"), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception ex) {
//            MyHelperClass myResourceMap = new MyHelperClass();
            JOptionPane.showMessageDialog(new JFrame(), myResourceMap.getString("InvalidUrl.text"), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            MyHelperClass MySpaceBlogExporterGuiApp = new MyHelperClass();
            MySpaceBlogExporterGuiApp.getApplication().getWizContainer().hideStatus();
        }
        MyHelperClass txtBlogUrl = new MyHelperClass();
        if ((int)(Object)txtBlogUrl.getText().toLowerCase().indexOf("friendid") > 0) {
//            MyHelperClass myResourceMap = new MyHelperClass();
            JOptionPane.showMessageDialog(new JFrame(), myResourceMap.getString("InvalidBlogUrl.text"), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
//        MyHelperClass txtBlogUrl = new MyHelperClass();
        MySpaceBlogExporterGuiApp.getApplication().getMySpaceBlogExporter().setBlogUrl(txtBlogUrl.getText());
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getMySpaceBlogExporter(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass showStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getWizContainer(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass showMessageDialog(JFrame o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass setBlogUrl(MyHelperClass o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getApplication(){ return null; }
	public MyHelperClass hideStatus(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getURL(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class JFrame {

}
