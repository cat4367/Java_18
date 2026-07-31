package chapter13;

public class Student {
	
	private String info;
	private String name;
	private String sc1;
	private String sc2;
	private String sc3;
	private String tel;
	private String gender;
	private String kjum;
	private String mjum;
	private String ejum;
	private String sojum;
	private String scjum;
	private double avg;
	
	
	public String getInfo() {
		info = String.valueOf(sc1)+String.valueOf(sc2)+String.valueOf(sc3);
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSc1() {
		
		return Integer.parseInt(this.sc1);
	}
	public void setSc1(String sc1) {
		if (sc1.indexOf("학") != -1) {
			sc1 = sc1.replace("학", "");
		}
		if (sc1.indexOf("년") != -1) {
			sc1 = sc1.replace("년", "");
		}
		sc1.trim();
		this.sc1 = sc1;
	}
	public int getSc2() {	
		return Integer.parseInt(this.sc2);
	}
	public void setSc2(String sc2) {
		if (sc2.indexOf("반") != -1) {
			sc2 = sc2.replace("반", "");
		}
		sc2.trim();
		if (sc2.length()  == 1) {
			sc2 = "0" + sc2;
		}
		this.sc2 = sc2;
	}
	public int getSc3() {
		return Integer.parseInt(this.sc3);
	}
	public void setSc3(String sc3) {
		if (sc3.indexOf("번") != -1) {
			sc3 = sc3.replace("번", "");
		}
		if (sc3.indexOf("호") != -1) {
			sc3 = sc3.replace("호", "");
		}
		sc3.trim();
		if (sc3.length()  == 1) {
			sc3 = "0" + sc3;
		}
		this.sc3 = sc3;
	}
	public String getTel() {
		return tel.substring(0, 3) + "-" + tel.substring(3, 7) + "-" + tel.substring(7, 11);
	}
	public void setTel(String tel) {
		tel =tel.replace("-","");
		tel =tel.replace(" ","");
		tel =tel.replace("/","");
		tel.trim();
		if(tel.length() == 8) {
			tel = "010" + tel;
		}
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.indexOf("남") == -1 && gender.indexOf("여") == -1) {
			System.out.println("잘못된 입력입니다.");
			
		}
		
		if (gender.indexOf("자") != -1) {

			gender = gender.replace("자", "");
		}
		this.gender = gender;
	}
	public int getKjum() {
		return Integer.parseInt(kjum);
	}
	public void setKjum(String kjum) {
		if(kjum.indexOf("점") != -1) {
			kjum = kjum.replace("점", "");
			kjum.trim();
		}
		this.kjum = kjum;
	}
	public int getMjum() {
		return Integer.parseInt(mjum);
	}
	public void setMjum(String mjum) {
		if(mjum.indexOf("점") != -1) {
			mjum = mjum.replace("점", "");
			mjum.trim();
		}
		this.mjum = mjum;
	}
	public int getEjum() {
		return Integer.parseInt(ejum);
	}
	public void setEjum(String ejum) {
		if(ejum.indexOf("점") != -1) {
			ejum = ejum.replace("점", "");
			ejum.trim();
		}
		this.ejum = ejum;
	}
	public int getSojum() {
		return Integer.parseInt(sojum);
	}
	public void setSojum(String sojum) {
		if(sojum.indexOf("점") != -1) {
			sojum = sojum.replace("점", "");
			sojum.trim();
		}
		this.sojum = sojum;
	}
	public int getScjum() {
		return Integer.parseInt(scjum);
	}
	public void setScjum(String scjum) {
		if(scjum.indexOf("점") != -1) {
			scjum = scjum.replace("점", "");
			scjum.trim();
		}
		this.scjum = scjum;
	}
	public double getAvg() {
		avg = (getKjum() + getEjum() + getMjum() + getSojum() + getScjum()) / 5;
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
	

}
