


class c19335986 {
public MyHelperClass URLEncoder;
	public MyHelperClass IOUtils;
	public MyHelperClass Program;

    public void uncaughtException(final Thread t, final Throwable e) {
        MyHelperClass Display = new MyHelperClass();
        final Display display =(Display)(Object) Display.getCurrent();
        final Shell shell = new Shell(display);
        MyHelperClass SWT = new MyHelperClass();
        final MessageBox message = new MessageBox(shell,(int)(Object) SWT.OK | (int)(Object)SWT.CANCEL | (int)(Object)SWT.ICON_ERROR);
        message.setText("Hawkscope Error");
        message.setMessage(e.getMessage() + "\nSubmit Hawkscope Error Report to Issue Tracker?");
        MyHelperClass log = new MyHelperClass();
        log.error("Uncaught exception", e);
//        MyHelperClass SWT = new MyHelperClass();
        if (message.open() == SWT.OK) {
            MyHelperClass Version = new MyHelperClass();
            IOUtils.copyToClipboard(Version.getBugReport(e));
            try {
                MyHelperClass Constants = new MyHelperClass();
                Program.launch(Constants.HAWKSCOPE_URL_ROOT + "issues/entry?comment=" + URLEncoder.encode("Please paste the Hawkscope Error " + "Report here. It's currently copied to your " + "clipboard. Thank you for your support!", Constants.ENCODING));
            } catch (final Exception e1) {
                MyHelperClass Constants = new MyHelperClass();
                Program.launch(Constants.HAWKSCOPE_URL_ROOT + "issues/entry");
            }
        }
        shell.dispose();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CANCEL;
	public MyHelperClass ICON_ERROR;
	public MyHelperClass HAWKSCOPE_URL_ROOT;
	public MyHelperClass ENCODING;
	public MyHelperClass OK;
public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass copyToClipboard(MyHelperClass o0){ return null; }
	public MyHelperClass getBugReport(Throwable o0){ return null; }
	public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass launch(String o0){ return null; }
	public MyHelperClass getCurrent(){ return null; }}

class Display {

}

class Shell {

Shell(){}
	Shell(Display o0){}
	public MyHelperClass dispose(){ return null; }}

class MessageBox {

MessageBox(){}
	MessageBox(Shell o0, int o1){}
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }}
