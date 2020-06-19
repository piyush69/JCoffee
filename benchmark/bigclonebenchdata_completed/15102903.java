


class c15102903 {
public static MyHelperClass setVosiNS(String o0, String o1, NameSpaceDefinition o2){ return null; }
//public MyHelperClass setVosiNS(String o0, String o1, NameSpaceDefinition o2){ return null; }
	public static MyHelperClass applyStyle(String o0, String o1, String o2){ return null; }
//public MyHelperClass applyStyle(String o0, String o1, String o2){ return null; }

    public static void translateTableAttributes(String baseDir, String tableName, NameSpaceDefinition nsDefinition) throws Exception {
        setVosiNS(baseDir, "table_att", nsDefinition);
        String filename = baseDir + "table_att.xsl";
        Scanner s = new Scanner(new File(filename));
        PrintWriter fw = new PrintWriter(new File(baseDir + tableName + "_att.xsl"));
        while ((boolean)(Object)s.hasNextLine()) {
            fw.println(s.nextLine().replaceAll("TABLENAME", tableName));
        }
        s.close();
        fw.close();
        applyStyle(baseDir + "tables.xml", baseDir + tableName + "_att.json", baseDir + tableName + "_att.xsl");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class NameSpaceDefinition {

}

class Scanner {

Scanner(){}
	Scanner(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class File {

File(String o0){}
	File(){}}

class PrintWriter {

PrintWriter(File o0){}
	PrintWriter(){}
	public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}
