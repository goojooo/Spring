package component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements ICourier{
	
	public DTDC()
	{
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "DTDC is delivering the " + oid + " order product";
	}

}
