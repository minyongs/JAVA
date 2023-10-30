package simplephoneinfo;

public class PhoneInfo {

	public static void main(String[] args) {
		Info i = new Info("임미경","010-2345-6789","1965.03.28");
		Info i2 = new Info("김현수","010-1111-1111");
			
		 i.showPhoneinfo();
		 i2.showPhoneinfo();
		}

	}

	class Info{
	private String name;
	private String phoneNumber;
	private String birthday;


	public Info(String name,String phoneNumber) {//생일 저장 안할 경우의 생성자
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public  Info(String name, String phoneNumber,String birthday) {//생일까지 저장 할 경우의 생성자 ->overloading을 통하여 객체를 생성할 때 원하는 정보만 전달 가능
		this.name = name;
		this.phoneNumber =phoneNumber;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/*public String showPhoneinfo(String name,String birthday, String phoneNumber) {
						return String.format("name : %s"+"%n phoneNumber : %s"+"%nbirth: %s");
						*/

	public void  showPhoneinfo() {
			System.out.println("name : "+ name);
			System.out.println("phone: "  + phoneNumber);
			
			if (birthday != null) {
			    System.out.println("birth: " + birthday);
			}
			
			System.out.println("  ");
	}




	}