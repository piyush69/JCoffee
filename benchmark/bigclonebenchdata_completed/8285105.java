


class c8285105 {
public MyHelperClass getNormalizedUri(URI o0){ return null; }
	public MyHelperClass containsNormalizedUriKey(URI o0){ return null; }
	public MyHelperClass putNormalizedUri(URI o0, URI o1){ return null; }
public MyHelperClass URIUtil;
	public MyHelperClass iteratorModulePaths(){ return null; }
	public MyHelperClass normalizePath(String o0){ return null; }
	public MyHelperClass toURL(String o0){ return null; }

    public URI normalize(final URI uri) {
        URI normalizedUri = this.normalize(uri);
        if (normalizedUri.equals(uri)) {
            String resourceName = uri.toString().replaceAll(".*(\\\\+|/)", "");
            if (!(Boolean)(Object)containsNormalizedUriKey(uri)) {
                for (Iterator iterator =(Iterator)(Object) this.iteratorModulePaths();(boolean)(Object) iterator.hasNext(); ) {
                    String searchPath =(String)(Object) iterator.next().getPath();
                    String completePath =(String)(Object) this.normalizePath(searchPath + '/' + resourceName);
                    try {
                        InputStream stream = null;
                        URL url =(URL)(Object) toURL(completePath);
                        if (url != null) {
                            try {
                                stream =(InputStream)(Object) url.openStream();
                                stream.close();
                            } catch (Exception exception) {
                                url = null;
                            } finally {
                                stream = null;
                            }
                            if (url != null) {
                                normalizedUri =(URI)(Object) URIUtil.createUri(url.toString());
                                this.putNormalizedUri(uri, normalizedUri);
                                break;
                            }
                        }
                    } catch (Exception exception) {
                    }
                }
            } else {
                normalizedUri =(URI)(Object) getNormalizedUri(uri);
            }
        }
        return normalizedUri;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createUri(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }}

class URI {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Path {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
