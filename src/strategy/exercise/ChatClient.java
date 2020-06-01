package strategy.exercise;

public class ChatClient {
    public void send(String message, EncryptionAlgorithm ea) {
        ea.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}
