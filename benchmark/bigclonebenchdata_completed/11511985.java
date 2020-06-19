


class c11511985 {

    public static void test() {
        try {
            MyHelperClass Pattern = new MyHelperClass();
            Pattern pattern =(Pattern)(Object) Pattern.compile("[0-9]{3}\\. <a href='(.*)\\.html'>(.*)</a><br />");
            URL url = new URL("http://farmfive.com/");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            int count = 0;
            while ((line =(String)(Object) br.readLine()) != null) {
                Matcher match =(Matcher)(Object) pattern.matcher(line);
                if ((boolean)(Object)match.matches()) {
                    System.out.println(match.group(1) + " " + match.group(2));
                    count++;
                }
            }
            System.out.println(count + " counted");
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

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

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}
