import java.io.*;
import java.lang.*;
import java.util.*;



class c477320 {
public MyHelperClass[] friendsListOnlineStatus;
//public MyHelperClass friendsListOnlineStatus;

    private final void reOrderFriendsListByOnlineStatus() {
        boolean flag = true;
        while (flag) {
            flag = false;
            MyHelperClass friendsCount = new MyHelperClass();
            for (int i = 0; i <(int)(Object) friendsCount - 1; i++) if ((int)(Object)friendsListOnlineStatus[i] < (int)(Object)friendsListOnlineStatus[i + 1]) {
MyHelperClass[] friendsListOnlineStatus = new MyHelperClass[5];
                int j =(int)(Object) friendsListOnlineStatus[i];
//                MyHelperClass friendsListOnlineStatus = new MyHelperClass();
                friendsListOnlineStatus[i] = friendsListOnlineStatus[i + 1];
//                MyHelperClass friendsListOnlineStatus = new MyHelperClass();
                friendsListOnlineStatus[i + 1] =(MyHelperClass)(Object) j;
MyHelperClass[] friendsListLongs = new MyHelperClass[5];
                long l =(long)(Object) friendsListLongs[i];
//                MyHelperClass friendsListLongs = new MyHelperClass();
                friendsListLongs[i] = friendsListLongs[i + 1];
//                MyHelperClass friendsListLongs = new MyHelperClass();
                friendsListLongs[i + 1] =(MyHelperClass)(Object) l;
                flag = true;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] friendsListOnlineStatus;
	public MyHelperClass[] friendsListLongs;
}
