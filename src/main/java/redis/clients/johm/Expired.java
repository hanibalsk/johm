package redis.clients.johm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Expired {
    public static int NO_EXPIRE = -1;
    public static int MINUTE_EXPIRE = 60;
    public static int TEN_MINUTES_EXPIRE = 10 * 60;
    public static int HOUR_EXPIRE = 60 * 60;
    public static int DAY_EXPIRE = 24 * HOUR_EXPIRE;

    /**
     * Date format if the attribute is of type Date.
     * @return the date format
     */
    public int expire() default NO_EXPIRE;
}
