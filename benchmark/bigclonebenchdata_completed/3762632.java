


class c3762632 {

    public static void main(String arg[]) {
        try {
            MyHelperClass tempurl = new MyHelperClass();
            URL url = new URL(tempurl);
            HttpURLConnection connect = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connect.setDoInput(true);
            connect.setDoOutput(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream(), "gb2312"));
            String line = null;
            StringBuffer content = new StringBuffer();
            while ((line =(String)(Object) in.readLine()) != null) {
                content.append(line);
            }
            in.close();
            url = null;
            String msg = content.toString();
            MyHelperClass p = new MyHelperClass();
            Matcher m =(Matcher)(Object) p.matcher(msg);
            while ((boolean)(Object)m.find()) {
                System.out.println(m.group(1) + "---" + m.group(2) + "---" + m.group(3) + "---" + m.group(4) + "---" + m.group(5) + "---");
            }
        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.getStackTrace());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matcher(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
