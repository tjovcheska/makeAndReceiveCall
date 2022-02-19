import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

public class MakePhoneCall {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "+12673565896";
        String to = "+38970352918";

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}
