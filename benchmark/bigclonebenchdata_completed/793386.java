


class c793386 {

    public void bubbleSort(int[] arr) {
        MyHelperClass BasicProcessor = new MyHelperClass();
        BasicProcessor.getInstance().getStartBlock();
//        MyHelperClass BasicProcessor = new MyHelperClass();
        BasicProcessor.getInstance().getVarDeclaration();
        boolean swapped = true;
//        MyHelperClass BasicProcessor = new MyHelperClass();
        BasicProcessor.getInstance().getVarDeclaration();
        int j = 0;
//        MyHelperClass BasicProcessor = new MyHelperClass();
        BasicProcessor.getInstance().getVarDeclaration();
        int tmp;
        {
//            MyHelperClass BasicProcessor = new MyHelperClass();
            BasicProcessor.getInstance().getWhileStatement();
            while (swapped) {
//                MyHelperClass BasicProcessor = new MyHelperClass();
                BasicProcessor.getInstance().getStartBlock();
                swapped = false;
                j++;
                {
//                    MyHelperClass BasicProcessor = new MyHelperClass();
                    BasicProcessor.getInstance().getForStatement();
                    for (int i = 0; i < arr.length - j; i++) {
//                        MyHelperClass BasicProcessor = new MyHelperClass();
                        BasicProcessor.getInstance().getStartBlock();
                        {
//                            MyHelperClass BasicProcessor = new MyHelperClass();
                            BasicProcessor.getInstance().getIfStatement();
                            if (arr[i] > arr[i + 1]) {
//                                MyHelperClass BasicProcessor = new MyHelperClass();
                                BasicProcessor.getInstance().getStartBlock();
                                tmp = arr[i];
                                arr[i] = arr[i + 1];
                                arr[i + 1] = tmp;
                                swapped = true;
//                                MyHelperClass BasicProcessor = new MyHelperClass();
                                BasicProcessor.getInstance().getEndBlock();
                            }
                        }
//                        MyHelperClass BasicProcessor = new MyHelperClass();
                        BasicProcessor.getInstance().getEndBlock();
                    }
                }
//                MyHelperClass BasicProcessor = new MyHelperClass();
                BasicProcessor.getInstance().getEndBlock();
            }
        }
//        MyHelperClass BasicProcessor = new MyHelperClass();
        BasicProcessor.getInstance().getEndBlock();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getForStatement(){ return null; }
	public MyHelperClass getIfStatement(){ return null; }
	public MyHelperClass getWhileStatement(){ return null; }
	public MyHelperClass getStartBlock(){ return null; }
	public MyHelperClass getVarDeclaration(){ return null; }
	public MyHelperClass getEndBlock(){ return null; }
	public MyHelperClass getInstance(){ return null; }}
