


class c10479536 {

    private void bubbleSort(int values[]) {
        MyHelperClass PerfMonTimer = new MyHelperClass();
        PerfMonTimer timerOuter =(PerfMonTimer)(Object) PerfMonTimer.start("SortingTest.bubbleSort");
        try {
            int len = values.length - 1;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len - i; j++) {
                    if (values[j] > values[j + 1]) {
                        int tmp = values[j];
                        values[j] = values[j + 1];
                        values[j + 1] = tmp;
                    }
                }
            }
        } finally {
//            MyHelperClass PerfMonTimer = new MyHelperClass();
            PerfMonTimer.stop(timerOuter);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass start(String o0){ return null; }
	public MyHelperClass stop(PerfMonTimer o0){ return null; }}

class PerfMonTimer {

}
