import java.util.*;
/**
 * ���⿡ main Ŭ���� ������ �ۼ��Ͻʽÿ�.
 * 
 * @author (�ۼ��� �̸�) 
 * @version (������ȣ�� ��¥)
 */
public class main
{  
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new FileReader("inputData20191007.txt"));

            int c;
            while(scanner.hasNext())
            {
                String word = scanner.nextLine();
                wordVector.add(word);
            }
            scanner.close();
        } catch(IOException e){
            System.out.println("������ ���� �� �����ϴ�.");   
        }
    }
}
