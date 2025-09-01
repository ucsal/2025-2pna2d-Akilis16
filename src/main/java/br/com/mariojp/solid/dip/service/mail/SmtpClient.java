package br.com.mariojp.solid.dip.service.mail;

import br.com.mariojp.solid.dip.service.MailService;

public class SmtpClient implements MailService{
	
	public SmtpClient() {
		System.setProperty("SMTP_AVAILABLE", "true");
	}
	
	@Override
    public void send(String to, String subject, String body){
        if(!"true".equalsIgnoreCase(System.getProperty("SMTP_AVAILABLE"))) {
            throw new IllegalStateException("SMTP indisponível");
        }
        if(to == null || !to.contains("@")) throw new IllegalArgumentException("email inválido");
        // envia ...
        System.out.println("Email sent success with SMTP!");
    }
}
