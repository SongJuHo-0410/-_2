import java.util.*;
import java.io.*;
/**
 * ���⿡ main Ŭ���� ������ �ۼ��Ͻʽÿ�.
 * 
 * @author (�ۼ��� �̸�) 
 * @version (������ȣ�� ��¥)
 */
public class main
{  
    public static void main(String[] args){
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
        try{
            Scanner scanner = new Scanner(new FileReader("c:\\Temp\\inputData20191007.txt"));
            
            int c;
            while(scanner.hasNext())
            {
                String word = scanner.nextLine();
                scoreMap.add(word);
            }
            scanner.close();
        } catch(IOException e){
            System.out.println("������ ���� �� �����ϴ�.");   
        }
    }
}
