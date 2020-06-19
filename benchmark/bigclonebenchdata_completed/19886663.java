


class c19886663 {

    public boolean retrieveByPMID(String pmid) {
        try {
            MyHelperClass baseURL = new MyHelperClass();
            URL url = new URL(baseURL + "&id=" + pmid.trim());
            BufferedReader xml = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            StringBuffer title_sb = new StringBuffer();
            while ((line =(String)(Object) xml.readLine()) != null) {
                if (line.indexOf("<ArticleTitle>") != -1) {
                    title_sb.delete(0, title_sb.length());
                    title_sb.append(line.substring(line.indexOf("<ArticleTitle>") + 14, line.length() - 15));
                } else if (line.indexOf("<AbstractText>") != -1) {
                    MyHelperClass outputDir = new MyHelperClass();
                    PrintWriter article = new PrintWriter(new FileWriter(new File((int)(Object)outputDir.getPath() + (int)(Object)File.separatorChar + pmid + ".txt")));
                    article.println(title_sb);
                    article.println(line.substring(line.indexOf("<AbstractText>") + 14, line.length() - 15));
                    article.close();
                    break;
                }
            }
            xml.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPath(){ return null; }}

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

class PrintWriter {

PrintWriter(){}
	PrintWriter(FileWriter o0){}
	public MyHelperClass println(StringBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class File {
public static MyHelperClass separatorChar;
File(String o0){}
	File(){}}
