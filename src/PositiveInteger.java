import static java.lang.Math.*;

public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect() {
        int sum=0;
        if (num!=1) {
            sum += 1;
        }
        for (int i =2 ; i*i<=num;i++){
            if (num%i==0){
                sum+=i;
                if (i != num/i) sum+= (num/i);
            }
        }
        //System.out.println (sum);
        if (sum==num){
            return true;
        }
        return false;
    }

    public boolean isAbundant() {

        int sum=0;
        if (num!=1) {
            sum += 1;
        }
        for (int i =2 ; i*i<=num;i++){
            if (num%i==0){
                sum+=i;
                if (i != num/i) sum+= (num/i);
            }
        }
        //System.out.println (sum);
        if (sum>num){
            return true;
        }
        return false;
    }

    public boolean isNarcissistic() {
        int digit=0, m=num;
        // Figure out the digits
        while (m>0) {
            digit += 1;
            m=m/10;
        }
        int sum=0;
        m=num;
        // Figure out the digits
        while (m>0) {
            sum+=(int) pow(m%10,digit);
            m=m/10;
        }


        //System.out.println (sum);
        if (sum==num){
            return true;
        }

        return false;
    }

}
