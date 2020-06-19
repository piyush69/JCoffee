
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4071091 {
public MyHelperClass CustomSystemSession;
	public MyHelperClass ftpPassword;
	public MyHelperClass processImage(String o0, String o1, String o2, Date o3, FTPFile o4, FTPClient o5, Node o6, Session o7){ return null; }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        MyHelperClass log = new MyHelperClass();
        log.info("FileMonitorJob - executing its JOB at " + new Date() + " by " + context.getTrigger().getName());
        FTPClient client = new FTPClient();
        OutputStream outStream = null;
        MyHelperClass Calendar = new MyHelperClass();
        Calendar filterCal =(Calendar)(Object) Calendar.getInstance();
//        MyHelperClass Calendar = new MyHelperClass();
        filterCal.set(Calendar.DAY_OF_MONTH,(int)(Object) filterCal.get(Calendar.DAY_OF_MONTH) - 1);
        Date aDayAgo =(Date)(Object) filterCal.getTime();
        try {
            MyHelperClass r = new MyHelperClass();
            Session session =(Session)(Object) CustomSystemSession.create(r);
            MyHelperClass ftpHostname = new MyHelperClass();
            client.connect(ftpHostname);
            MyHelperClass ftpUsername = new MyHelperClass();
            client.login(ftpUsername, ftpPassword);
            FTPFile[] users =(FTPFile[])(Object) client.listFiles();
            if (users != null) {
                for (FTPFile user : users) {
                    String userName =(String)(Object) user.getName();
                    client.changeWorkingDirectory("/" + userName + "/");
                    Node userNode = null;
                    MyHelperClass Query = new MyHelperClass();
                    @SuppressWarnings("deprecation") Query query =(Query)(Object) session.getWorkspace().getQueryManager().createQuery("/jcr:root/users/element(*, user)[\n" + "  @alias = '" + userName.replaceAll("'", "''") + "'\n" + "]\n" + "order by @lastModified descending", Query.XPATH);
                    NodeIterator results =(NodeIterator)(Object) query.execute().getNodes();
                    if ((boolean)(Object)results.hasNext()) {
                        userNode =(Node)(Object) results.nextNode();
                    } else if ((boolean)(Object)session.getRootNode().hasNode("users/" + userName)) {
                        userNode =(Node)(Object) session.getRootNode().getNode("users/" + userName);
                    }
                    FTPFile[] experiments =(FTPFile[])(Object) client.listFiles();
                    if (experiments != null && userNode != null) {
                        for (FTPFile experiment : experiments) {
                            String experimentName =(String)(Object) experiment.getName();
                            client.changeWorkingDirectory("/" + userName + "/" + experimentName + "/");
                            FTPFile[] datasets =(FTPFile[])(Object) client.listFiles();
                            if (datasets != null) {
                                for (FTPFile dataset : datasets) {
                                    String datasetName =(String)(Object) dataset.getName();
                                    client.changeWorkingDirectory("/" + userName + "/" + experimentName + "/" + datasetName + "/");
                                    Date collectionDate =(Date)(Object) dataset.getTimestamp().getTime();
                                    if ((boolean)(Object)collectionDate.after(aDayAgo)) {
                                        FTPFile[] images =(FTPFile[])(Object) client.listFiles();
                                        if (images != null) {
                                            for (FTPFile image : images) {
                                                processImage(userName, experimentName, datasetName, collectionDate, image, client, userNode, session);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            session.logout();
            client.logout();
        } catch (UncheckedIOException ioe) {
//            MyHelperClass log = new MyHelperClass();
            log.info("Error communicating with FTP server.");
//            MyHelperClass log = new MyHelperClass();
            log.error("Error communicating with FTP server.",(RepositoryException)(Object) ioe);
            ioe.printStackTrace();
        } catch (ArithmeticException ioe) {
//            MyHelperClass log = new MyHelperClass();
            log.info("Error communicating with repository.");
//            MyHelperClass log = new MyHelperClass();
            log.error("Error communicating with repository.",(RepositoryException)(Object) ioe);
            ioe.printStackTrace();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(outStream);
            try {
                client.disconnect();
            } catch (UncheckedIOException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("Problem disconnecting from FTP server",(RepositoryException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPATH;
	public MyHelperClass DAY_OF_MONTH;
public MyHelperClass error(String o0, RepositoryException o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getQueryManager(){ return null; }
	public MyHelperClass getNodes(){ return null; }
	public MyHelperClass createQuery(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getNode(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass hasNode(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class JobExecutionContext {

public MyHelperClass getTrigger(){ return null; }}

class JobExecutionException extends Exception{
	public JobExecutionException(String errorMessage) { super(errorMessage); }
}

class Date {

public MyHelperClass after(Date o0){ return null; }}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}

class OutputStream {

}

class Calendar {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass set(MyHelperClass o0, int o1){ return null; }}

class Session {

public MyHelperClass logout(){ return null; }
	public MyHelperClass getRootNode(){ return null; }
	public MyHelperClass getWorkspace(){ return null; }}

class FTPFile {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getTimestamp(){ return null; }}

class Node {

}

class Query {

public MyHelperClass execute(){ return null; }}

class NodeIterator {

public MyHelperClass nextNode(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}
