package Annotations;
import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)
@interface MyAnno1
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

//@MyAnno1(name="Ajay",project="Bank")
public class OtherAnno {
    int data;
    //@MyAnno1(name="Ajay",project="Bank")


    //@MyAnno1(name="Ajay")
    public static void main(String[] args)
    {
        //@MyAnno1(name="Ajay")
        int x;
    }

}
