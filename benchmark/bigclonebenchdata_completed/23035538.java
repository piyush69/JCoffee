


class c23035538 {

    public static void main(String[] args) {
        try {
            String user = "techbeherca";
            String targetUrl = "http://api.fanfou.com/statuses/user_timeline.xml?id=" + user;
            URL url = new URL(targetUrl);
            InputStream in =(InputStream)(Object) url.openStream();
            ArrayList list;
            if (in != null) {
                MessageListDOMParser parser = new MessageListDOMParser();
                list = (ArrayList)(ArrayList)(Object) parser.parseXML(in);
                TransactionDAO dao = new TransactionDAO();
                dao.insert(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class ArrayList {

}

class MessageObj {

}

class MessageListDOMParser {

public MyHelperClass parseXML(InputStream o0){ return null; }}

class TransactionDAO {

public MyHelperClass insert(ArrayList o0){ return null; }}
