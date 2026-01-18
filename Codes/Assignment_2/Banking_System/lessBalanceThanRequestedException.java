package Banking_System;

public class lessBalanceThanRequestedException extends RuntimeException{
	public lessBalanceThanRequestedException(String message){
        super(message);
    }
}
