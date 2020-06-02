
public class MeinThread extends Thread {
	Speicherzelle sz;
	public MeinThread(Speicherzelle pSz, String threadName) {
		super(threadName);
		sz = pSz;
	}
	
	@Override
	public void run() {
		sz.swapWert(sz);
	}

}
