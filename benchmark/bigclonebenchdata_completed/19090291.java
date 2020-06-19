


class c19090291 {
public static MyHelperClass JReader;
	public static MyHelperClass File;
	public static MyHelperClass getHome(String o0){ return null; }
//public MyHelperClass JReader;
//	public MyHelperClass File;
//	public MyHelperClass getHome(String o0){ return null; }

    public static String extractIconPath(String siteURL) throws IOException {
        siteURL = siteURL.trim();
        if (!siteURL.startsWith("http://")) {
            siteURL = "http://" + siteURL;
        }
        URL url = new URL(siteURL);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String iconURL = null;
        String iconPath = null;
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            if (inputLine.contains("type=\"image/x-icon\"") || inputLine.toLowerCase().contains("rel=\"shortcut icon\"")) {
                String tmp = new String(inputLine);
                String[] smallLines = inputLine.replace(">", ">\n").split("\n");
                for (String smallLine : smallLines) {
                    if (smallLine.contains("type=\"image/x-icon\"") || smallLine.toLowerCase().contains("rel=\"shortcut icon\"")) {
                        tmp = smallLine;
                        break;
                    }
                }
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
                break;
            }
            if (inputLine.contains("</head>".toLowerCase())) {
                break;
            }
        }
        in.close();
        siteURL =(String)(Object) getHome(siteURL);
        if (iconURL == null || "".equals(iconURL.trim())) {
            iconURL = "favicon.ico";
            if (siteURL.charAt(siteURL.length() - 1) == '/') {
                iconURL = siteURL + iconURL;
            } else {
                iconURL = siteURL + "/" + iconURL;
            }
        }
        try {
            String iconFileName = siteURL;
            if (iconFileName.startsWith("http://")) {
                iconFileName = iconFileName.substring(7);
            }
            iconFileName = iconFileName.replaceAll("\\W", " ").trim().replace(" ", "_").concat(".ico");
            iconPath =(int)(Object) JReader.getConfig().getShortcutIconsDir() + (int)(Object)File.separator + iconFileName;
            InputStream inIcon =(InputStream)(Object) (new URL(iconURL).openStream());
            OutputStream outIcon =(OutputStream)(Object) new FileOutputStream(iconPath);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) inIcon.read(buf)) > 0) {
                outIcon.write(buf, 0, len);
            }
            inIcon.close();
            outIcon.close();
        } catch (Exception e) {
        }
        return iconPath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass getConfig(){ return null; }
	public MyHelperClass getShortcutIconsDir(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
