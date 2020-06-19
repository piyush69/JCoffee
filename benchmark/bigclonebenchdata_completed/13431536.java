


class c13431536 {
public MyHelperClass processException(String o0){ return null; }

//    @Override
    public int updateStatus(UserInfo userInfo, String status) throws Exception {
        MyHelperClass SnsConstant = new MyHelperClass();
        OAuthConsumer consumer =(OAuthConsumer)(Object) SnsConstant.getOAuthConsumer(SnsConstant.SOHU);
        consumer.setTokenWithSecret(userInfo.getAccessToken(), userInfo.getAccessSecret());
        try {
//            MyHelperClass SnsConstant = new MyHelperClass();
            URL url = new URL(SnsConstant.SOHU_UPDATE_STATUS_URL);
            HttpURLConnection request = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            request.setDoOutput(true);
            request.setRequestMethod("POST");
            HttpParameters para = new HttpParameters();
            MyHelperClass StringUtils = new MyHelperClass();
            para.put("status", StringUtils.utf8Encode(status).replaceAll("\\+", "%20"));
            consumer.setAdditionalParameters(para);
            consumer.sign(request);
            OutputStream ot =(OutputStream)(Object) request.getOutputStream();
            MyHelperClass URLEncoder = new MyHelperClass();
            ot.write(("status=" + URLEncoder.encode(status, "utf-8")).replaceAll("\\+", "%20").getBytes());
            ot.flush();
            ot.close();
            System.out.println("Sending request...");
            request.connect();
            System.out.println("Response: " + request.getResponseCode() + " " + request.getResponseMessage());
            BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String b = null;
            while ((b =(String)(Object) reader.readLine()) != null) {
                System.out.println(b);
            }
//            MyHelperClass SnsConstant = new MyHelperClass();
            return(int)(Object) SnsConstant.SOHU_UPDATE_STATUS_SUCC_WHAT;
        } catch (Exception e) {
//            MyHelperClass SnsConstant = new MyHelperClass();
            SnsConstant.SOHU_OPERATOR_FAIL_REASON = processException(e.getMessage());
//            MyHelperClass SnsConstant = new MyHelperClass();
            return(int)(Object) SnsConstant.SOHU_UPDATE_STATUS_FAIL_WHAT;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SOHU_UPDATE_STATUS_URL;
	public MyHelperClass SOHU_OPERATOR_FAIL_REASON;
	public MyHelperClass SOHU_UPDATE_STATUS_FAIL_WHAT;
	public MyHelperClass SOHU_UPDATE_STATUS_SUCC_WHAT;
	public MyHelperClass SOHU;
public MyHelperClass utf8Encode(String o0){ return null; }
	public MyHelperClass getOAuthConsumer(MyHelperClass o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class UserInfo {

public MyHelperClass getAccessSecret(){ return null; }
	public MyHelperClass getAccessToken(){ return null; }}

class OAuthConsumer {

public MyHelperClass setTokenWithSecret(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setAdditionalParameters(HttpParameters o0){ return null; }
	public MyHelperClass sign(HttpURLConnection o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpParameters {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
