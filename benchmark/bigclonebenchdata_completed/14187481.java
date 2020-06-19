
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14187481 {
public MyHelperClass ONLY;
public MyHelperClass OptionConstants;
	public MyHelperClass LOG;
	public MyHelperClass DrJava;
	public MyHelperClass Version;
	public MyHelperClass getSurveyURL(){ return null; }
	public MyHelperClass noAction(){ return null; }
	public MyHelperClass maySubmitSurvey(){ return null; }

    protected void yesAction() {
        try {
            String result = getSurveyURL() + "&buildtime=" + Version.getBuildTimeString();
            LOG.log(result);
            if (!(Boolean)(Object)maySubmitSurvey()) {
                return;
            }
            BufferedReader br = null;
            try {
                URL url = new URL(result);
                InputStream urls =(InputStream)(Object) url.openStream();
                InputStreamReader is = new InputStreamReader(urls);
                br = new BufferedReader(is);
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line =(String)(Object) br.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.getProperty("line.separator"));
                }
                LOG.log(sb.toString());
            } catch (UncheckedIOException e) {
                LOG.log("Could not open URL using Java",(IOException)(Object) e);
                try {
                    ONLY.openURL(new URL(result));
                    DrJava.getConfig().setSetting(OptionConstants.LAST_DRJAVA_SURVEY_RESULT, result);
                } catch (UncheckedIOException e2) {
                    LOG.log("Could not open URL using web browser",(IOException)(Object) e2);
                }
            } finally {
                try {
                    if (br != null) br.close();
                } catch (UncheckedIOException e) {
                }
            }
        } finally {
            noAction();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LAST_DRJAVA_SURVEY_RESULT;
public MyHelperClass getConfig(){ return null; }
	public MyHelperClass setSetting(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getBuildTimeString(){ return null; }
	public MyHelperClass log(String o0, IOException o1){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass openURL(URL o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
