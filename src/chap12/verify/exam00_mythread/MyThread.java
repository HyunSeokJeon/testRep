package chap12.verify.exam00_mythread;

// Thread Ŭ������ ���
public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.print("T");
		}
	}

}