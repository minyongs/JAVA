package exam_abstract_class;
 abstract class MessageSender{
	    private String title;
	    private String senderName;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getSenderName() {
	        return senderName;
	    }

	    public void setSenderName(String senderName) {
	        this.senderName = senderName;
	    }

	    public abstract void sendMessage();
	}

	class EmailSender extends MessageSender {
	    private String senderAddr;
	    private String emailbody;

	    public EmailSender(String title, String senderName, String senderAddr, String emailbody) {
	        setTitle(title);
	        setSenderName(senderName);
	        this.senderAddr = senderAddr;
	        this.emailbody = emailbody;
	    }

	    @Override
	    public void sendMessage() {
	        System.out.println("제목: " + getTitle());
	        System.out.println("보내는 사람: " + getSenderName());
	        System.out.println("받는 사람: " + senderAddr);
	        System.out.println("내용: " + emailbody);
	    }

	    // Getters and setters for senderAddr and emailbody
	}

	class SmsSender extends MessageSender {
	    private String returnPhoneNo;
	    private String message;
	    private String senderPhoneNo;

	    public SmsSender(String title, String senderName, String returnPhoneNo, String message, String senderPhoneNo) {
	        setTitle(title);
	        setSenderName(senderName);
	        this.returnPhoneNo = returnPhoneNo;
	        this.message = message;
	        this.senderPhoneNo = senderPhoneNo;
	    }

	    @Override
	    public void sendMessage() {
	        System.out.println("제목: " + getTitle());
	        System.out.println("보내는 사람: " + getSenderName());
	        System.out.println("전화번호: " + senderPhoneNo);
	        System.out.println("회신 전화번호: " + returnPhoneNo);
	        System.out.println("메세지 내용: " + message);
	    }

	    
	}

	public class MessageSenderTest {
	    public static void main(String[] args) {
	        System.out.println("----------------------");

	        EmailSender e = new EmailSender("생일을 축하합니다", "고객센터", "javaone@naver.com", "10% 할인 쿠폰이 발행되었습니다.");
	        e.sendMessage();
	        System.out.println("----------------------");
	        SmsSender s = new SmsSender("생일을 축하합니다", "고객센터","010-000-0000","02-000-0000","10% 할인쿠폰이 발행되었습니다");
	        s.sendMessage();
	    }
	    
	}
