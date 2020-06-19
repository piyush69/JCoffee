


class c6972162 {

    public void removeDownload() {
        MyHelperClass mDownloadMgr = new MyHelperClass();
        synchronized (mDownloadMgr) {
            MyHelperClass mDownloadTable = new MyHelperClass();
            int rowCount =(int)(Object) mDownloadTable.getSelectedRowCount();
            if (rowCount <= 0) return;
//            MyHelperClass mDownloadTable = new MyHelperClass();
            int[] rows =(int[])(Object) mDownloadTable.getSelectedRows();
            int[] orderedRows = new int[rows.length];
            Vector downloadFilesToRemove = new Vector();
            for (int i = 0; i < rowCount; i++) {
                int row = rows[i];
//                MyHelperClass mDownloadMgr = new MyHelperClass();
                if (row >= (int)(Object)mDownloadMgr.getDownloadCount()) return;
                MyHelperClass mDownloadSorter = new MyHelperClass();
                orderedRows[i] =(int)(Object) mDownloadSorter.indexes[row];
            }
//            MyHelperClass mDownloadTable = new MyHelperClass();
            mDownloadTable.removeRowSelectionInterval(0,(int)(Object) mDownloadTable.getRowCount() - 1);
            for (int i = orderedRows.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (orderedRows[j] > orderedRows[j + 1]) {
                        int tmp = orderedRows[j];
                        orderedRows[j] = orderedRows[j + 1];
                        orderedRows[j + 1] = tmp;
                    }
                }
            }
            for (int i = orderedRows.length - 1; i >= 0; i--) {
//                MyHelperClass mDownloadMgr = new MyHelperClass();
                mDownloadMgr.removeDownload(orderedRows[i]);
            }
            MyHelperClass mainFrame = new MyHelperClass();
            mainFrame.refreshAllActions();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] indexes;
public MyHelperClass refreshAllActions(){ return null; }
	public MyHelperClass getRowCount(){ return null; }
	public MyHelperClass getSelectedRowCount(){ return null; }
	public MyHelperClass getSelectedRows(){ return null; }
	public MyHelperClass getDownloadCount(){ return null; }
	public MyHelperClass removeRowSelectionInterval(int o0, int o1){ return null; }
	public MyHelperClass removeDownload(int o0){ return null; }}

class Vector {

}
