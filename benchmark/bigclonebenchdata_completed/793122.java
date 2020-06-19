import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c793122 {
public MyHelperClass percentDone;
	public MyHelperClass amountDone;
	public MyHelperClass[] imageButtons;
	public MyHelperClass errorMessage;
	public MyHelperClass clss;
	public MyHelperClass containsOR;
	public MyHelperClass rePrintAnswer;
	public MyHelperClass[] matrix;
	public MyHelperClass nextTime;
	public MyHelperClass timeEntry;
	public MyHelperClass oldAmountDone;
	public MyHelperClass[] answer;
	public MyHelperClass PRINTINTERVAL;
	public MyHelperClass[] val;
	public MyHelperClass removeOR(String o0){ return null; }
public MyHelperClass saveButton;
	public MyHelperClass lst;
	public MyHelperClass idField;
	public MyHelperClass imageButtons;
	public MyHelperClass loadButton;
	public MyHelperClass drawWarning;
	public MyHelperClass print;
	public MyHelperClass val;
	public MyHelperClass textArea2;
	public MyHelperClass selectTerm;
	public MyHelperClass instructions;
	public MyHelperClass publicSign;
	public MyHelperClass webSite;
	public MyHelperClass button1;
	public MyHelperClass displayNum;
	public MyHelperClass textArea1;
	public MyHelperClass answer;
	public MyHelperClass badInput;
	public MyHelperClass oldPercentDone;
	public MyHelperClass t;
	public MyHelperClass matrix;
	public MyHelperClass courseNum;
	public MyHelperClass term;
	public MyHelperClass net;
	public MyHelperClass showInstructions(){ return null; }
	public MyHelperClass printAnswer(){ return null; }
	public MyHelperClass printSign(String o0){ return null; }
	public MyHelperClass getAppletContext(){ return null; }
	public MyHelperClass epilogue(){ return null; }
	public MyHelperClass absorb(String o0){ return null; }
	public MyHelperClass readURL(String o0){ return null; }
	public MyHelperClass writeURL(String o0, int o1){ return null; }
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }
	public MyHelperClass parseData(String o0, boolean o1){ return null; }

    public void actionPerformed(ActionEvent e)  throws Throwable {
        String line, days;
        String oldType, newType;
        String dept = "";
        boolean buttonPressed = NULL; //new boolean();
        buttonPressed = true;
        char first;
        int caretIndex;
        int tempIndex;
        MyHelperClass displayNum = new MyHelperClass();
        int oldDisplayNum =(int)(Object) displayNum;
        for (int i = 0; i < 10; i++) {
MyHelperClass[] imageButtons = new MyHelperClass[5];
            if (e.getSource() == imageButtons[i]) {
                MyHelperClass rePrintAnswer = new MyHelperClass();
                if ((boolean)(Object)rePrintAnswer) printAnswer();
                MyHelperClass print = new MyHelperClass();
                print.setVisible(true);
                MyHelperClass selectTerm = new MyHelperClass();
                selectTerm.setVisible(true);
//                MyHelperClass displayNum = new MyHelperClass();
                displayNum =(MyHelperClass)(Object) i;
                MyHelperClass textArea2 = new MyHelperClass();
                textArea2.setCaretPosition(textArea2.getText().length() - 1);
//                MyHelperClass textArea2 = new MyHelperClass();
                caretIndex = textArea2.getText().indexOf("#" + (i + 1));
//                MyHelperClass textArea2 = new MyHelperClass();
                if (caretIndex != -1) textArea2.setCaretPosition(caretIndex);
                repaint();
            }
        }
        if (e.getSource() == print) {
            if (textArea2.getText().charAt(0) != '#') printAnswer();
            String data = textArea2.getText();
            int start = data.indexOf("#" + ((int)(Object)displayNum + 1));
            start = data.indexOf("\n", start);
            start++;
            int end = data.indexOf("\n---------", start);
            data = data.substring(start, end);
            String tr = "";
            if (term.getSelectedItem() == "Spring") tr = "SP"; else if (term.getSelectedItem() == "Summer") tr = "SU"; else tr = "FL";
            String s = getCodeBase().toString() + "schedule.cgi?term=" + tr + "&data=" + URLEncoder.encode(data);
            try {
                AppletContext a =(AppletContext)(Object) getAppletContext();
                URL u = new URL(s);
                a.showDocument(u, "_blank");
            } catch (MalformedURLException rea) {
            }
        }
        if (e.getSource() == webSite) {
            String tr;
            if (term.getSelectedItem() == "Spring") tr = "SP"; else if (term.getSelectedItem() == "Summer") tr = "SU"; else tr = "FL";
            String num = courseNum.getText().toUpperCase();
            String s = "http://sis450.berkeley.edu:4200/OSOC/osoc?p_term=" + tr + "&p_deptname=" + URLEncoder.encode(lst.getSelectedItem().toString()) + "&p_course=" + num;
            try {
                AppletContext a =(AppletContext)(Object) getAppletContext();
                URL u = new URL(s);
                a.showDocument(u, "_blank");
            } catch (MalformedURLException rea) {
            }
        }
        if (e.getSource() == loadButton) {
            printSign("Loading...");
            String fileName = idField.getText();
            fileName = fileName.replace(' ', '_');
            String text =(String)(Object) readURL(fileName);
            if (!publicSign.equals("Error loading.")) {
                textArea1.setText(text);
                fileName += ".2";
                text =(String)(Object) readURL(fileName);
                absorb(text);
                printAnswer();
                for (int i = 0; i < 10; i++) {
                    if (answer[i].gap != -1 && answer[i].gap != 9999 && answer[i].gap != 10000) {
                        imageButtons[i].setVisible(true);
                    } else imageButtons[i].setVisible(false);
                }
                if (!imageButtons[0].isVisible()) {
                    print.setVisible(false);
                    selectTerm.setVisible(false);
                } else {
                    print.setVisible(true);
                    selectTerm.setVisible(true);
                }
                printSign("Load complete.");
            }
            displayNum =(MyHelperClass)(Object) 0;
            repaint();
        }
        if (e.getSource() == saveButton) {
            String fileName = idField.getText();
            fileName = fileName.replace(' ', '_');
            printSign("Saving...");
            writeURL(fileName, 1);
            printSign("Saving......");
            fileName += ".2";
            writeURL(fileName, 2);
            printSign("Save complete.");
        }
        if (e.getSource() == instructions) {
            showInstructions();
        }
        if (e.getSource() == net) {
            drawWarning =(MyHelperClass)(Object) false;
            String inputLine = "";
            String text = "";
            String out;
            String urlIn = "";
            textArea2.setText("Retrieving Data...");
            try {
                String tr;
                if (term.getSelectedItem() == "Spring") tr = "SP"; else if (term.getSelectedItem() == "Summer") tr = "SU"; else tr = "FL";
                String num = courseNum.getText().toUpperCase();
                dept = lst.getSelectedItem().toString();
                {
                    urlIn = "http://sis450.berkeley.edu:4200/OSOC/osoc?p_term=" + tr + "&p_deptname=" + URLEncoder.encode(dept) + "&p_course=" + num;
                    try {
                        URL url = new URL(getCodeBase().toString() + "getURL.cgi");
                        URLConnection con = url.openConnection();
                        con.setDoOutput(true);
                        con.setDoInput(true);
                        con.setUseCaches(false);
                        con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
                        DataOutputStream out2 = new DataOutputStream(con.getOutputStream());
                        String content = "url=" + URLEncoder.encode(urlIn);
                        out2.writeBytes(content);
                        out2.flush();
                        DataInputStream in = new DataInputStream(con.getInputStream());
                        String s;
                        while ((s = in.readLine()) != null) {
                        }
                        in.close();
                    } catch (IOException err) {
                    }
                }
                URL yahoo = new URL((URL)(Object)this.getCodeBase(), "classData.txt");
                URLConnection yc = yahoo.openConnection();
                StringBuffer buf = new StringBuffer("");
                DataInputStream in = new DataInputStream(new BufferedInputStream(yc.getInputStream()));
                while ((inputLine = in.readLine()) != null) {
                    buf.append(inputLine);
                }
                text = buf.toString();
                in.close();
            } catch (IOException errr) {
            }
            String inText = ((String)(Object)parseData(text, false));
            if (inText.equals("-1")) inText =(String)(Object) parseData(text, true);
            if (inText.equals("\n")) {
                textArea2.append("\nNO DATA FOUND \n(" + urlIn + ")");
            } else textArea1.append(inText);
            repaint();
        }
        badInput =(MyHelperClass)(Object) false;
        if (e.getSource() == button1) {
            if (t != null && t.isAlive()) {
                t.stop();
                epilogue();
                return;
            }
            displayNum =(MyHelperClass)(Object) 0;
            textArea2.setCaretPosition(0);
            for (int i = 0; i < 30; i++) for (int j = 0; j < 20; j++) {
                matrix[i][j] = new entry();
                matrix[i][j].time = new Time[4];
                for (int k = 0; k < 4; k++) {
                    matrix[i][j].time[k] = new Time();
                    matrix[i][j].time[k].from = 0;
                }
            }
            val =(MyHelperClass)(Object) new entry[30];
            for (int i = 0; i < 30; i++) {
                val[i] = new entry();
                val[i].time = new Time[4];
                for (int j = 0; j < 4; j++) {
                    val[i].time[j] = new Time();
                    val[i].time[j].from = 0;
                }
            }
            oldPercentDone =(MyHelperClass)(Object) -5;
            oldAmountDone = -1 * PRINTINTERVAL;
            percentDone = 0;
            amountDone = 0;
            drawWarning =(MyHelperClass)(Object) false;
            errorMessage = "";
            String text1 = textArea1.getText();
            if (text1.toUpperCase().indexOf("OR:") == -1) containsOR = false; else containsOR = true;
            text1 = removeOR(text1.toUpperCase());
            StringTokenizer st = new StringTokenizer(text1, "\n");
            clss = -1;
            timeEntry = -1;
            boolean noTimesListed = false;
            while (st.hasMoreTokens()) {
                line = st.nextToken().toString();
                if (line.equals("")) break; else first = line.charAt(0);
                if (first == '0') {
                    badInput =(MyHelperClass)(Object) true;
                    repaint();
                    break;
                }
                if (first >= '1' && first <= '9') {
                    noTimesListed = false;
                    timeEntry++;
                    if (timeEntry == 30) {
                        rePrintAnswer = true;
                        textArea2.setText("Error: Exceeded 30 time entries per class.");
                        badInput =(MyHelperClass)(Object) true;
                        repaint();
                        return;
                    }
                    nextTime = -1;
                    StringTokenizer andST = new StringTokenizer(line, ",");
                    while (andST.hasMoreTokens()) {
                        String temp;
                        String entry;
                        int index, fromTime, toTime;
                        nextTime++;
                        if (nextTime == 4) {
                            rePrintAnswer = true;
                            textArea2.setText("Error: Exceeded 4 time intervals per entry!");
                            badInput =(MyHelperClass)(Object) true;
                            repaint();
                            return;
                        }
                        StringTokenizer timeST = new StringTokenizer(andST.nextToken());
                        temp = timeST.nextToken().toString();
                        entry = "";
                        index = 0;
                        if (temp.equals("")) break;
                        while (temp.charAt(index) != '-') {
                            entry += temp.charAt(index);
                            index++;
                            if (index >= temp.length()) {
                                rePrintAnswer = true;
                                textArea2.setText("Error: There should be no space before hyphens.");
                                badInput = true;
                                repaint();
                                return;
                            }
                        }
                        try {
                            fromTime = Integer.parseInt(entry);
                        } catch (NumberFormatException re) {
                            rePrintAnswer = true;
                            textArea2.setText("Error: There should be no a/p sign after FROM_TIME.");
                            badInput = true;
                            repaint();
                            return;
                        }
                        index++;
                        entry = "";
                        if (index >= temp.length()) {
                            badInput = true;
                            repaint();
                            rePrintAnswer = true;
                            textArea2.setText("Error: am/pm sign missing??");
                            return;
                        }
                        while (temp.charAt(index) >= '0' && temp.charAt(index) <= '9') {
                            entry += temp.charAt(index);
                            index++;
                            if (index >= temp.length()) {
                                badInput = true;
                                repaint();
                                rePrintAnswer = true;
                                textArea2.setText("Error: am/pm sign missing??");
                                return;
                            }
                        }
                        toTime = Integer.parseInt(entry);
                        if (temp.charAt(index) == 'a' || temp.charAt(index) == 'A') {
                        } else {
                            if (isLesse(fromTime, toTime) && !timeEq(toTime, 1200)) {
                                if (String.valueOf(fromTime).length() == 4 || String.valueOf(fromTime).length() == 3) {
                                    fromTime += 1200;
                                } else fromTime += 12;
                            }
                            if (!timeEq(toTime, 1200)) {
                                if (String.valueOf(toTime).length() == 4 || String.valueOf(toTime).length() == 3) {
                                    toTime += 1200;
                                } else toTime += 12;
                            }
                        }
                        if (String.valueOf(fromTime).length() == 2 || String.valueOf(fromTime).length() == 1) fromTime *= 100;
                        if (String.valueOf(toTime).length() == 2 || String.valueOf(toTime).length() == 1) toTime *= 100;
                        matrix[timeEntry][clss].time[nextTime].from = fromTime;
                        matrix[timeEntry][clss].time[nextTime].to = toTime;
                        if (timeST.hasMoreTokens()) days = timeST.nextToken().toString(); else {
                            rePrintAnswer = true;
                            textArea2.setText("Error: days not specified?");
                            badInput = true;
                            repaint();
                            return;
                        }
                        if (days.equals("")) return;
                        if (days.indexOf("M") != -1 || days.indexOf("m") != -1) matrix[timeEntry][clss].time[nextTime].m = 1;
                        if (days.indexOf("TU") != -1 || days.indexOf("Tu") != -1 || days.indexOf("tu") != -1) matrix[timeEntry][clss].time[nextTime].tu = 1;
                        if (days.indexOf("W") != -1 || days.indexOf("w") != -1) matrix[timeEntry][clss].time[nextTime].w = 1;
                        if (days.indexOf("TH") != -1 || days.indexOf("Th") != -1 || days.indexOf("th") != -1) matrix[timeEntry][clss].time[nextTime].th = 1;
                        if (days.indexOf("F") != -1 || days.indexOf("f") != -1) matrix[timeEntry][clss].time[nextTime].f = 1;
                    }
                } else {
                    if (noTimesListed) clss--;
                    clss++;
                    if (clss == 20) {
                        rePrintAnswer = true;
                        textArea2.setText("Error: No more than 20 class entries!");
                        badInput = true;
                        repaint();
                        return;
                    }
                    timeEntry = -1;
                    line = line.trim();
                    for (int i = 0; i < 30; i++) matrix[i][clss].name = line;
                    noTimesListed = true;
                }
            }
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 4; j++) {
                    val[i].time[j].from = 0;
                }
            }
            for (int i = 0; i < 10; i++) {
                beat10[i] = 10000;
                answer[i].gap = 10000;
                for (int j = 0; j < 30; j++) answer[i].classes[j].name = "";
            }
            time = 0;
            calcTotal = 0;
            int k = 0;
            calculateTotalPercent(0, "\n");
            amountToReach = calcTotal;
            button1.setLabel("...HALT GENERATION...");
            printWarn();
            if (t != null && t.isAlive()) t.stop();
            t = new Thread(this, "Generator");
            t.start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass setCaretPosition(int o0){ return null; }
	public MyHelperClass stop(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass isAlive(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass append(String o0){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class entry {

}

class Time {

}
