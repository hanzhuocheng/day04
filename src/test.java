import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    public static void main(String[] args) throws ParseException {
        String a = "2020-01-01";
        String b = "2020-02-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date aa = sdf.parse(a);
        Date bb = sdf.parse(b);
        int a1 = aa.getYear();
        int b1 = bb.getYear();
        System.out.println(b1-a1);



        String[] c = a.split("-");
        String[] d = b.split("-");
        int[] c1 = new int[50];
        int[] d1 = new int[50];
        for (int i = 0; i<c.length ; i++){
            c1[i]=Integer.parseInt(c[i]);
            d1[i]=Integer.parseInt(d[i]);
        }



        if ((c1[0]==d1[0]) || (c1[0]== d1[0]-1)){
            if ((c1[1]==d1[1])){
                int i = d1[2]-c1[2];
                i = Math.abs(i);
                System.out.println(i+"天");
            }else {
                int i = d1[1]-c1[1];
                i = Math.abs(i);
                System.out.println(i+"月");
            }
        }else {
            int i = d1[0]-c1[0];
            i = Math.abs(i);
            System.out.println(i+"年");
        }

    }

}
