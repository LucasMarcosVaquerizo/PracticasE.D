package time;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Aquí van las variables e importacionaes de tiempo.
 */
public class count {
    Boolean verdadero = true;
    Boolean falso = false;
    String nombre = "Lucas Marcos";
    public long getSegundos(){
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

}
