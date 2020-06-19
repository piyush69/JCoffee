


class c7149578 {
public MyHelperClass getBodyTextContent(StringBuffer o0, MyHelperClass o1, boolean o2, Object o3){ return null; }
public MyHelperClass addFieldTitle(MyHelperClass o0){ return null; }
	public MyHelperClass langDetection(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass addField(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass addField(MyHelperClass o0, StringBuffer o1){ return null; }
	public MyHelperClass addField(ParserFieldEnum o0, MyHelperClass o1){ return null; }
	public MyHelperClass addField(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
public MyHelperClass contentTypeCharset;
	public MyHelperClass url;
	public MyHelperClass contentEncoding;
	public MyHelperClass findBestProvider(String o0, StreamLimiter o1){ return null; }
public MyHelperClass MimeUtils;
	public MyHelperClass urlItemFieldEnum;
	public MyHelperClass LinkUtils;
	public MyHelperClass ParserFieldEnum;
	public MyHelperClass OPENSEARCHSERVER_FIELD;
	public MyHelperClass OPENSEARCHSERVER_FIELD_LENGTH;
	public MyHelperClass Lang;
	public MyHelperClass IOUtils;
	public MyHelperClass ClassPropertyEnum;
	public MyHelperClass HtmlDocumentProvider;
	public MyHelperClass getUrlFilterList(){ return null; }
	public MyHelperClass getSourceDocument(){ return null; }
	public MyHelperClass addDirectFields(String[] o0, String o1){ return null; }

//    @Override
    protected void parseContent(StreamLimiter streamLimiter, LanguageEnum forcedLang) throws IOException {
        String charset = null;
        IndexDocument sourceDocument =(IndexDocument)(Object) getSourceDocument();
        if (sourceDocument != null && urlItemFieldEnum != null) {
            FieldValueItem fieldValueItem =(FieldValueItem)(Object) sourceDocument.getFieldValue(contentTypeCharset.getName(), 0);
            if (fieldValueItem != null) charset =(String)(Object) fieldValueItem.getValue();
            if (charset == null) {
                fieldValueItem =(FieldValueItem)(Object) sourceDocument.getFieldValue(contentEncoding.getName(), 0);
                if (fieldValueItem != null) charset =(String)(Object) fieldValueItem.getValue();
            }
        }
        boolean charsetWasNull = charset == null;
        if (charsetWasNull) charset =(String)(Object) getProperty(ClassPropertyEnum.DEFAULT_CHARSET).getValue();
        StringWriter writer = new StringWriter();
        IOUtils.copy(streamLimiter.getNewInputStream(), writer, charset);
        addField(ParserFieldEnum.htmlSource, writer.toString());
        writer.close();
        HtmlDocumentProvider htmlProvider =(HtmlDocumentProvider)(Object) findBestProvider(charset, streamLimiter);
        if (htmlProvider == null) return;
        addField(ParserFieldEnum.htmlProvider, htmlProvider.getName());
        String contentType =(String)(Object) htmlProvider.getMetaHttpEquiv("content-type");
        String contentTypeCharset = null;
        if (contentType != null) {
            contentTypeCharset =(String)(Object) MimeUtils.extractContentTypeCharset(contentType);
            if (contentTypeCharset != null && !contentTypeCharset.equals(charset)) charsetWasNull = true;
        }
        if (charsetWasNull) {
            if (contentTypeCharset != null) charset = contentTypeCharset; else charset =(String)(Object) htmlProvider.getMetaCharset();
            if (charset != null) htmlProvider =(HtmlDocumentProvider)(Object) findBestProvider(charset, streamLimiter);
        }
        HtmlNodeAbstract rootNode =(HtmlNodeAbstract)(Object) htmlProvider.getRootNode();
        if (rootNode == null) return;
        for (HtmlNodeAbstract metaNode :(HtmlNodeAbstract[])(Object) (Object[])(Object)htmlProvider.getMetas()) {
            String metaName =(String)(Object) metaNode.getAttributeText("name");
            if (metaName != null && metaName.startsWith((String)(Object)OPENSEARCHSERVER_FIELD)) {
                String field = metaName.substring((int)(Object)OPENSEARCHSERVER_FIELD_LENGTH);
                String[] fields = field.split("\\.");
                if (fields != null) {
                    String content =(String)(Object) metaNode.getAttributeText("content");
                    addDirectFields(fields, content);
                }
            }
        }
        addField(ParserFieldEnum.charset, charset);
        addFieldTitle(htmlProvider.getTitle());
        String metaRobots = null;
        String metaDcLanguage = null;
        String metaContentLanguage = null;
        for (HtmlNodeAbstract node :(HtmlNodeAbstract[])(Object) (Object[])(Object)htmlProvider.getMetas()) {
            String attr_name =(String)(Object) node.getAttributeText("name");
            String attr_http_equiv =(String)(Object) node.getAttributeText("http-equiv");
            if ("keywords".equalsIgnoreCase(attr_name)) addField(ParserFieldEnum.meta_keywords, HtmlDocumentProvider.getMetaContent(node)); else if ("description".equalsIgnoreCase(attr_name)) addField(ParserFieldEnum.meta_description, HtmlDocumentProvider.getMetaContent(node)); else if ("robots".equalsIgnoreCase(attr_name)) metaRobots =(String)(Object) HtmlDocumentProvider.getMetaContent(node); else if ("dc.language".equalsIgnoreCase(attr_name)) metaDcLanguage =(String)(Object) HtmlDocumentProvider.getMetaContent(node); else if ("content-language".equalsIgnoreCase(attr_http_equiv)) metaContentLanguage =(String)(Object) HtmlDocumentProvider.getMetaContent(node);
        }
        boolean metaRobotsFollow = true;
        boolean metaRobotsNoIndex = false;
        if (metaRobots != null) {
            metaRobots = metaRobots.toLowerCase();
            if (metaRobots.contains("noindex")) {
                metaRobotsNoIndex = true;
                addField(ParserFieldEnum.meta_robots, "noindex");
            }
            if (metaRobots.contains("nofollow")) {
                metaRobotsFollow = false;
                addField(ParserFieldEnum.meta_robots, "nofollow");
            }
        }
        UrlFilterItem[] urlFilterList =(UrlFilterItem[])(Object) getUrlFilterList();
        List nodes =(List)(Object) rootNode.getAllNodes("a", "frame");
        IndexDocument srcDoc =(IndexDocument)(Object) getSourceDocument();
        if (srcDoc != null && nodes != null && metaRobotsFollow) {
            URL currentURL =(URL)(Object) htmlProvider.getBaseHref();
            if (currentURL == null && urlItemFieldEnum != null) {
                FieldValueItem fvi =(FieldValueItem)(Object) srcDoc.getFieldValue(url.getName(), 0);
                if (fvi != null) currentURL = new URL(fvi.getValue());
            }
            for (HtmlNodeAbstract node :(HtmlNodeAbstract[])(Object) (Object[])(Object)nodes) {
                String href = null;
                String rel = null;
                String nodeName =(String)(Object) node.getNodeName();
                if ("a".equals(nodeName)) {
                    href =(String)(Object) node.getAttributeText("href");
                    rel =(String)(Object) node.getAttributeText("rel");
                } else if ("frame".equals(nodeName)) {
                    href =(String)(Object) node.getAttributeText("src");
                }
                boolean follow = true;
                if (rel != null) if (rel.contains("nofollow")) follow = false;
                URL newUrl = null;
                if (href != null) if (!href.startsWith("javascript:")) if (currentURL != null) newUrl =(URL)(Object) LinkUtils.getLink(currentURL, href, urlFilterList);
                if (newUrl != null) {
                    ParserFieldEnum field = null;
                    if ((boolean)(Object)newUrl.getHost().equalsIgnoreCase(currentURL.getHost())) {
                        if (follow) field =(ParserFieldEnum)(Object) ParserFieldEnum.internal_link; else field =(ParserFieldEnum)(Object) ParserFieldEnum.internal_link_nofollow;
                    } else {
                        if (follow) field =(ParserFieldEnum)(Object) ParserFieldEnum.external_link; else field =(ParserFieldEnum)(Object) ParserFieldEnum.external_link_nofollow;
                    }
                    addField(field, newUrl.toExternalForm());
                }
            }
        }
        if (!metaRobotsNoIndex) {
            nodes =(List)(Object) rootNode.getNodes("html", "body");
            if (nodes == null ||(int)(Object) nodes.size() == 0) nodes =(List)(Object) rootNode.getNodes("html");
            if (nodes != null &&(int)(Object) nodes.size() > 0) {
                StringBuffer sb = new StringBuffer();
                getBodyTextContent(sb, nodes.get(0), true, null);
                addField(ParserFieldEnum.body, sb);
            }
        }
        Locale lang = null;
        String langMethod = null;
        String[] pathHtml = { "html" };
        nodes =(List)(Object) rootNode.getNodes(pathHtml);
        if (nodes != null &&(int)(Object) nodes.size() > 0) {
            langMethod = "html lang attribute";
            String l =(String)(Object) nodes.get(0).getAttributeText("lang");
            if (l != null) lang =(Locale)(Object) Lang.findLocaleISO639(l);
        }
        if (lang == null && metaContentLanguage != null) {
            langMethod = "meta http-equiv content-language";
            lang =(Locale)(Object) Lang.findLocaleISO639(metaContentLanguage);
        }
        if (lang == null && metaDcLanguage != null) {
            langMethod = "meta dc.language";
            lang =(Locale)(Object) Lang.findLocaleISO639(metaDcLanguage);
        }
        if (lang != null) {
            addField(ParserFieldEnum.lang, lang.getLanguage());
            addField(ParserFieldEnum.lang_method, langMethod);
        } else if (!metaRobotsNoIndex) lang =(Locale)(Object) langDetection(10000, ParserFieldEnum.body);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass lang_method;
	public MyHelperClass internal_link;
	public MyHelperClass DEFAULT_CHARSET;
	public MyHelperClass internal_link_nofollow;
	public MyHelperClass htmlSource;
	public MyHelperClass htmlProvider;
	public MyHelperClass meta_keywords;
	public MyHelperClass meta_description;
	public MyHelperClass charset;
	public MyHelperClass body;
	public MyHelperClass lang;
	public MyHelperClass external_link;
	public MyHelperClass meta_robots;
	public MyHelperClass external_link_nofollow;
public MyHelperClass getAttributeText(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass findLocaleISO639(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }
	public MyHelperClass getMetaContent(HtmlNodeAbstract o0){ return null; }
	public MyHelperClass getLink(URL o0, String o1, UrlFilterItem[] o2){ return null; }
	public MyHelperClass extractContentTypeCharset(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, StringWriter o1, String o2){ return null; }}

class StreamLimiter {

public MyHelperClass getNewInputStream(){ return null; }}

class LanguageEnum {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IndexDocument {

public MyHelperClass getFieldValue(MyHelperClass o0, int o1){ return null; }}

class FieldValueItem {

public MyHelperClass getValue(){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }}

class HtmlDocumentProvider {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getBaseHref(){ return null; }
	public MyHelperClass getMetaHttpEquiv(String o0){ return null; }
	public MyHelperClass getRootNode(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getMetas(){ return null; }
	public MyHelperClass getMetaCharset(){ return null; }}

class HtmlNodeAbstract {

public MyHelperClass getNodes(String o0){ return null; }
	public MyHelperClass getNodes(String o0, String o1){ return null; }
	public MyHelperClass getAttributeText(String o0){ return null; }
	public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getNodes(String[] o0){ return null; }
	public MyHelperClass getAllNodes(String o0, String o1){ return null; }}

class UrlFilterItem {

}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class ParserFieldEnum {

}

class Locale {

public MyHelperClass getLanguage(){ return null; }}
