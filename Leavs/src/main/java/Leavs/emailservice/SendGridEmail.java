package Leavs.emailservice;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import Leavs.entity.ApplyLeave;
@Service
public class SendGridEmail {

	@Autowired
	SendGrid sendGrid;
	
	public Response sendEmail(EmailRequestentity entity)
	{
		//String str ="";
       Email from = new Email("suhasacharyag.sangamone@gmail.com");
       Email to = new Email("laluprasaddash23.sangamone@gmail.com");
       String subject  = "Leave Management System";
       Content mailcontent  = new Content("text/plain","TestingMailFromSendGrid");
       Mail mail= new Mail(from, subject, to, mailcontent);     
       
		mail.setReplyTo(new Email("ckuthyar@gmail.com","laluprasaddash23.sangamone@gmail.com"));
		SendGrid sg = new SendGrid(System.getenv("${sendgrid.key}"));
		Request request=new Request();
		Response response=null;
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
			

		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		return response;
		
		
	}
	
	
	
}
