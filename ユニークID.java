import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;

public class newSort{

	public static void main(String[] args) {
    	String[] StrArray = new String[1500000000];
    	
    	BufferedReader br = null;
    	int i = 0;
    	int roop = 0;
    	HashMap<String,Integer> map = new HashMap<String,Integer>();

        try {
            // ���͌��t�@�C���A�o�͐�t�@�C��
            File file = new File("C:/WORK/network.csv");
            FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //���P
          	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            br = new BufferedReader(new FileReader(file));
        	String line;
        	
            // �P�s�Âǂݍ��ݏo�́B
            while ((line = br.readLine()) != null) {
            	String[] split = line.split("	",-1);

            	if(map.containsKey(split[0])){
            	;
            	}else{
            		map.put(split[0],i);
            		StrArray[i] = split[0];
            		pw.println(StrArray[i] + "," + map.get(split[0]));
            		i++;
            		if(i%100000==0) System.out.println(i);

            	}
            	
            	if(map.containsKey(split[1])){
            	;
            	}else{
            		map.put(split[1],i);
            		StrArray[i] = split[1];
            		pw.println(StrArray[i] + "," + map.get(split[1]));
            		i++;
            		if(i%100000==0) System.out.println(i);

            	}
            	

            	/*
            	StrArray[i] = split[0];
	       		pw.println(StrArray[i]);
            	i++;
            	StrArray[i] = split[1];
	       		pw.println(StrArray[i]);
            	StrArray[i] = null;
                i++;
            	if(i==6){
            	break;
            	}
            	*/

            }
        	pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // �X�g���[���͕K�� finally �� close ���܂��B
                br.close();
            } catch (IOException e) {
            }
        }
        roop = i;
		
        //���̎��_��StrArray�Ɋi�[
		System.out.println(roop+"�s�ǂݍ��݂܂���");  

		
/*      try {
          //�o�͐���쐬����
          FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //���P
          PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
for(i=0;i<roop;i++){
          //���e���w�肷��
          pw.println(StrArray[i]);
}
          //�t�@�C���ɏ����o��
          pw.close();

          //�I�����b�Z�[�W����ʂɏo�͂���
         // System.out.println("�o�͂��������܂����B");

      }
		
		
		catch (IOException ex) {
          //��O������
          ex.printStackTrace();
      }
      */
	}
    }

    /**
     * �t�@�C����ǂݍ��݂܂��B
     *
     */
    