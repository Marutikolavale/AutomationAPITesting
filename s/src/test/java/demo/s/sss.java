package demo.s;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l= LogManager.getLogger("hare");
		System.out.println("Maruti");
		l.info("working fine");
		l.debug("kolavale");
		l.error("not a error");
		l.warn("not war");
		
	}

}
