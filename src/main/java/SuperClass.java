/**
 * Created by User on 02.12.2016.
 */
public class SuperClass {

    public String superMethod(int arg) {
        String result = null;
        if (arg == 0) {
            result = "0";
        } else if (arg == 1) {
            result = "1";
        } else {
            result = "else";
        }
        return result;
    }
}
