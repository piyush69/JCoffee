import java.io.*;
import java.lang.*;
import java.util.*;



class c12065181 {
public MyHelperClass NULL;

    private void sortMasters() {
        int masterCounter =(int)(Object) NULL; //new int();
        masterCounter = 0;
        MyHelperClass maxID = new MyHelperClass();
        for (int i = 0; i < (int)(Object)maxID; i++) {
MyHelperClass[] users = new MyHelperClass[5];
            if ((int)(Object)users[i].getMasterPoints() > 0) {
MyHelperClass[] masterHandleList = new MyHelperClass[5];
                masterHandleList[(int)(Object)masterCounter] = users[i].getHandle();
MyHelperClass[] masterPointsList = new MyHelperClass[5];
                masterPointsList[(int)(Object)masterCounter] = users[i].getMasterPoints();
//                MyHelperClass masterCounter = new MyHelperClass();
                masterCounter =(int)(Object) masterCounter + 1;
            }
        }
//        MyHelperClass masterCounter = new MyHelperClass();
        for (int i =(int)(Object) masterCounter; --i >= 0; ) {
            for (int j = 0; j < i; j++) {
MyHelperClass[] masterPointsList = new MyHelperClass[5];
                if ((int)(Object)masterPointsList[j] > (int)(Object)masterPointsList[j + 1]) {
//                    MyHelperClass masterPointsList = new MyHelperClass();
                    int tempp =(int)(Object) masterPointsList[j];
MyHelperClass[] masterHandleList = new MyHelperClass[5];
                    String temppstring =(String)(Object) masterHandleList[j];
//                    MyHelperClass masterPointsList = new MyHelperClass();
                    masterPointsList[j] = masterPointsList[j + 1];
//                    MyHelperClass masterHandleList = new MyHelperClass();
                    masterHandleList[j] = masterHandleList[j + 1];
//                    MyHelperClass masterPointsList = new MyHelperClass();
                    masterPointsList[j + 1] =(MyHelperClass)(Object) tempp;
//                    MyHelperClass masterHandleList = new MyHelperClass();
                    masterHandleList[j + 1] =(MyHelperClass)(Object) temppstring;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] masterHandleList;
	public MyHelperClass[] masterPointsList;
	public MyHelperClass[] users;
public MyHelperClass getHandle(){ return null; }
	public MyHelperClass getMasterPoints(){ return null; }}
