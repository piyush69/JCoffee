


class c16306095 {
public MyHelperClass OK;
public MyHelperClass optionPane;
	public MyHelperClass JOptionPane;
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }

    private void onOKAction() {
        MyHelperClass url = new MyHelperClass();
        if (url == null) {
            MyHelperClass JOptionPane = new MyHelperClass();
            optionPane.setValue(JOptionPane.UNINITIALIZED_VALUE);
//            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(this, "URL field cannot be empty", "Empty URL", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
//                MyHelperClass url = new MyHelperClass();
                URLConnection sourceConnection =(URLConnection)(Object) url.openConnection();
                sourceConnection.setConnectTimeout(10);
                if ((int)(Object)sourceConnection.getContentLength() == -1) {
//                    MyHelperClass url = new MyHelperClass();
                    throw new IOException("Can't connect to " + url.toString());
                }
                MyHelperClass exit_status = new MyHelperClass();
                exit_status = OK;
                setVisible(false);
                dispose();
            } catch (IOException e) {
                optionPane.setValue(JOptionPane.UNINITIALIZED_VALUE);
                JOptionPane.showMessageDialog(this, "Please enter valid, resolvable source and target URLs...\n " + e.getMessage(), "Invalid URL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass UNINITIALIZED_VALUE;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass showMessageDialog(c16306095 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setValue(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
