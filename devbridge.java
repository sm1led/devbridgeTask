import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
       checkStrings();
    }

    static boolean hasNumber(String str)
    {
        for(int i=0; i<(str.length()-1); i++) {
            if(Character.getNumericValue(str.charAt(i)) != 0 && Character.isDigit(str.charAt(i)) == true && Character.isDigit(str.charAt(i+1)) == true) {
                return true;
            }
        }
        return false;
    }

    static void checkStrings() throws IOException {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;  
        FileWriter fw=new FileWriter("output.txt");
        while((line=br.readLine())!=null) {
            if(hasNumber(line) == true) {
                fw.write(line);
                fw.write("\n");
                } 
            }  
            fw.close();
            fr.close(); 
         }  
    }
  