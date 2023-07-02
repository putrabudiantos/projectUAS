import pertanyaan.pertanyaan;
import arraylist.*;
import inputuser.inputUserObject;
import stack.*;

public class Main {
    public static void main(String[] args) throws Exception {
        pertanyaan.questions(
            arraylistObject.listInteger, 
            arraylistObject.listString, 
            stackObject.st, 
            inputUserObject.stdin);
    }
}
