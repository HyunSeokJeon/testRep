package chap12.sec02.exam02_threadname;

public class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		System.out.println(getName() + "ȣ��");
		System.out.println(getName() + "ȣ��");
	}
	
	
}
