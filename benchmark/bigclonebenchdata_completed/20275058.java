import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20275058 {
public MyHelperClass allowedProtocols;
	public MyHelperClass enableFormDataForwarding;
	public MyHelperClass CookieTools;
	public MyHelperClass enableFormDataSecureInsecureForwarding;
	public MyHelperClass secureAllowedProtocols;
	public MyHelperClass HttpServletResponse;
	public MyHelperClass rewrittenContentTypes;
	public MyHelperClass enableCookieForwarding;
	public MyHelperClass MESSAGES;
	public MyHelperClass MessageFormat;
	public MyHelperClass enableCookieSecureInsecureForwarding;
	public MyHelperClass getServletContext(){ return null; }

    protected void doGetPost(HttpServletRequest req, HttpServletResponse resp, boolean post) throws Throwable, ServletException, IOException {
        MyHelperClass responseBufferSize = new MyHelperClass();
        if (responseBufferSize > 0) resp.setBufferSize(responseBufferSize);
        String pathinfo = req.getPathInfo();
        if (pathinfo == null) {
            MyHelperClass REMOTE_URL = new MyHelperClass();
            String urlstring = req.getParameter(REMOTE_URL);
            if (urlstring == null) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST, ResourceBundle.getBundle(MESSAGES, req.getLocale(), new UTF8ResourceBundleControl()).getString("error.nourl"));
                return;
            }
            MyHelperClass ALLOW_COOKIE_FORWARDING = new MyHelperClass();
            boolean allowCookieForwarding = "true".equals(req.getParameter(ALLOW_COOKIE_FORWARDING));
            MyHelperClass ALLOW_FORM_DATA_FORWARDING = new MyHelperClass();
            boolean allowFormDataForwarding = "true".equals(req.getParameter(ALLOW_FORM_DATA_FORWARDING));
            MyHelperClass HttpUtils = new MyHelperClass();
            String target = new JGlossURLRewriter(req.getContextPath() + req.getServletPath(), new URL(HttpUtils.getRequestURL(req).toString()), null, allowCookieForwarding, allowFormDataForwarding).rewrite(urlstring, true);
            resp.sendRedirect(target);
            return;
        }
        Set connectionAllowedProtocols;
        MyHelperClass secureAllowedProtocols = new MyHelperClass();
        if (req.isSecure()) connectionAllowedProtocols = secureAllowedProtocols; else connectionAllowedProtocols = allowedProtocols;
        MyHelperClass JGlossURLRewriter = new MyHelperClass();
        Object[] oa = JGlossURLRewriter.parseEncodedPath(pathinfo);
        if (oa == null) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale(), new UTF8ResourceBundleControl()).getString("error.malformedrequest"), new Object[] { pathinfo }));
            return;
        }
        boolean allowCookieForwarding = ((Boolean) oa[0]).booleanValue();
        boolean allowFormDataForwarding = ((Boolean) oa[1]).booleanValue();
        String urlstring = (String) oa[2];
        getServletContext().log("received request for " + urlstring);
        if (urlstring.toLowerCase().indexOf(req.getServletPath().toLowerCase()) != -1) {
            resp.sendError(HttpServletResponse.SC_FORBIDDEN, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale()).getString("error.addressnotallowed"), new Object[] { urlstring }));
            return;
        }
        if (urlstring.indexOf(':') == -1) {
            if (req.isSecure()) {
                if (secureAllowedProtocols.contains("https")) urlstring = "https://" + urlstring;
            } else {
                if (allowedProtocols.contains("http")) urlstring = "http://" + urlstring;
            }
        }
        URL url;
        try {
            url = new URL(urlstring);
        } catch (MalformedURLException ex) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale()).getString("error.malformedurl"), new Object[] { urlstring }));
            return;
        }
        String protocol = url.getProtocol();
        if (!connectionAllowedProtocols.contains(protocol)) {
            resp.sendError(HttpServletResponse.SC_FORBIDDEN, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale()).getString("error.protocolnotallowed"), new Object[] { protocol }));
            getServletContext().log("protocol not allowed accessing " + url.toString());
            return;
        }
        boolean remoteIsHttp = protocol.equals("http") || protocol.equals("https");
        boolean forwardCookies = remoteIsHttp && enableCookieForwarding && allowCookieForwarding;
        boolean forwardFormData = remoteIsHttp && enableFormDataForwarding && allowFormDataForwarding && (enableFormDataSecureInsecureForwarding || !req.isSecure() || url.getProtocol().equals("https"));
        if (forwardFormData) {
            String query = req.getQueryString();
            if (query != null && query.length() > 0) {
                if (url.getQuery() == null || url.getQuery().length() == 0) url = new URL(url.toExternalForm() + "?" + query); else url = new URL(url.toExternalForm() + "&" + query);
            }
        }
        JGlossURLRewriter rewriter = new JGlossURLRewriter(new URL(req.getScheme(), req.getServerName(), req.getServerPort(), req.getContextPath() + req.getServletPath()).toExternalForm(), url, connectionAllowedProtocols, allowCookieForwarding, allowFormDataForwarding);
        URLConnection connection = url.openConnection();
        if (forwardFormData && post && remoteIsHttp) {
            getServletContext().log("using POST");
            try {
                ((HttpURLConnection) connection).setRequestMethod("POST");
            } catch (ClassCastException ex) {
                getServletContext().log("failed to set method POST: " + ex.getMessage());
            }
            connection.setDoInput(true);
            connection.setDoOutput(true);
        }
        String acceptEncoding = buildAcceptEncoding(req.getHeader("accept-encoding"));
        getServletContext().log("accept-encoding: " + acceptEncoding);
        if (acceptEncoding != null) connection.setRequestProperty("Accept-Encoding", acceptEncoding);
        forwardRequestHeaders(connection, req);
        if (forwardCookies && (enableCookieSecureInsecureForwarding || !req.isSecure() || url.getProtocol().equals("https"))) CookieTools.addRequestCookies(connection, req.getCookies(), getServletContext());
        try {
            connection.connect();
        } catch (UnknownHostException ex) {
            resp.sendError(HttpServletResponse.SC_BAD_GATEWAY, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale()).getString("error.unknownhost"), new Object[] { url.toExternalForm(), url.getHost() }));
            return;
        } catch (IOException ex) {
            resp.sendError(HttpServletResponse.SC_BAD_GATEWAY, MessageFormat.format(ResourceBundle.getBundle(MESSAGES, req.getLocale()).getString("error.connect"), new Object[] { url.toExternalForm(), ex.getClass().getName(), ex.getMessage() }));
            return;
        }
        if (forwardFormData && post && remoteIsHttp) {
            InputStream is = req.getInputStream();
            OutputStream os = connection.getOutputStream();
            byte[] buf = new byte[512];
            int len;
            while ((len = is.read(buf)) != -1) os.write(buf, 0, len);
            is.close();
            os.close();
        }
        forwardResponseHeaders(connection, req, resp, rewriter);
        if (forwardCookies && (enableCookieSecureInsecureForwarding || req.isSecure() || !url.getProtocol().equals("https"))) CookieTools.addResponseCookies(connection, resp, req.getServerName(), req.getContextPath() + req.getServletPath(), req.isSecure(), getServletContext());
        if (remoteIsHttp) {
            try {
                int response = ((HttpURLConnection) connection).getResponseCode();
                getServletContext().log("response code " + response);
                resp.setStatus(response);
                if (response == 304) return;
            } catch (ClassCastException ex) {
                getServletContext().log("failed to read response code: " + ex.getMessage());
            }
        }
        String type = connection.getContentType();
        getServletContext().log("content type " + type + " url " + connection.getURL().toString());
        boolean supported = false;
        if (type != null) {
            for (int i = 0; i < rewrittenContentTypes.length; i++) if (type.startsWith(rewrittenContentTypes[i])) {
                supported = true;
                break;
            }
        }
        if (supported) {
            String encoding = connection.getContentEncoding();
            supported = encoding == null || encoding.endsWith("gzip") || encoding.endsWith("deflate") || encoding.equals("identity");
        }
        if (supported) rewrite(connection, req, resp, rewriter); else tunnel(connection, req, resp);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class JGlossURLRewriter {

}
