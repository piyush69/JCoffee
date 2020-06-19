
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20258159 {
public MyHelperClass getURLContent(MyHelperClass o0){ return null; }
public MyHelperClass getConfiguration(){ return null; }

    private void checkSettings() throws ConfigurationException {
        List serverList =(List)(Object) getConfiguration().getServerList();
        for (Object aServerList : (Object[])(Object)serverList) {
            JiraServerDetails jiraServerDetails = (JiraServerDetails) aServerList;
            URL url = null;
            try {
                if (jiraServerDetails.getBaseurl() == null || "".equals(jiraServerDetails.getBaseurl())) {
                    throw new ConfigurationException("BaseURL is empty.");
                }
                url = new URL(jiraServerDetails.getBaseurl());
                String content =(String)(Object) getURLContent(url.openConnection().getInputStream());
                if (content.indexOf("Atlassian JIRA") == -1) {
                    throw new ConfigurationException("URL (" + url.toString() + ") Doesn't put to an installation of Atlassian JIRA");
                }
                try {
                    jiraServerDetails.getRpcClient(true).login();
                } catch (UncheckedIOException e) {
                    throw new ConfigurationException("Jira Server ( " + url.toString() + " ) is earlier than 2.6 or has RPC disabled.");
                }
            } catch (UncheckedIOException e) {
                throw new ConfigurationException("Malformed URL: " + url);
            } catch (ArithmeticException e) {
                throw new ConfigurationException("Unable to contact server: " + url);
            }
            try {
                MyIssuesFeedBuilder feed = new MyIssuesFeedBuilder(new JiraServerDetails[] { jiraServerDetails });
                feed.buildFeedData();
            } catch (UncheckedIOException feedException) {
                throw new ConfigurationException(feedException.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getServerList(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass login(){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}

class List {

}

class JiraServerDetails {

public MyHelperClass getRpcClient(boolean o0){ return null; }
	public MyHelperClass getBaseurl(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class JiraException extends Exception{
	public JiraException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MyIssuesFeedBuilder {

MyIssuesFeedBuilder(){}
	MyIssuesFeedBuilder(JiraServerDetails[] o0){}
	public MyHelperClass buildFeedData(){ return null; }}

class FeedException extends Exception{
	public FeedException(String errorMessage) { super(errorMessage); }
}
