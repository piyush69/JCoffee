import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c17957003 {

    private Date getArtifactFileLastUpdate(Artifact artifact) {
        URL url = null;
        try {
            MyHelperClass baseUrl = new MyHelperClass();
            url = new URL((int)(Object)baseUrl + (int)(Object)artifact.getOrganisationName().replaceAll("\\.", "/") + "/" + artifact.getName().replaceAll("\\.", "/") + "/" + artifact.getVersion() + "/");
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("cannot retrieve last modifcation date",(FileNotFoundException)(Object) e);
            return null;
        }
        URLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection =(URLConnection)(Object) url.openConnection();
            inputStream =(InputStream)(Object) urlConnection.getInputStream();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("cannot retrieve last modifcation date",(FileNotFoundException)(Object) e);
            return null;
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("cannot retrieve last modifcation date",(FileNotFoundException)(Object) e);
            return null;
        }
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("cannot retrieve last modifcation date", e);
            return new Date(0);
        }
        MyHelperClass Pattern = new MyHelperClass();
        Pattern pattern =(Pattern)(Object) Pattern.compile("<a href=\"" + artifact.getName() + "-" + artifact.getVersion() + ".jar\">" + artifact.getName() + "-" + artifact.getVersion() + ".jar</a> *(\\d{2}-[a-zA-Z]{3}-\\d{4} \\d{2}:\\d{2})");
        Matcher m =(Matcher)(Object) pattern.matcher(buffer);
        if ((boolean)(Object)m.find()) {
            String dateStr =(String)(Object) m.group(1);
            try {
                MyHelperClass mavenDateFormateur = new MyHelperClass();
                return(Date)(Object) mavenDateFormateur.parse(dateStr);
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.warn("cannot retrieve last modifcation date",(FileNotFoundException)(Object) e);
                return new Date(0);
            }
        }
        MyHelperClass log = new MyHelperClass();
        log.warn("cannot retrieve last modifcation date");
        return new Date(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass warn(String o0, ParseException o1){ return null; }
	public MyHelperClass warn(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class Artifact {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getOrganisationName(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Pattern {

public MyHelperClass matcher(StringBuffer o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
