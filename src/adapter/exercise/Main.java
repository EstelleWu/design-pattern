package adapter.exercise;

import adapter.exercise.gmail.GmailClient;

public class Main {

	public static void main(String[] args) {
		EmailClient emailClient = new EmailClient(); 
		emailClient.addProvider(new GmailClientProvider(new GmailClient()));
		emailClient.downloadEmails();
	}

}
