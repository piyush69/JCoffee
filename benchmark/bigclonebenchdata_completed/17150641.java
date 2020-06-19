


class c17150641 {

    public static void main(String[] args) throws Exception {
        for (int n = 0; n < 8; n++) {
            new Thread() {

                public void run() {
                    try {
                        URL url = new URL("http://localhost:8080/WebGISTileServer/index.jsp?token_timeout=true");
                        URLConnection uc =(URLConnection)(Object) url.openConnection();
                        uc.addRequestProperty("Referer", "http://localhost:8080/index.jsp");
                        BufferedReader rd = new BufferedReader(new InputStreamReader(uc.getInputStream()));
                        String line;
                        while ((line =(String)(Object) rd.readLine()) != null) System.out.println(line);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
