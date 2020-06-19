


class c9066291 {

    void sortIds(int a[]) {
        ExecutionTimer t = new ExecutionTimer();
        t.start();
        for (int i = a.length; --i >= 0; ) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int T = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = T;
                }
            }
        }
        t.end();
        TimerRecordFile timerFile = new TimerRecordFile("sort", "BufferSorting", "sortIds", t.duration());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ExecutionTimer {

public MyHelperClass duration(){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass start(){ return null; }}

class TimerRecordFile {

TimerRecordFile(){}
	TimerRecordFile(String o0, String o1, String o2, MyHelperClass o3){}}
