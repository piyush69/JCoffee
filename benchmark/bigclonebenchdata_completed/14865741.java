import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14865741 {
public MyHelperClass formatLine(String o0){ return null; }
	public MyHelperClass setHeadList(List o0){ return null; }

    public boolean login(URL strUrl, String loginName, String loginPwd, String sessionID) throws Throwable, Exception {
        String starter = "-----------------------------";
        String returnChar = "\r\n";
        String lineEnd = "--";
        URL urlString = strUrl;
        String input = null;
        List txtList = new ArrayList();
        List fileList = new ArrayList();
        String targetFile = null;
        String actionStatus = null;
        StringBuffer returnMessage = new StringBuffer();
        List head = new ArrayList();
        final String boundary = String.valueOf(System.currentTimeMillis());
        URL url = null;
        URLConnection conn = null;
        BufferedReader br = null;
        DataOutputStream dos = null;
        boolean isLogin = false;
        txtList.add(new HtmlFormText("loginName", loginName));
        txtList.add(new HtmlFormText("loginPwd", loginPwd));
        txtList.add(new HtmlFormText("navMode", "I"));
        txtList.add(new HtmlFormText("action", "login"));
        try {
            MyHelperClass projectName = new MyHelperClass();
            url = new URL(urlString, "/" + projectName + "/Login.do");
            conn = url.openConnection();
            ((HttpURLConnection) conn).setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Content-Type", "multipart/form-data, boundary=" + "---------------------------" + boundary);
            if (input != null) {
                String auth = "Basic " + new sun.misc.BASE64Encoder().encode(input.getBytes());
                conn.setRequestProperty("Authorization", auth);
            }
            dos = new DataOutputStream(conn.getOutputStream());
            dos.write((starter + boundary + returnChar).getBytes());
            for (int i = 0; i < txtList.size(); i++) {
                HtmlFormText htmltext = (HtmlFormText) txtList.get(i);
                dos.write((int)(Object)htmltext.getTranslated());
                if (i + 1 < txtList.size()) {
                    dos.write((starter + boundary + returnChar).getBytes());
                } else if (fileList.size() > 0) {
                    dos.write((starter + boundary + returnChar).getBytes());
                }
            }
            dos.write((starter + boundary + "--" + returnChar).getBytes());
            dos.flush();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String key;
            String header;
            int i = 1;
            key = conn.getHeaderFieldKey(i);
            header = conn.getHeaderField(i);
            System.out.println(header);
            MyHelperClass Utility = new MyHelperClass();
            if ((boolean)(Object)Utility.isEmpty(header) || header.indexOf("JSESSIONID") < 0) {
//                MyHelperClass projectName = new MyHelperClass();
                header = "JSESSIONID=" + sessionID + "; Path=/" + projectName;
            }
            while (key != null) {
                head.add(header);
                i++;
                key = conn.getHeaderFieldKey(i);
                header = conn.getHeaderField(i);
            }
            String tempstr;
            int line = 0;
            while (null != ((tempstr = br.readLine()))) {
                if (!tempstr.equals("")) {
                    if ("window.location.replace(\"/eip/Home.do\");".indexOf(returnMessage.append(formatLine(tempstr)).toString()) != -1) {
                        isLogin = true;
                        break;
                    }
                    line++;
                }
            }
            txtList.clear();
            fileList.clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
            } catch (Exception e) {
            }
            try {
                br.close();
            } catch (Exception e) {
            }
        }
        this.setHeadList(head);
        return isLogin;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }}

class HtmlFormText {

HtmlFormText(String o0, String o1){}
	HtmlFormText(){}
	public MyHelperClass getTranslated(){ return null; }}
