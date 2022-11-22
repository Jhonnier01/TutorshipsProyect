package co.edu.poli.tutorship.services;


	import com.twilio.rest.api.v2010.account.Message;

	import co.edu.poli.tutorship.model.SMS;

	public interface SMSService {
		
		public Message sendSMS(SMS sms);

	}

