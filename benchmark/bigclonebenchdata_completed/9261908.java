import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9261908 {
public MyHelperClass METHOD;
	public MyHelperClass ErrorCode;
public MyHelperClass _followRedirects;
	public MyHelperClass _allowCompression;
	public MyHelperClass AGENT;
	public MyHelperClass HttpStatus;
	public MyHelperClass ClientUtils;
	public MyHelperClass _httpClient;
	public MyHelperClass useMultiPartPost;

    public NamedList request(final SolrRequest request, ResponseParser processor) throws Throwable, SolrServerException, IOException {
        HttpMethod method = null;
        InputStream is = null;
        SolrParams params =(SolrParams)(Object) request.getParams();
        MyHelperClass requestWriter = new MyHelperClass();
        Collection<ContentStream> streams =(Collection<ContentStream>)(Object) requestWriter.getContentStreams(request);
//        MyHelperClass requestWriter = new MyHelperClass();
        String path =(String)(Object) requestWriter.getPath(request);
        if (path == null || !path.startsWith("/")) {
            path = "/select";
        }
        ResponseParser parser =(ResponseParser)(Object) request.getResponseParser();
        if (parser == null) {
            MyHelperClass _parser = new MyHelperClass();
            parser =(ResponseParser)(Object) _parser;
        }
        ModifiableSolrParams wparams = new ModifiableSolrParams();
        MyHelperClass CommonParams = new MyHelperClass();
        wparams.set(CommonParams.WT, parser.getWriterType());
//        MyHelperClass CommonParams = new MyHelperClass();
        wparams.set(CommonParams.VERSION, parser.getVersion());
        if (params == null) {
            params =(SolrParams)(Object) wparams;
        } else {
            params =(SolrParams)(Object) new DefaultSolrParams(wparams, params);
        }
        MyHelperClass _invariantParams = new MyHelperClass();
        if (_invariantParams != null) {
//            MyHelperClass _invariantParams = new MyHelperClass();
            params =(SolrParams)(Object) new DefaultSolrParams(_invariantParams, params);
        }
        MyHelperClass _maxRetries = new MyHelperClass();
        int tries =(int)(Object) _maxRetries + 1;
        try {
            while (tries-- > 0) {
                try {
                    if (METHOD.GET == request.getMethod()) {
                        if (streams != null) {
                            throw new SolrException(ErrorCode.BAD_REQUEST, "GET can't send streams!");
                        }
                        MyHelperClass _baseURL = new MyHelperClass();
                        method = new GetMethod(_baseURL + path + ClientUtils.toQueryString(params, false));
                    } else if (METHOD.POST == request.getMethod()) {
                        MyHelperClass _baseURL = new MyHelperClass();
                        String url = _baseURL + path;
                        boolean isMultipart = (streams != null && streams.size() > 1);
                        if (streams == null || isMultipart) {
                            PostMethod post = new PostMethod(url);
                            post.getParams().setContentCharset("UTF-8");
                            if (!(Boolean)(Object)this.useMultiPartPost && !isMultipart) {
                                post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            List<Part> parts = new LinkedList<Part>();
                            Iterator<String> iter =(Iterator<String>)(Object) params.getParameterNamesIterator();
                            while (iter.hasNext()) {
                                String p = iter.next();
                                String[] vals =(String[])(Object) params.getParams(p);
                                if (vals != null) {
                                    for (String v : vals) {
                                        if ((boolean)(Object)this.useMultiPartPost || isMultipart) {
                                            parts.add((Part)(Object)new StringPart(p, v, "UTF-8"));
                                        } else {
                                            post.addParameter(p, v);
                                        }
                                    }
                                }
                            }
                            if (isMultipart) {
                                int i = 0;
                                for (ContentStream content : streams) {
                                    final ContentStream c = content;
                                    String charSet = null;
                                    String transferEncoding = null;
                                    parts.add(new PartBase(c.getName(), c.getContentType(), charSet, transferEncoding) {

//                                        @Override
                                        protected long lengthOfData() throws IOException {
                                            return(long)(Object) c.getSize();
                                        }

//                                        @Override
                                        protected void sendData(OutputStream out) throws IOException {
                                            Reader reader =(Reader)(Object) c.getReader();
                                            try {
                                                MyHelperClass IOUtils = new MyHelperClass();
                                                IOUtils.copy(reader, out);
                                            } finally {
                                                reader.close();
                                            }
                                        }
                                    });
                                }
                            }
                            if (parts.size() > 0) {
                                post.setRequestEntity(new MultipartRequestEntity(parts.toArray(new Part[parts.size()]), post.getParams()));
                            }
                            method =(HttpMethod)(Object) post;
                        } else {
                            String pstr =(String)(Object) ClientUtils.toQueryString(params, false);
                            PostMethod post = new PostMethod(url + pstr);
                            final ContentStream[] contentStream = new ContentStream[1];
                            for (ContentStream content : streams) {
                                contentStream[0] = content;
                                break;
                            }
                            if ((LazyContentStream)(Object)contentStream[0] instanceof LazyContentStream) {
                                post.setRequestEntity(new RequestEntity() {

                                    public long getContentLength() {
                                        return -1;
                                    }

                                    public String getContentType() {
                                        return(String)(Object) contentStream[0].getContentType();
                                    }

                                    public boolean isRepeatable() {
                                        return false;
                                    }

                                    public void writeRequest(OutputStream outputStream) throws IOException {
                                        ((LazyContentStream)(LazyContentStream)(Object) contentStream[0]).writeTo(outputStream);
                                    }
                                });
                            } else {
                                is =(InputStream)(Object) contentStream[0].getStream();
                                post.setRequestEntity(new InputStreamRequestEntity(is, contentStream[0].getContentType()));
                            }
                            method =(HttpMethod)(Object) post;
                        }
                    } else {
                        throw new SolrServerException("Unsupported method: " + request.getMethod());
                    }
                } catch (NoHttpResponseException r) {
                    method.releaseConnection();
                    method = null;
                    if (is != null) {
                        is.close();
                    }
                    if ((tries < 1)) {
                        throw r;
                    }
                }
            }
        } catch (IOException ex) {
            throw new SolrServerException("error reading streams", ex);
        }
        method.setFollowRedirects(_followRedirects);
        method.addRequestHeader("User-Agent", AGENT);
        if ((boolean)(Object)_allowCompression) {
            method.setRequestHeader(new Header("Accept-Encoding", "gzip,deflate"));
        }
        try {
            int statusCode =(int)(Object) _httpClient.executeMethod(method);
            if (statusCode != (int)(Object)HttpStatus.SC_OK) {
                StringBuilder msg = new StringBuilder();
                msg.append(method.getStatusLine().getReasonPhrase());
                msg.append("\n\n");
                msg.append(method.getStatusText());
                msg.append("\n\n");
                msg.append("request: " + method.getURI());
                throw new SolrException(statusCode, java.net.URLDecoder.decode(msg.toString(), "UTF-8"));
            }
            String charset = "UTF-8";
            if ((HttpMethodBase)(Object)method instanceof HttpMethodBase) {
                charset = ((HttpMethodBase)(HttpMethodBase)(Object) method).getResponseCharSet();
            }
            InputStream respBody =(InputStream)(Object) method.getResponseBodyAsStream();
            if ((boolean)(Object)_allowCompression) {
                Header contentEncodingHeader =(Header)(Object) method.getResponseHeader("Content-Encoding");
                if (contentEncodingHeader != null) {
                    String contentEncoding =(String)(Object) contentEncodingHeader.getValue();
                    if (contentEncoding.contains("gzip")) {
                        respBody =(InputStream)(Object) new GZIPInputStream(respBody);
                    } else if (contentEncoding.contains("deflate")) {
                        respBody =(InputStream)(Object) new InflaterInputStream(respBody);
                    }
                } else {
                    Header contentTypeHeader =(Header)(Object) method.getResponseHeader("Content-Type");
                    if (contentTypeHeader != null) {
                        String contentType =(String)(Object) contentTypeHeader.getValue();
                        if (contentType != null) {
                            if (contentType.startsWith("application/x-gzip-compressed")) {
                                respBody =(InputStream)(Object) new GZIPInputStream(respBody);
                            } else if (contentType.startsWith("application/x-deflate")) {
                                respBody =(InputStream)(Object) new InflaterInputStream(respBody);
                            }
                        }
                    }
                }
            }
            return(NamedList)(Object) processor.processResponse(respBody, charset);
        } catch (HttpException e) {
            throw new SolrServerException((String)(Object)e);
        } catch (IOException e) {
            throw new SolrServerException((String)(Object)e);
        } finally {
            method.releaseConnection();
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass GET;
	public MyHelperClass VERSION;
	public MyHelperClass BAD_REQUEST;
	public MyHelperClass WT;
	public MyHelperClass POST;
public MyHelperClass executeMethod(HttpMethod o0){ return null; }
	public MyHelperClass copy(Reader o0, OutputStream o1){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getContentStreams(SolrRequest o0){ return null; }
	public MyHelperClass getPath(SolrRequest o0){ return null; }
	public MyHelperClass toQueryString(SolrParams o0, boolean o1){ return null; }
	public MyHelperClass setContentCharset(String o0){ return null; }}

class SolrRequest {

public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass getResponseParser(){ return null; }}

class ResponseParser {

public MyHelperClass getWriterType(){ return null; }
	public MyHelperClass processResponse(InputStream o0, String o1){ return null; }
	public MyHelperClass getVersion(){ return null; }}

class NamedList {

}

class SolrServerException extends Exception{
	public SolrServerException(String errorMessage) { super(errorMessage); }
	SolrServerException(String o0, IOException o1){}
	SolrServerException(){}
}

class HttpMethod {

public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getResponseHeader(String o0){ return null; }
	public MyHelperClass setRequestHeader(Header o0){ return null; }
	public MyHelperClass getStatusText(){ return null; }
	public MyHelperClass addRequestHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFollowRedirects(MyHelperClass o0){ return null; }}

class SolrParams {

public MyHelperClass getParams(String o0){ return null; }
	public MyHelperClass getParameterNamesIterator(){ return null; }}

class ContentStream {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getReader(){ return null; }}

class ModifiableSolrParams {

public MyHelperClass set(MyHelperClass o0, MyHelperClass o1){ return null; }}

class DefaultSolrParams {

DefaultSolrParams(ModifiableSolrParams o0, SolrParams o1){}
	DefaultSolrParams(MyHelperClass o0, SolrParams o1){}
	DefaultSolrParams(){}}

class SolrException extends Exception{
	public SolrException(String errorMessage) { super(errorMessage); }
	SolrException(int o0, String o1){}
	SolrException(){}
}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass setRequestEntity(<anonymous RequestEntity> o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass addParameter(String o0, String o1){ return null; }
	public MyHelperClass setRequestEntity(){ return null; }}

class Part {

}

class StringPart {

StringPart(){}
	StringPart(String o0, String o1, String o2){}}

class PartBase {

PartBase(MyHelperClass o0, MyHelperClass o1, String o2, String o3){}
	PartBase(){}}

class MultipartRequestEntity {

MultipartRequestEntity(Part[] o0, MyHelperClass o1){}
	MultipartRequestEntity(){}}

class RequestEntity {

}

class InputStreamRequestEntity {

InputStreamRequestEntity(InputStream o0, MyHelperClass o1){}
	InputStreamRequestEntity(){}}

class NoHttpResponseException extends Exception{
	public NoHttpResponseException(String errorMessage) { super(errorMessage); }
}

class Header {

Header(String o0, String o1){}
	Header(){}
	public MyHelperClass getValue(){ return null; }}

class HttpMethodBase {

public MyHelperClass getResponseCharSet(){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(InputStream o0){}
	InflaterInputStream(){}}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class LazyContentStream {

}
