package adapter.exercise;

import adapter.exercise.gmail.GmailClient;

public class GmailClientProvider implements EmailProvider{
	private GmailClient gmailClient;
	
	public GmailClientProvider(GmailClient gmailClient) {
		this.gmailClient = gmailClient;
	}
	@Override
	public void downloadEmails() {
		this.gmailClient.connect();
		this.gmailClient.getEmails();
		this.gmailClient.disconnect();
		
	}

}
