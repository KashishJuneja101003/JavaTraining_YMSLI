
import java.io.IOException;

// f1 throws Exception which is greater in heirarchy compared to IOException
// it is reverse in overriding
class X{
    X() throws Exception{}  //f1
}

class XDash extends X{
    XDash() throws IOException {    //f2
    }
    
}
public class B_Exception_Constructor {
    public static void main(String[] args) {
        
    }
}
