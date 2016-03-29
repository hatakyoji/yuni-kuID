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
            // 入力元ファイル、出力先ファイル
            File file = new File("C:/WORK/network.csv");
            FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //※１
          	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            br = new BufferedReader(new FileReader(file));
        	String line;
        	
            // １行づつ読み込み出力。
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
                // ストリームは必ず finally で close します。
                br.close();
            } catch (IOException e) {
            }
        }
        roop = i;
		
        //この時点でStrArrayに格納
		System.out.println(roop+"行読み込みました");  

		
/*      try {
          //出力先を作成する
          FileWriter fw = new FileWriter("C:/Users/kyoji-ha/Desktop/output.csv", true);  //※１
          PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
for(i=0;i<roop;i++){
          //内容を指定する
          pw.println(StrArray[i]);
}
          //ファイルに書き出す
          pw.close();

          //終了メッセージを画面に出力する
         // System.out.println("出力が完了しました。");

      }
		
		
		catch (IOException ex) {
          //例外時処理
          ex.printStackTrace();
      }
      */
	}
    }

    /**
     * ファイルを読み込みます。
     *
     */
    