package users;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class ID {
    private static int id;
    ID(){
        this.id=0;
    }
    public static int uploadID(){
        return id++;
    }
    public static void reset() {
        ID.id = 0;
    }
}
