package interfaceExam;

public class TelevisionTest {

	public static void main(String[] args) {

		Television tv = new Television();
		tv.turnon();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.turnOff();
		System.out.println();
		
		
	}

}


interface RemoteControl{
	
	int MAX_VOLUME = 32;
	int MIN_VOLUME = 0;
	
	void turnon();
	void turnOff();
	void setVolume(int volume);
}

class Television implements RemoteControl{
	private int volume;
	private int channel;
	@Override
	public void turnon() {

		System.out.println("TV 켜기");
	}
	@Override
	public void turnOff() {

		System.out.println("TV 끄기");
	}
	@Override
	public void setVolume(int volume) {

		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	
	public void printChannel() {
		System.out.println("현재 채널 선택은"+channel+"번 입니다");
		
	}
	
	public String toString() {
		return " 현재 TV 볼륨:" + volume;
	}
	
	
	
}