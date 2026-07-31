package chapter07;

public class DmbCellPhone extends CellPhone {
	//						ㄴ 'Cellphone'클래스를 그대로 가져와서 넣어줌 보이진않지만 들어와있음
	int channel;

	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	
	@Override				//덮어쓰기
	void powerOn() {
		System.out.println("DMB폰이 켜졌습니다.");
		
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
