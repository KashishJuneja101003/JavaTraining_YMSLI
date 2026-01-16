// use Exception - for checked exception
// use RuntimeException - for unchecked exception
// Never use throwable - throwable includes exception and errors (errors are unrecoverable)
// you've to use throws for checked exceptions

class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}

public class C_Exception_UserDefined {
    public static void main(String[] args) {
        
    }
}
