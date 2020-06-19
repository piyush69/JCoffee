


class c21016435 {

    private String getFullScreenUrl() {
        MyHelperClass progressDown = new MyHelperClass();
        progressDown.setIndeterminate(true);
        MyHelperClass ytUrl = new MyHelperClass();
        System.out.println("Har: " + ytUrl);
//        MyHelperClass ytUrl = new MyHelperClass();
        String u =(String)(Object) ytUrl;
        URLConnection conn = null;
        String line = null;
        String data = "";
        String fullUrl = "";
        try {
            URL url = new URL(u);
            conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) {
                if (line.contains("fullscreenUrl")) {
                    data = line.trim();
                }
            }
            rd.close();
            System.out.println(data);
            int start = 0;
            String[] lines = data.split("&");
            String[] tmp = null;
            String video_id = null;
            String t = null;
            String title = null;
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].startsWith("video_id=")) {
                    tmp = lines[i].split("=");
                    video_id = tmp[1];
                }
                if (lines[i].startsWith("t=")) {
                    tmp = lines[i].split("=");
                    t = tmp[1];
                }
                if (lines[i].startsWith("title=")) {
                    tmp = lines[i].split("=");
                    title = tmp[1].substring(0, (tmp[1].length() - 2));
                }
                System.out.println(lines[i]);
            }
            System.out.println("So we got...");
            System.out.println("video_id: " + video_id);
            System.out.println("t: " + t);
            System.out.println("title: " + title);
            String ytTitle;// = new String();
            ytTitle = title;
            fullUrl = "http://www.youtube.com/get_video.php?video_id=" + video_id + "&t=" + t;
        } catch (Exception e) {
            System.err.println("Error: " + e.getLocalizedMessage());
        }
//        MyHelperClass progressDown = new MyHelperClass();
        progressDown.setIndeterminate(false);
        return fullUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setIndeterminate(boolean o0){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
