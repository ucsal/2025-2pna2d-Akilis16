package br.com.mariojp.solid.dip.service.mail;

import br.com.mariojp.solid.dip.service.MailService;

public class DryRunMailClient implements MailService{

	@Override
	public void send(String to, String subject, String body) {
		System.out.println("Email sent success with mail simulator");
	}

}
