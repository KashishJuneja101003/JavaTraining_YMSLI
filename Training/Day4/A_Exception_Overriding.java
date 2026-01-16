import java.io.IOException;

// f2 throws Exception which is greater in heirarchy compared to IOException

class A{
    void foo() throws IOException{} // f1
}

class ADash extends A{
    @Override
    void foo() throws Exception {}  // f2
}

public class A_Exception_Overriding{
    public static void main(String[] args) {
        
    }
}