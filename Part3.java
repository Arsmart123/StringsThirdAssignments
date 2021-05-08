
/**
 * 在这里给出对类 Part3 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Part3 {
    public Boolean twoOccurences (String stringa, String stringb){
        int startIndex = 0-stringb.length();
        int count = 0;
        while(startIndex <= stringa.length()-stringb.length() & startIndex != -1){
            startIndex = stringa.indexOf(stringb, startIndex+stringb.length());
            System.out.println("startIndex " + startIndex);
            if (startIndex != -1){
                count = count + 1;
                System.out.println("count " + count);
            }
        }
        if(count>=2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void test (){
        String aa = "caonimawo";
        String bb = "wo";
        Boolean decide = twoOccurences(aa, bb);
        System.out.println("if it occurs more than 2 times " + decide);
    }
    
    public String lastPart(String stringa, String stringb){
        int start = stringb.indexOf(stringa);
        if (start == -1){
            start = 0;
        }
        String remain = stringb.substring(start+stringa.length(), stringb.length());
        return remain;
    }
    
    public void test1 (){
        String aa = "wo";
        String bb = "wocaonimawo";
        String rem = lastPart(aa, bb);
        System.out.println("Remaining part is " + rem);
    }
}
