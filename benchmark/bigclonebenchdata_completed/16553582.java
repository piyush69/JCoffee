import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16553582 {
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }

    public QueryResult doSearch(String searchTerm, Integer searchInReceivedItems, Integer searchInSentItems, Integer searchInSupervisedItems, Integer startRow, Integer resultCount, Boolean searchArchived, Boolean searchInItemsNeededAttentionOnly) throws Throwable, UnsupportedEncodingException, IOException {
        MyHelperClass RuntimeAccess = new MyHelperClass();
        String sessionId = (String) RuntimeAccess.getInstance().getSession().getAttribute("SESSION_ID");
        DefaultHttpClient httpclient = new DefaultHttpClient();
        QueryResult queryResult = new QueryResult();
        SearchRequest request = new SearchRequest();
        SearchItemsQuery query = new SearchItemsQuery();
        query.setArchiveIncluded(searchArchived);
        MyHelperClass INFO = new MyHelperClass();
        log(INFO, "searchTerm=" + searchTerm);
//        MyHelperClass INFO = new MyHelperClass();
        log(INFO, "search in received=" + searchInReceivedItems);
//        MyHelperClass INFO = new MyHelperClass();
        log(INFO, "search in sent=" + searchInSentItems);
//        MyHelperClass INFO = new MyHelperClass();
        log(INFO, "search in supervised=" + searchInSupervisedItems);
        List<String> filters = new ArrayList<String>();
        if (searchInItemsNeededAttentionOnly == false) {
            if (searchInReceivedItems != null) {
                filters.add("ALL_RECEIVED_ITEMS");
            }
            if (searchInSentItems != null) {
                filters.add("ALL_SENT_ITEMS");
            }
            if (searchInSupervisedItems != null) {
                filters.add("ALL_SUPERVISED_ITEMS");
            }
        } else {
            if (searchInReceivedItems != null) {
                filters.add("RECEIVED_ITEMS_NEEDED_ATTENTION");
            }
            if (searchInSentItems != null) {
                filters.add("SENT_ITEMS_NEEDED_ATTENTION");
            }
        }
        query.setFilters(filters);
        query.setId("1234");
        query.setOwner(sessionId);
        query.setReferenceOnly(false);
        query.setSearchTerm(searchTerm);
        query.setUseOR(false);
        request.setStartRow(startRow);
        request.setResultCount(resultCount);
        request.setQuery(query);
        request.setSessionId(sessionId);
        XStream writer = new XStream();
        MyHelperClass XStream = new MyHelperClass();
        writer.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        writer.alias("SearchRequest", SearchRequest.class);
        XStream reader = new XStream();
//        MyHelperClass XStream = new MyHelperClass();
        reader.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
        reader.alias("SearchResponse", SearchResponse.class);
        String strRequest = URLEncoder.encode(reader.toXML(request), "UTF-8");
        MyHelperClass MewitProperties = new MyHelperClass();
        HttpGet httpget = new HttpGet(MewitProperties.getMewitUrl() + "/resources/search?REQUEST=" + strRequest);
        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String result = URLDecoder.decode(EntityUtils.toString(entity), "UTF-8");
            SearchResponse searchResponse = (SearchResponse) reader.fromXML(result);
            List<Item> items = searchResponse.getItems();
            queryResult.setItems(items);
            queryResult.setTotal(searchResponse.getTotalResultCount());
            queryResult.setStartRow(searchResponse.getStartRow());
        }
        return queryResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPATH_ABSOLUTE_REFERENCES;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getMewitUrl(){ return null; }}

class QueryResult {

public MyHelperClass setItems(List<Item o0){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class SearchRequest {

public MyHelperClass setResultCount(Integer o0){ return null; }
	public MyHelperClass setStartRow(Integer o0){ return null; }
	public MyHelperClass setQuery(SearchItemsQuery o0){ return null; }
	public MyHelperClass setSessionId(String o0){ return null; }}

class SearchItemsQuery {

public MyHelperClass setSearchTerm(String o0){ return null; }
	public MyHelperClass setOwner(String o0){ return null; }
	public MyHelperClass setUseOR(boolean o0){ return null; }
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setArchiveIncluded(Boolean o0){ return null; }
	public MyHelperClass setReferenceOnly(boolean o0){ return null; }
	public MyHelperClass setFilters(List<String o0){ return null; }}

class XStream {

public MyHelperClass fromXML(String o0){ return null; }
	public MyHelperClass toXML(SearchRequest o0){ return null; }
	public MyHelperClass alias(String o0, Class<SearchRequest o1){ return null; }
	public MyHelperClass alias(String o0, Class<SearchResponse o1){ return null; }}

class SearchResponse {

public MyHelperClass getTotalResultCount(){ return null; }
	public MyHelperClass getStartRow(){ return null; }
	public MyHelperClass getItems(){ return null; }}

class HttpGet {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Item {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
