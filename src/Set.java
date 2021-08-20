import java.util.ArrayList;

public class Set {
    public void set(){
        Input input = new Input();
        Output output= new Output();
        long minimal=input.inputMinimalValue();
        long maximum=input.inputMaxlValue();
        long length=input.inputLength();
        Fibanacci fibanacci=new Fibanacci(minimal,maximum,length);
        ArrayList<Long>minMaxFibanacci=fibanacci.craeteMinMaxFibanacci();
        ArrayList<Long>lengthFibanacci=fibanacci.createLengthFibanacci();
        output.print(minMaxFibanacci);
        output.print(lengthFibanacci);
    }
}
