


class c459745 {

    public void fetchFile(String ID) {
        String url = "http://www.nal.usda.gov/cgi-bin/agricola-ind?bib=" + ID + "&conf=010000++++++++++++++&screen=MA";
        System.out.println(url);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("MARC" + ID + ".txt"));
            MyHelperClass id = new MyHelperClass();
            if (!(Boolean)(Object)id.contains("MARC" + ID + ".txt")) {
//                MyHelperClass id = new MyHelperClass();
                id.add("MARC" + ID + ".txt");
            }
            BufferedReader in;// = new BufferedReader();
            in = new BufferedReader(new InputStreamReader((new URL(url)).openStream()));
//            MyHelperClass in = new MyHelperClass();
            in.readLine();
            String inputLine, stx = "";
            StringBuffer sb = new StringBuffer();
//            MyHelperClass in = new MyHelperClass();
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                if (inputLine.startsWith("<TR><TD><B>")) {
                    String sts = (inputLine.substring(inputLine.indexOf("B>") + 2, inputLine.indexOf("</")));
                    int i = 0;
                    try {
                        i = Integer.parseInt(sts);
                    } catch (NumberFormatException nfe) {
                    }
                    if (i > 0) {
                        stx = stx + "\n" + sts + " - ";
                    } else {
                        stx += sts;
                    }
                }
                if (!(inputLine.startsWith("<") || inputLine.startsWith(" <") || inputLine.startsWith(">"))) {
                    String tx = inputLine.trim();
                    stx += tx;
                }
            }
            pw.println(stx);
            pw.close();
        } catch (Exception e) {
            System.out.println("Couldn't open stream");
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass readLine(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(FileWriter o0){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
