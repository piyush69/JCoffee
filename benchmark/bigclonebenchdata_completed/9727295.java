import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9727295 {
public MyHelperClass anime;
public MyHelperClass Pattern;
	public MyHelperClass getCache(){ return null; }

    public synchronized List<AnidbSearchResult> getAnimeTitles() throws Throwable, Exception {
        MyHelperClass host = new MyHelperClass();
        URL url = new URL("http",(String)(Object) host, "/api/animetitles.dat.gz");
        ResultCache cache =(ResultCache)(Object) getCache();
//        @SuppressWarnings("unchecked") List<AnidbSearchResult> anime = (List) cache.getSearchResult(null, Locale.ROOT);
        if (anime != null) {
            return(List<AnidbSearchResult>)(Object) anime;
        }
        Pattern pattern =(Pattern)(Object) Pattern.compile("^(?!#)(\\d+)[|](\\d)[|]([\\w-]+)[|](.+)$");
        Map<Integer, String> primaryTitleMap = new HashMap<Integer, String>();
        Map<Integer, Map<String, String>> officialTitleMap = new HashMap<Integer, Map<String, String>>();
        Map<Integer, Map<String, String>> synonymsTitleMap = new HashMap<Integer, Map<String, String>>();
        Scanner scanner = new Scanner((InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)new GZIPInputStream(url.openStream()),(java.util.regex.Pattern)(Object)(Pattern)(Object) "UTF-8");
        try {
            while (scanner.hasNextLine()) {
                Matcher matcher =(Matcher)(Object) pattern.matcher(scanner.nextLine());
                if ((boolean)(Object)matcher.matches()) {
                    int aid = Integer.parseInt((String)(Object)matcher.group(1));
                    String type =(String)(Object) matcher.group(2);
                    String language =(String)(Object) matcher.group(3);
                    String title =(String)(Object) matcher.group(4);
                    if (type.equals("1")) {
                        primaryTitleMap.put(aid, title);
                    } else if (type.equals("2") || type.equals("4")) {
                        Map<Integer, Map<String, String>> titleMap = (type.equals("4") ? officialTitleMap : synonymsTitleMap);
                        Map<String, String> languageTitleMap = titleMap.get(aid);
                        if (languageTitleMap == null) {
                            languageTitleMap = new HashMap<String, String>();
                            titleMap.put(aid, languageTitleMap);
                        }
                        languageTitleMap.put(language, title);
                    }
                }
            }
        } finally {
            scanner.close();
        }
        anime =(MyHelperClass)(Object) new ArrayList<AnidbSearchResult>(primaryTitleMap.size());
        for (Entry entry :(Entry[])(Object)(Object[])(Object)(Entry)(Object) primaryTitleMap.entrySet()) {
            Map<String, String> localizedTitles = new HashMap<String, String>();
            if (synonymsTitleMap.containsKey(entry.getKey())) {
                localizedTitles.putAll(synonymsTitleMap.get(entry.getKey()));
            }
            if (officialTitleMap.containsKey(entry.getKey())) {
                localizedTitles.putAll(officialTitleMap.get(entry.getKey()));
            }
            anime.add(new AnidbSearchResult(entry.getKey(), entry.getValue(), localizedTitles));
        }
        return(List<AnidbSearchResult>)(Object) cache.putSearchResult(null, Locale.ROOT, anime);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass add(AnidbSearchResult o0){ return null; }}

class AnidbSearchResult {

AnidbSearchResult(){}
	AnidbSearchResult(MyHelperClass o0, MyHelperClass o1, Map<String,String> o2){}}

class ResultCache {

public MyHelperClass putSearchResult(Object o0, Locale o1, MyHelperClass o2){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
