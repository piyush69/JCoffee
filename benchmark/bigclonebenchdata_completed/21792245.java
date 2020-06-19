


class c21792245 {

    public static String[] retrieveFasta(String id) throws Exception {
        URL url = new URL("http://www.uniprot.org/uniprot/" + id + ".fasta");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String header =(String)(Object) reader.readLine();
        StringBuffer seq = new StringBuffer();
        String line = "";
        while ((line =(String)(Object) reader.readLine()) != null) {
            seq.append(line);
        }
        reader.close();
        String[] first = header.split("OS=");
        return new String[] { id, first[0].split("\\s")[1], first[1].split("GN=")[0], seq.toString() };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
