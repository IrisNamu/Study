import java.util.LinkedList;
import java.util.Queue;

class Message {
	private String command; // Command� �޼����� ���� ������
	private String to; /// �������� ������.

	// ������
	public Message(String command, String to) {
		// �ܺο��� ���� command�� to �ʵ忡 ����
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
		// Queue�������̽�
		Queue<Message> messageQueue = new LinkedList<Message>();

		// Queue�� ��ü�� ������ �Ҷ��� .offer�� �̿�
		messageQueue.offer(new Message("sendMail", "���ڹ�"));
		messageQueue.offer(new Message("sendSNS", "������"));
		messageQueue.offer(new Message("sendKakaoTalk", "������"));

		// ������ ������
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // poll�� ���� ���� ���� �Ǿ� �ִ°� ���� �����ɴϴ�
			switch (message.getCommand()) {
			case "sendMail": //
				System.out.println(message.getTo() + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSNS":
				System.out.println(message.getTo() + "�Կ��� SNS�� �����ϴ�.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.getTo() + "�Կ��� īī������ �����ϴ�.");
				break;

			default:
				break;
			}
		}
	}

}
