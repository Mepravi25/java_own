class InvalidAgeException extends Exception{
    public InvalidAgeException(String mess){
        super(mess);
    }
}
class AgeValidator{
    void ckage(int a){
        try{
        if(a<0 || a>150){
            throw new InvalidAgeException("Give crt age !!");
        }
    }
    }
}
public class CusErr {
    public static void main(String args[]){
        AgeValidator a=new AgeValidator();
        
        a.ckage(0);
}
}
