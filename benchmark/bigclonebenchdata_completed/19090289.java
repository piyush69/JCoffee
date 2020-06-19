import java.io.*;
import java.lang.*;
import java.util.*;



class c19090289 {
public static MyHelperClass channel;
	public static MyHelperClass JReader;
	public static MyHelperClass getChannelFromXML(String o0){ return null; }
	public static MyHelperClass getHome(String o0){ return null; }
//public MyHelperClass channel;
//	public MyHelperClass JReader;
//	public MyHelperClass getChannelFromXML(String o0){ return null; }
//	public MyHelperClass getHome(String o0){ return null; }

    public static Channel getChannelFromSite(String siteURL) throws LinkNotFoundException, MalformedURLException, SAXException, IOException {
        String channelURL = "";
        siteURL = siteURL.trim();
        if (!siteURL.startsWith("http://")) {
            siteURL = "http://" + siteURL;
        }
        URL url = new URL(siteURL);
        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        String[] lines = new String[3];
        for (int i = 0; i < lines.length; i++) {
            if ((lines[i] = in.readLine()) == null) {
                lines[i] = "";
                break;
            }
        }
        if (lines[0].contains("xml version")) {
            if (lines[0].contains("rss") || lines[1].contains("rss")) {
                channelURL = siteURL;
            }
            if (lines[0].contains("Atom") || lines[1].contains("Atom") || lines[2].contains("Atom")) {
                channelURL = siteURL;
            }
        }
        in.close();
        in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        String iconURL = null;
        String inputLine;
        if ("".equals(channelURL)) {
            boolean isIconURLFound = false;
            boolean isChannelURLFound = false;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("type=\"image/x-icon\"") || inputLine.toLowerCase().contains("rel=\"shortcut icon\"")) {
                    String tmp = new String(inputLine);
                    String[] smallLines = inputLine.replace(">", ">\n").split("\n");
                    for (String smallLine : smallLines) {
                        if (smallLine.contains("type=\"image/x-icon\"") || smallLine.toLowerCase().contains("rel=\"shortcut icon\"")) {
                            tmp = smallLine;
                            break;
                        }
                    }
                    isIconURLFound = true;
                    iconURL = tmp.replaceAll("^.*href=\"", "");
                    iconURL = iconURL.replaceAll("\".*", "");
                    tmp = null;
                    String originalSiteURL = new String(siteURL);
                    siteURL =(String)(Object) getHome(siteURL);
                    if (iconURL.charAt(0) == '/') {
                        if (siteURL.charAt(siteURL.length() - 1) == '/') {
                            iconURL = siteURL + iconURL.substring(1);
                        } else {
                            iconURL = siteURL + iconURL;
                        }
                    } else if (!iconURL.startsWith("http://")) {
                        if (siteURL.charAt(siteURL.length() - 1) == '/') {
                            iconURL = siteURL + iconURL;
                        } else {
                            iconURL = siteURL + "/" + iconURL;
                        }
                    }
                    siteURL = originalSiteURL;
                    if (isChannelURLFound && isIconURLFound) {
                        break;
                    }
                }
                if ((inputLine.contains("type=\"application/rss+xml\"") || inputLine.contains("type=\"application/atom+xml\"")) && !isChannelURLFound) {
                    if (!inputLine.contains("href=")) {
                        while ((inputLine = in.readLine()) != null) {
                            if (inputLine.contains("href=")) {
                                break;
                            }
                        }
                    }
                    inputLine = inputLine.replace(">", ">\n");
                    String[] smallLines = inputLine.split("\n");
                    for (String smallLine : smallLines) {
                        if (smallLine.contains("type=\"application/rss+xml\"") || smallLine.contains("type=\"application/atom+xml\"")) {
                            inputLine = smallLine;
                            break;
                        }
                    }
                    channelURL = inputLine.replaceAll("^.*href=\"", "");
                    channelURL = channelURL.replaceAll("\".*", "");
                    if (channelURL.charAt(0) == '/') {
                        if (siteURL.charAt(siteURL.length() - 1) == '/') {
                            channelURL = siteURL + channelURL.substring(1);
                        } else {
                            channelURL = siteURL + channelURL;
                        }
                    } else if (!channelURL.startsWith("http://")) {
                        if (siteURL.charAt(siteURL.length() - 1) == '/') {
                            channelURL = siteURL + channelURL;
                        } else {
                            channelURL = siteURL + "/" + channelURL;
                        }
                    }
                    isChannelURLFound = true;
                    if (isChannelURLFound && isIconURLFound) {
                        break;
                    }
                }
                if (inputLine.contains("</head>".toLowerCase())) {
                    break;
                }
            }
            in.close();
            if ("".equals(channelURL)) {
                throw new LinkNotFoundException();
            }
        }
        channel = getChannelFromXML(channelURL.trim());
        if (iconURL == null || "".equals(iconURL.trim())) {
            iconURL = "favicon.ico";
            if (siteURL.equalsIgnoreCase((String)(Object)channel.getChannelURL())) {
                siteURL =(String)(Object) channel.getLink();
            }
            siteURL =(String)(Object) getHome(siteURL);
            if (siteURL.charAt(siteURL.length() - 1) == '/') {
                iconURL = siteURL + iconURL;
            } else {
                iconURL = siteURL + "/" + iconURL;
            }
        }
        try {
            String iconFileName =(String)(Object) getHome((String)(Object)channel.getLink());
            if (iconFileName.startsWith("http://")) {
                iconFileName = iconFileName.substring(7);
            }
            iconFileName = iconFileName.replaceAll("\\W", " ").trim().replace(" ", "_").concat(".ico");
            String iconPath = JReader.getConfig().getShortcutIconsDir() + File.separator + iconFileName;
            InputStream inIcon =(InputStream)(Object) (new URL(iconURL).openStream());
            OutputStream outIcon = new FileOutputStream(iconPath);
            byte[] buf = new byte[1024];
            int len;
            while ((len = inIcon.read(buf)) > 0) {
                outIcon.write(buf, 0, len);
            }
            inIcon.close();
            outIcon.close();
            channel.setIconPath(iconPath);
        } catch (Exception e) {
        }
        return (Channel)(Object)channel;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLink(){ return null; }
	public MyHelperClass setIconPath(String o0){ return null; }
	public MyHelperClass getShortcutIconsDir(){ return null; }
	public MyHelperClass getConfig(){ return null; }
	public MyHelperClass getChannelURL(){ return null; }}

class Channel {

}

class LinkNotFoundException extends Exception{
	public LinkNotFoundException(String errorMessage) { super(errorMessage); }
	LinkNotFoundException(){}
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
