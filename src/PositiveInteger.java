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
        for (int i =2 ; i<=sqrt(num);i++){
            if (num%i==0){
                sum+=i;
                sum+= (num/i);
            }
        }
        System.out.println (sum);
        if (sum==num){
            return true;
        }
        return false;
    }

    public boolean isAbundant() {
        return false;
    }

    public boolean isNarcissistic() {
        return false;
    }

}
