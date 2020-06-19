


class c3262458 {
public MyHelperClass tomcat;

//    @Override
    public void run() {
        MyHelperClass run = new MyHelperClass();
        while ((boolean)(Object)run) {
            try {
                MyHelperClass server = new MyHelperClass();
                URL url = new URL("http://" + server.getIp() + "/" + tomcat.getName() + "/ui/pva/version.jsp?RT=" + System.currentTimeMillis());
                MyHelperClass Charset = new MyHelperClass();
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName("UTF-8")));
                String inputLine;
                while ((inputLine =(String)(Object) in.readLine()) != null) {
                    if (inputLine.contains("currentversion")) {
                        String s = inputLine.substring(inputLine.indexOf("=") + 1, inputLine.length());
                        MyHelperClass tomcat = new MyHelperClass();
                        tomcat.setDetailInfo(s.trim());
                    }
                }
                in.close();
                MyHelperClass tomcat = new MyHelperClass();
                tomcat.setIsAlive(true);
            } catch (Exception e) {
                MyHelperClass tomcat = new MyHelperClass();
                tomcat.setIsAlive(false);
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getIp(){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass setIsAlive(boolean o0){ return null; }
	public MyHelperClass setDetailInfo(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}
