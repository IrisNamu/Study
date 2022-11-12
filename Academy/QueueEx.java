import java.util.LinkedList;
import java.util.Queue;

class Message {
	private String command; // Command어떤 메세지를 보낼 것인지
	private String to; /// 누구에게 보낸다.

	// 생성자
	public Message(String command, String to) {
		// 외부에서 받은 command와 to 필드에 저장
		this.command = command;
		this.to = to;
	}

	public String getCommand() {
		return command;

	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}

public class QueueEx {

	public static void main(String[] args) {
		// Queue인터페이스
		Queue<Message> messageQueue = new LinkedList<Message>();

		// Queue의 객체를 저장을 할때는 .offer를 이용
		messageQueue.offer(new Message("sendMail", "송자바"));
		messageQueue.offer(new Message("sendSNS", "조슈아"));
		messageQueue.offer(new Message("sendKakaoTalk", "스프링"));

		// 꺼내느 ㄴ과정
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // poll은 제일 먼저 저장 되어 있는거 부터 가져옵니다
			switch (message.getCommand()) {
			case "sendMail": //
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSNS":
				System.out.println(message.getTo() + "님에게 SNS을 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
				break;

			default:
				break;
			}
		}
	}

}
