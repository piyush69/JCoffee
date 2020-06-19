


class c18565406 {
public MyHelperClass stopWords;

    public void Stopper(String stopWordsFile) {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            if (stopWordsFile.startsWith("http")) {
                URL url = new URL(stopWordsFile);
                br = new BufferedReader((FileReader)(Object)new InputStreamReader(url.openStream()));
            } else {
                fr = new FileReader(new File(stopWordsFile));
                br = new BufferedReader(fr);
            }
            String line = null;
            while ((line =(String)(Object) br.readLine()) != null) {
                line = line.trim();
                stopWords.put(line, "");
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Stopwords not Found");
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, String o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class File {

File(String o0){}
	File(){}}
