package chap12.sec04.exam02_synchronized;

// key를 이용해서 Thread간에 충돌이 일어나지 않도록 실행순서를 맞느는 것을 
// Thread의 동기화(Synchronization)라고 한다.
public class Toilet { // 화장실을 사용하는 과정을 보여주는 클래스
	
	// 메소드의 동기화 방법
	// synchronized로 선언된 opendDoor() 메소드는 한번 실행이 끝나야 다음 실행이 가능함.
	// 다른 Thread들은 한개의 Thread가 이 메소드의 실행을 끝낼때 까지 대기함.
	public synchronized void openDoor(String name, boolean b) {
		if (b == false) {
			System.out.println(name);
			usingTime();
			System.out.println("화장실 사용 종료!");
		}else {
			System.out.println("화장실 사용중!");
		}
	} // openDoor() end
	
	public void usingTime() { // 화장실 사용하는 시간
		for (int i = 0; i < 100000000; i++) {
			if(i == 10000) {
				System.out.println("해결");
			}
		}
	} //usingTime() end
	
}
