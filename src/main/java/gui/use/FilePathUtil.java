package gui.use;
//约定大于配置；封装
public class FilePathUtil {
    public final static String FILEPATH="src/main/resources/images/";
    public static String getPath(String fileName){
        return FILEPATH+fileName;
    }
}
