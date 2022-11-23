package co.edu.poli.tutorship.services;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import co.edu.poli.tutorship.model.SMS;

@Service
public class SMSServiceTwilio implements SMSService{
	
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC9578e1e1e08abfd7e69717d1000a8bac";
    public static final String AUTH_TOKEN = "484d2c54fc16ea6d0601794954b13a08";

    @Override
    public Message sendSMS(SMS sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+573059141525"),
                new com.twilio.type.PhoneNumber("+18316035262"),//The Twilio phone number
                ("hola "))
           .create();

        return message;
    }
    
}

