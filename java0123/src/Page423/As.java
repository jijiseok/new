package Page423;

public class As { // 04번

	   void startChatting(String chatId) {
	      String nickName = chatId;
	      class Chat {
	         void start() {
	            while (true) {
	               String inputData = "안녕하세요";
	               String message = "[" + nickName + "]" + inputData;
	               sendMessage(message);
	            }
	         }
	         void sendMessage(String message) {
	            System.out.println(message);
	         }
	      }
	      Chat chat = new Chat();
	      chat.start();
	   }
	}

