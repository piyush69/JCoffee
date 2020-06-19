


class c19651243 {
public static MyHelperClass HTMLWebHelper;
//public MyHelperClass HTMLWebHelper;

    private static void testTidy() {
        try {
            String url = "http://groups.google.com/group/dengues/files";
            java.io.InputStream is = new java.net.URL(url).openStream();
            org.w3c.dom.Document doc =(org.w3c.dom.Document)(Object)(Document)(Object) HTMLWebHelper.parseDOM((InputStream)(Object)is);
            org.w3c.dom.NodeList list = doc.getElementsByTagName("td");
            org.w3c.dom.Element stockTypeElement = null;
            for (int i = 0; i < list.getLength(); i++) {
                org.w3c.dom.Node item = list.item(i);
                String content =(String)(Object) HTMLWebHelper.getContent((Node)(Object)item);
                String convert =(String)(Object) HTMLWebHelper.convert(content);
                if (convert.equals("zDevil")) {
                    stockTypeElement = (org.w3c.dom.Element) item.getParentNode().getParentNode();
                    break;
                }
            }
            if (stockTypeElement != null) {
                org.w3c.dom.NodeList trList = stockTypeElement.getElementsByTagName("tr");
                for (int i = 0; i < trList.getLength(); i++) {
                    org.w3c.dom.NodeList trListChildren = trList.item(i).getChildNodes();
                    if (trListChildren.getLength() > 2) {
                        org.w3c.dom.Node node_0 = trListChildren.item(0);
                        org.w3c.dom.Node node_1 = trListChildren.item(1);
                        String content =(String)(Object) HTMLWebHelper.getContent((Node)(Object)node_0);
                        String convert_0 =(String)(Object) HTMLWebHelper.convert(content);
                        content =(String)(Object) HTMLWebHelper.getContent((Node)(Object)node_1);
                        String convert_1 =(String)(Object) HTMLWebHelper.convert(content);
                        if (!"".equals(convert_0)) {
                            System.out.println(convert_0 + " => " + convert_1);
                        }
                    }
                }
            }
            is.close();
        } catch (java.net.MalformedURLException ex) {
            ex.printStackTrace();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(Node o0){ return null; }
	public MyHelperClass convert(String o0){ return null; }
	public MyHelperClass parseDOM(InputStream o0){ return null; }}

class Node {

}

class InputStream {

}

class Document {

}
