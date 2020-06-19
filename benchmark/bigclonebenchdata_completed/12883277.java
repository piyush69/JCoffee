


class c12883277 {
public MyHelperClass WikiPageName2FullFileName(WikiContext o0, String o1){ return null; }
	public MyHelperClass getWorkDir(WikiContext o0){ return null; }

    private void createWikiPages(WikiContext context) throws PluginException {
        MyHelperClass omemo = new MyHelperClass();
        OntologyWikiPageName owpn = new OntologyWikiPageName(omemo.getFormDataAlias().toUpperCase(), omemo.getFormDataVersionDate());
        String wikiPageFullFileName =(String)(Object) WikiPageName2FullFileName(context, owpn.toString());
        MyHelperClass File = new MyHelperClass();
        String rdfFileNameWithPath =(int)(Object) getWorkDir(context) +(String)(Object) (int)(Object)File.separator + (int)(Object)owpn.toFileName();
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(wikiPageFullFileName);
            fis = new FileInputStream(rdfFileNameWithPath);
//            MyHelperClass omemo = new MyHelperClass();
            InfoExtractor infoe = new InfoExtractor(fis, omemo.getFormDataNS(), omemo.getFormDataOntLang());
            MyHelperClass Omemo = new MyHelperClass();
            infoe.writePage(getWorkDir(context), owpn, Omemo.checksWikiPageName);
            fis.close();
            fos.close();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Can not read local rdf file or can not write wiki page");
            throw new PluginException("Error creating wiki pages. See logs");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass checksWikiPageName;
	public MyHelperClass separator;
public MyHelperClass getFormDataAlias(){ return null; }
	public MyHelperClass getFormDataOntLang(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getFormDataVersionDate(){ return null; }
	public MyHelperClass getFormDataNS(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }}

class WikiContext {

}

class PluginException extends Exception{
	public PluginException(String errorMessage) { super(errorMessage); }
}

class OntologyWikiPageName {

OntologyWikiPageName(MyHelperClass o0, MyHelperClass o1){}
	OntologyWikiPageName(){}
	public MyHelperClass toFileName(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class InfoExtractor {

InfoExtractor(){}
	InfoExtractor(FileInputStream o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass writePage(MyHelperClass o0, OntologyWikiPageName o1, MyHelperClass o2){ return null; }}
