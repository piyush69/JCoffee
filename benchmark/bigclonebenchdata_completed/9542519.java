import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9542519 {
public MyHelperClass[] labels;
	public MyHelperClass[] xposit;
	public MyHelperClass[] yposit;
	public MyHelperClass addMouseListener(CircleInfo o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass getImage(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
public MyHelperClass base;
	public MyHelperClass labels;
	public MyHelperClass xposit;
	public MyHelperClass yunit;
	public MyHelperClass yposit;
	public MyHelperClass umat;
	public MyHelperClass mt;
	public MyHelperClass width;
	public MyHelperClass topol;
	public MyHelperClass xunit;
	public MyHelperClass height;

    public void init()  throws Throwable {
        String updateLoc = NULL; //new String();
        updateLoc = "none";
        MyHelperClass mt = new MyHelperClass();
        mt = new MediaTracker(this);
        MyHelperClass thisThread = new MyHelperClass();
        thisThread = new Thread((Runnable)(Object)this);
        int i = NULL; //new int();
        i = 0;
//        MyHelperClass thisThread = new MyHelperClass();
        thisThread.start();
        try {
            MyHelperClass base = new MyHelperClass();
            base = getDocumentBase();
            MyHelperClass username = new MyHelperClass();
            username = getParameter("username");
        } catch (Exception e) {
        }
        MyHelperClass username = new MyHelperClass();
        String userpng = "images/" + username + ".png";
//        MyHelperClass username = new MyHelperClass();
        String userdat = "data/" + username + "_l.cod";
        URL url = null;
        try {
            MyHelperClass base = new MyHelperClass();
            url = new URL((URL)(Object)base, userdat);
        } catch (MalformedURLException e1) {
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e1) {
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in));
        } catch (Exception r) {
        }
        try {
            String line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");
            int dim = Integer.parseInt(tokenizer.nextToken().trim().toLowerCase());
            this.topol =(MyHelperClass)(Object) tokenizer.nextToken().trim().toLowerCase();
            xunit =(MyHelperClass)(Object) Integer.parseInt(tokenizer.nextToken().trim().toLowerCase());
            yunit =(MyHelperClass)(Object) Integer.parseInt(tokenizer.nextToken().trim().toLowerCase());
//            @SuppressWarnings("unused") String neigh = tokenizer.nextToken().trim().toLowerCase();
            String label = null;
            labels = new String[(int)(Object)xunit][yunit];
            for (int e = 0; e < (int)(Object)yunit; e++) {
                for (int r = 0; r < (int)(Object)xunit; r++) {
                    line = reader.readLine();
                    StringTokenizer tokenizer2 = new StringTokenizer(line, " ");
                    for (int w = 0; w < dim; w++) {
                        if (tokenizer2.countTokens() > 0) tokenizer2.nextToken();
                    }
                    while (tokenizer2.countTokens() > 0) {
                        label = tokenizer2.nextToken() + " ";
                    }
                    if (label == null) {
                        labels[r][e] = "none";
                    } else {
                        labels[r][e] = label;
                    }
                    label = null;
                }
            }
            reader.close();
            if (topol.equals("hexa")) {
                xposit = new int[(int)(Object)xunit][yunit];
                yposit = new int[(int)(Object)xunit][yunit];
                double divisor1 =(double)(Object) xunit;
                double divisor2 =(double)(Object) yunit;
                for (int p = 0; p < (int)(Object)xunit; p++) {
                    for (int q = 0; q < (int)(Object)yunit; q++) {
                        if (q % 2 == 0) {
                            double nenner = (p * (int)(Object)width);
                            xposit[p][q] = (int) Math.round(nenner / divisor1);
                        }
                        if (q % 2 != 0) {
                            double nenner = ((double)(Object)width * 0.5) + (p * width);
                            xposit[p][q] = (int) Math.round(nenner / divisor1);
                        }
                        yposit[p][q] = (int) Math.round((((double)(Object)height * 0.5) + q * height) / divisor2);
                    }
                }
            }
            if (topol.equals("rect")) {
                xposit = new int[(int)(Object)xunit][yunit];
                yposit = new int[(int)(Object)xunit][yunit];
                double divisor1 =(double)(Object) xunit;
                double divisor2 =(double)(Object) yunit;
                for (int p = 0; p < (int)(Object)xunit; p++) {
                    for (int q = 0; q < (int)(Object)yunit; q++) {
                        double nenner = ((double)(Object)width * 0.5) + (p * width);
                        xposit[p][q] = (int) Math.round((nenner / divisor1));
                        yposit[p][q] = (int) Math.round((((double)(Object)height * 0.5) + q * height) / divisor2);
                    }
                }
            }
        } catch (IOException o) {
        }
        umat = getImage(base, userpng);
        mt.addImage(umat, 1);
        try {
            mt.waitForAll();
        } catch (InterruptedException e) {
        }
        addMouseListener(new CircleInfo());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass start(){ return null; }
	public MyHelperClass waitForAll(){ return null; }
	public MyHelperClass addImage(MyHelperClass o0, int o1){ return null; }}

class CircleInfo {

}

class MediaTracker {

}
