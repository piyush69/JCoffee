


class c19689457 {
public MyHelperClass configureTransferType(MyHelperClass o0){ return null; }
public MyHelperClass masterContext;
	public MyHelperClass ftpClient;
	public MyHelperClass log;
	public MyHelperClass configureClient(){ return null; }

    public synchronized void connect() throws FTPException, IOException {
        MyHelperClass eventAggregator = new MyHelperClass();
        if (eventAggregator != null) {
            MyHelperClass ftpClient = new MyHelperClass();
            eventAggregator.setConnId(ftpClient.getId());
//            MyHelperClass eventAggregator = new MyHelperClass();
            ftpClient.setMessageListener(eventAggregator);
//            MyHelperClass eventAggregator = new MyHelperClass();
            ftpClient.setProgressMonitor(eventAggregator);
//            MyHelperClass eventAggregator = new MyHelperClass();
            ftpClient.setProgressMonitorEx(eventAggregator);
        }
        MyHelperClass statistics = new MyHelperClass();
        statistics.clear();
        configureClient();
        log.debug("Configured client");
        ftpClient.connect();
        log.debug("Client connected");
        if ((boolean)(Object)masterContext.isAutoLogin()) {
            log.debug("Logging in");
            ftpClient.login(masterContext.getUserName(), masterContext.getPassword());
            log.debug("Logged in");
            configureTransferType(masterContext.getContentType());
        } else {
            log.debug("Manual login enabled");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isAutoLogin(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass setConnId(MyHelperClass o0){ return null; }
	public MyHelperClass setProgressMonitorEx(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setMessageListener(MyHelperClass o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass setProgressMonitor(MyHelperClass o0){ return null; }}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
