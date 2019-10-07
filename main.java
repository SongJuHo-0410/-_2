import java.util.*;
import java.io.*;
/**
 * 여기에 main 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class main
{  
    public static void main(String[] args){
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
        InputStreamReader in = null;
        try{
            Scanner scanner = new Scanner(new FileReader("c:\\Temp\\inputData20191007.txt"));
            int c;
            while(scanner.hasNext())
            {
                String name = scanner.nextLine();
                String score = name.substring(3);
                scoreMap.put(name, Integer.parseInt(score));
            }
            scanner.close();
        } catch(IOException e){
            System.out.println("파일을 읽을 수 없습니다.");   
        }
    }
}
