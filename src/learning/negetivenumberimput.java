package learning;

public class negetivenumberimput extends Exception {
	String errormessage;

	public negetivenumberimput(String errormessage) {
		this.errormessage = errormessage;
		
	}

	public String toString() {
		return errormessage;
		
	}
}
