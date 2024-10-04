package Lab8_2;
import java.util.Iterator;

public class main {
	
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
