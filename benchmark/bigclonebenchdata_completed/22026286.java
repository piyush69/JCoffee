


class c22026286 {
public static MyHelperClass WANT_PROGRESS;
	public static MyHelperClass printProgress(){ return null; }
	public static MyHelperClass printIntro(){ return null; }
//public MyHelperClass WANT_PROGRESS;
//	public MyHelperClass printIntro(){ return null; }
//	public MyHelperClass printProgress(){ return null; }

    public static void main(String args[]) {
        int i, j, l;
        short NUMNUMBERS = 100;
        short numbers[] = new short[NUMNUMBERS];
        printIntro();
        int time = (int) System.currentTimeMillis();
        for (i = 0; i < NUMNUMBERS; i++) {
            numbers[i] = (short) (NUMNUMBERS - 1 - i);
        }
        for (i = 0; i < NUMNUMBERS; i++) {
            for (j = 0; j < NUMNUMBERS - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    short temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            if ((boolean)(Object)WANT_PROGRESS) {
                printProgress();
            }
        }
        time = (int) System.currentTimeMillis() - time;
        System.out.print(time);
        System.out.print("End\n");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
