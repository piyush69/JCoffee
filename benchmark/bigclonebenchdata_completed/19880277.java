


class c19880277 {
public MyHelperClass URLEncoder;
	public MyHelperClass Bukkit;
	public MyHelperClass hash;

    private void postUrl() throws Exception {
        String authors = "";
        MyHelperClass plugin = new MyHelperClass();
        for (String auth :(String[])(Object) (Object[])(Object)plugin.getDescription().getAuthors()) {
            authors = authors + " " + auth;
        }
        authors = authors.trim();
//        MyHelperClass plugin = new MyHelperClass();
        String url = String.format("http://bukkitstats.randomappdev.com/ping.aspx?snam=%s&sprt=%s&shsh=%s&sver=%s&spcnt=%s&pnam=%s&pmcla=%s&paut=%s&pweb=%s&pver=%s", URLEncoder.encode((String)(Object)plugin.getServer().getName(), "UTF-8"), plugin.getServer().getPort(), hash, URLEncoder.encode((String)(Object)Bukkit.getVersion(), "UTF-8"), plugin.getServer().getOnlinePlayers().length, URLEncoder.encode((String)(Object)plugin.getDescription().getName(), "UTF-8"), URLEncoder.encode((String)(Object)plugin.getDescription().getMain(), "UTF-8"), URLEncoder.encode(authors, "UTF-8"), URLEncoder.encode((String)(Object)plugin.getDescription().getWebsite(), "UTF-8"), URLEncoder.encode((String)(Object)plugin.getDescription().getVersion(), "UTF-8"));
        new URL(url).openConnection().getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
public MyHelperClass getAuthors(){ return null; }
	public MyHelperClass getOnlinePlayers(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getMain(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getServer(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
