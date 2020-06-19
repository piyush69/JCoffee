


class c22024581 {

    private static Collection crossCheckFromOBOFile(String category) throws Exception {
        Collection miCol =(Collection)(Object) new ArrayList();
        String revision = "1.48";
        MyHelperClass OboUtils = new MyHelperClass();
        URL url = new URL(OboUtils.PSI_MI_OBO_LOCATION + "?revision=" + revision);
        MyHelperClass log = new MyHelperClass();
        log.debug("url " + url);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        int termCounter = 0;
        int miCounter = 0;
        int obsoleteCounter = 0;
        int obsoleteCounterDef = 0;
        int typedefCounter = 0;
        int drugTerm = 0;
        int psiTerm = 0;
        String mi = null;
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            String temp;
            temp = inputLine;
            if (inputLine.startsWith("[Term]")) {
                termCounter++;
            } else if (inputLine.matches("id:\\s+(MI:.*)")) {
                mi = temp.split("\\s+")[1];
                miCounter++;
            } else if (inputLine.contains("is_obsolete: true")) {
                obsoleteCounter++;
            } else if (inputLine.matches("def:.*?OBSOLETE.*")) {
                obsoleteCounterDef++;
            } else if (inputLine.startsWith("[Typedef]")) {
                typedefCounter++;
            } else if (inputLine.matches("subset:\\s+PSI-MI\\s+slim")) {
                psiTerm++;
                MyHelperClass OboCategory = new MyHelperClass();
                if (category.equalsIgnoreCase((String)(Object)OboCategory.PSI_MI_SLIM)) miCol.add(mi);
            } else if (inputLine.matches("subset:\\s+Drugable")) {
                drugTerm++;
                MyHelperClass OboCategory = new MyHelperClass();
                if (category.equalsIgnoreCase((String)(Object)OboCategory.DRUGABLE)) miCol.add(mi);
            }
        }
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(948, termCounter);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(948, miCounter);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(53, obsoleteCounter);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(53, obsoleteCounterDef);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(1, typedefCounter);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(844, psiTerm);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(124, drugTerm);
        in.close();
        return miCol;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PSI_MI_SLIM;
	public MyHelperClass PSI_MI_OBO_LOCATION;
	public MyHelperClass DRUGABLE;
public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }}

class Collection {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

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
