import java.util.ArrayList;

public class Clothes 
{
    private String clothes;
    private String type;

    //multi-arg
    public Clothes(String clothes, String type)
    {
        this.clothes = clothes;
        this.type = type;
    }

    //toString
    public String toString()
    {
        String output = clothes + ", " + type;

        return output;
    }

}
