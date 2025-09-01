import br.com.mariojp.solid.dip.*;
import br.com.mariojp.solid.dip.service.MailService;
import br.com.mariojp.solid.dip.service.mail.DryRunMailClient;
import br.com.mariojp.solid.dip.service.mail.SmtpClient;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "false"); // desejável não chamar SMTP
		MailService mail;
		
		if("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			mail = new DryRunMailClient();
		} else {
			mail = new SmtpClient();
		}
		
		var notifier = new EmailNotifier(mail);
		// Estado inicial: vai lançar IllegalStateException (SMTP indisponível)
		notifier.welcome(new User("Ana", "ana@example.com"));
		System.out.println("Email enviado!");
	}
}
