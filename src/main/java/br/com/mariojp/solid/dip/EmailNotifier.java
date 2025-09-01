package br.com.mariojp.solid.dip;

import br.com.mariojp.solid.dip.service.MailService;

public class EmailNotifier {
	
	private MailService mail;
	
	public EmailNotifier(MailService mail) {
		this.mail = mail;
	}
	
	public void welcome(User user) {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
		}
		this.mail.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
