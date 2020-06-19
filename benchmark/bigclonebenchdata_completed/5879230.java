import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5879230 {
public MyHelperClass id;
	public MyHelperClass activity;
public MyHelperClass Constants;
	public MyHelperClass loadingFlag;
	public MyHelperClass View;
	public MyHelperClass EntityUtils;
	public MyHelperClass HttpStatus;
	public MyHelperClass internetScoreGroupModel;

    public void loadFromInternet(boolean reload)  throws Throwable {
        if (!reload && this.internetScoreGroupModel != null) {
            return;
        }
        loadingFlag =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) true;
        ProgressBar settingProgressBar = (ProgressBar)(ProgressBar)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) this.activity.findViewById(id.settingProgressBar);
        settingProgressBar.setVisibility(View.VISIBLE);
        final Timer timer = new Timer();
        final Handler handler = new Handler() {

//            @Override
            public void handleMessage(Message msg) {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)loadingFlag == false) {
                    ProgressBar settingProgressBar = (ProgressBar) BestScoreExpandableListAdapter.this.activity.findViewById(id.settingProgressBar);
                    settingProgressBar.setVisibility(View.INVISIBLE);
                    timer.cancel();
                }
                this.handleMessage(msg);
            }
        };
        final TimerTask task = new TimerTask() {

//            @Override
            public void run() {
                Message message = new Message();
                handler.sendMessage(message);
            }
        };
        timer.schedule(task, 1, 50);
        String httpUrl = Constants.SERVER_URL + "/rollingcard.php?op=viewbestscore";
        HttpGet request = new HttpGet(httpUrl);
        HttpClient httpClient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
        try {
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String entity = EntityUtils.toString(response.getEntity());
                String[] itemArray = entity.split(";");
                this.internetScoreGroupModel =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new ScoreGroupModel();
                for (int i = 0; i < itemArray.length; i++) {
                    String[] itemValueArray = itemArray[i].split("\\|");
                    if (itemValueArray.length != 3) {
                        continue;
                    }
                    ScoreItemModel itemModel = new ScoreItemModel(itemValueArray[0], itemValueArray[1], itemValueArray[2]);
                    this.internetScoreGroupModel.addItem(itemModel);
                }
            }
        } catch (ClientProtocolException e) {
            this.internetScoreGroupModel = null;
            e.printStackTrace();
        } catch (IOException e) {
            this.internetScoreGroupModel = null;
            e.printStackTrace();
        }
        loadingFlag =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INVISIBLE;
	public MyHelperClass SERVER_URL;
	public MyHelperClass SC_OK;
	public MyHelperClass VISIBLE;
	public MyHelperClass settingProgressBar;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass findViewById(MyHelperClass o0){ return null; }
	public MyHelperClass addItem(ScoreItemModel o0){ return null; }}

class ProgressBar {

public MyHelperClass setVisibility(MyHelperClass o0){ return null; }}

class Handler {

public MyHelperClass sendMessage(Message o0){ return null; }}

class Message {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class ScoreItemModel {

ScoreItemModel(){}
	ScoreItemModel(String o0, String o1, String o2){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class ScoreGroupModel {

}

class BestScoreExpandableListAdapter {

}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
