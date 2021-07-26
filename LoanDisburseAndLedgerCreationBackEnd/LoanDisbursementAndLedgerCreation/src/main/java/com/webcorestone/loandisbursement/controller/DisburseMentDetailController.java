package com.webcorestone.loandisbursement.controller;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.model.Customer;
import com.webcorestone.loandisbursement.model.DisbursementDetails;

import com.webcorestone.loandisbursement.model.LoanFile;
import com.webcorestone.loandisbursement.service.DisbursementDetailService;
import com.webcorestone.loandisbursement.service.LoanFileService;

@RestController
@CrossOrigin("*")
@RequestMapping("/disbursementdetail")
public class DisburseMentDetailController 
{
	@Autowired 
	DisbursementDetailService ds;

	@Autowired
    LoanFileService ls;
	
	@PostMapping("/")
	public ResponseEntity<?> saveDisbursementDetail(@RequestBody DisbursementDetails d )
	{
		int id=d.getLoanFile().getLoanFileId();
         ls.updateCustomer(id);
         DisbursementDetails disbursementDetail =	ds.saveDisbursementDetail(d);
         
         String message="Your Loan Is Successfully Disburse And Your Account Is "
         		+ "Creadited by :"+d.getLoanFile().getCustomerLoanAmount();
        
         String subject="Loan Disbursement";
         String to=d.getLoanFile().getCustomers().getEmail();
         String from="akashkalanke71@gmail.com";
         sendEmail(message,subject,to,from);
         
         
         
	
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	private void sendEmail(String message, String subject, String to, String from) 
	{
		//variable for msg
		String host="smtp.gmail.com";
		//get the system properties
		Properties properties=System.getProperties();
		System.out.println("Properties"+properties);
		//host
		
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		//step1 to get session object
		Session session=Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("akashkalanke71@gmail.com","*********");
			}
		});
		
		session.setDebug(true);
		MimeMessage mimeMessage=new MimeMessage(session);
		 try {
			 //from mail
			mimeMessage.setFrom(from);
			 
			// add reciepient
			 mimeMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			 
			 //adding subject to message
			 mimeMessage.setSubject(subject);
			
			 //msg send
			 mimeMessage.setText(message);
			 
			 //send message though tranport class
			 
			  Transport.send(mimeMessage);
			  System.out.println("Send Success");
			 
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
	}
	@GetMapping("/")
	public ResponseEntity<?> getDisburseDetails()
	{
	List<DisbursementDetails> list=ds.getDisburseDetails();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
}	
	
	


