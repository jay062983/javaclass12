import java.util.Arrays;

public class Arrays2dclass02 {
    public static void main(String[] args) {
// a 2d array which can hold 3 one D arrays
        //each of size 3
        String [][] ThomsonTrain= new String[3][3];
        String [] Tcar1={"Adam","Zach","sam"};
        String[] Tcar2= {"Tom","John","Andy"};
        String[] Tcar3={"Mike","Andrew","Tim"};

       ThomsonTrain[0]=Tcar1;
        ThomsonTrain[1]=Tcar2;
        ThomsonTrain[2]=Tcar3;
        //in the first [] we specify the address of 1 D array
        System.out.println(ThomsonTrain[2][0]);
        System.out.println(ThomsonTrain[1][0]);
        System.out.println(Arrays.toString(ThomsonTrain[0]));
        System.out.println(Arrays.toString(ThomsonTrain[1]));

    }
}
