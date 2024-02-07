package Main.Prueba.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Aquí van las variables e importacionaes de tiempo.
 */
public class count {
    public long getSegundos(){
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

}

