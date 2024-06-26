package pkg;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface MyConstructorAnnotation {
    String value() default "";

    int intValue() default 0;

    String stringValue() default "default";

}