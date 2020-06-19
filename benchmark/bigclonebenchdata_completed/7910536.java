


class c7910536 {
public static MyHelperClass mIpAddress;
	public static MyHelperClass updateUserInfo(Context o0, ContextInfo o1){ return null; }
//public MyHelperClass mIpAddress;
//	public MyHelperClass updateUserInfo(Context o0, ContextInfo o1){ return null; }

    public static ContextInfo login(Context pContext, String pUsername, String pPwd, String pDeviceid) {
        HttpClient lClient =(HttpClient)(Object) new DefaultHttpClient();
        StringBuilder lBuilder = new StringBuilder();
        ContextInfo lContextInfo = null;
        HttpPost lHttpPost = new HttpPost(new StringBuilder().append("http://").append(mIpAddress.getText().toString()).append("/ZJWHServiceTest/GIS_Duty.asmx/PDALoginCheck").toString());
        List lNameValuePairs =(List)(Object) new ArrayList(2);
        lNameValuePairs.add(new BasicNameValuePair("username", pUsername));
        lNameValuePairs.add(new BasicNameValuePair("password", pPwd));
        lNameValuePairs.add(new BasicNameValuePair("deviceid", pDeviceid));
        try {
            lHttpPost.setEntity(new UrlEncodedFormEntity(lNameValuePairs));
            HttpResponse lResponse =(HttpResponse)(Object) lClient.execute(lHttpPost);
            BufferedReader lHeader = new BufferedReader(new InputStreamReader(lResponse.getEntity().getContent()));
            for (String s =(String)(Object) lHeader.readLine(); s != null; s =(String)(Object) lHeader.readLine()) {
                lBuilder.append(s);
            }
            String lResult = lBuilder.toString();
            MyHelperClass DataParseUtil = new MyHelperClass();
            lResult =(String)(Object) DataParseUtil.handleResponse(lResult);
            MyHelperClass LoginParseUtil = new MyHelperClass();
            lContextInfo =(ContextInfo)(Object) LoginParseUtil.onlineParse(lResult);
            lContextInfo.setDeviceid(pDeviceid);
            if (0 == (int)(Object)lContextInfo.getLoginFlag()) {
                lContextInfo.setLoginFlag(0);
            } else if (1 == (int)(Object)lContextInfo.getLoginFlag()) {
                lContextInfo.setLoginFlag(1);
                updateUserInfo(pContext, lContextInfo);
            } else if (2 == (int)(Object)lContextInfo.getLoginFlag()) {
                lContextInfo.setLoginFlag(2);
            } else if (3 == (int)(Object)lContextInfo.getLoginFlag()) {
                lContextInfo.setLoginFlag(3);
            }
        } catch (Exception e) {
            return lContextInfo;
        }
        return lContextInfo;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass onlineParse(String o0){ return null; }
	public MyHelperClass handleResponse(String o0){ return null; }}

class Context {

}

class ContextInfo {

public MyHelperClass getLoginFlag(){ return null; }
	public MyHelperClass setDeviceid(String o0){ return null; }
	public MyHelperClass setLoginFlag(int o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

ArrayList(int o0){}
	ArrayList(){}}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
