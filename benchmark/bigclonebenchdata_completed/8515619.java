import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8515619 {

    public ResponseStatus submit(Collection<SubmissionData> data) throws Throwable, IOException {
        MyHelperClass sessionId = new MyHelperClass();
        if (sessionId == null) throw new IllegalStateException("Perform successful handshake first.");
        if (data.size() > 50) throw new IllegalArgumentException("Max 50 submissions at once");
        StringBuilder builder = new StringBuilder(data.size() * 100);
        int index = 0;
        for (SubmissionData submissionData : data) {
//            MyHelperClass sessionId = new MyHelperClass();
            builder.append(submissionData.toString(sessionId, index));
            builder.append('\n');
            index++;
        }
        String body = builder.toString();
        MyHelperClass Caller = new MyHelperClass();
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)Caller.getInstance().isDebugMode()) System.out.println("submit: " + body);
        MyHelperClass submissionUrl = new MyHelperClass();
        HttpURLConnection urlConnection =(HttpURLConnection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Caller.getInstance().openConnection(submissionUrl);
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true);
        OutputStream outputStream = urlConnection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write(body);
        writer.close();
        InputStream is = urlConnection.getInputStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String status = r.readLine();
        r.close();
        MyHelperClass ResponseStatus = new MyHelperClass();
        int statusCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ResponseStatus.codeForStatus(status);
//        MyHelperClass ResponseStatus = new MyHelperClass();
        if (statusCode ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)ResponseStatus.FAILED) {
            return new ResponseStatus(statusCode, status.substring(status.indexOf(' ') + 1));
        }
        return new ResponseStatus(statusCode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FAILED;
public MyHelperClass isDebugMode(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass codeForStatus(String o0){ return null; }}

class SubmissionData {

}

class ResponseStatus {

ResponseStatus(int o0){}
	ResponseStatus(int o0, String o1){}
	ResponseStatus(){}}

class Object {

public MyHelperClass toString(MyHelperClass o0, int o1){ return null; }}
