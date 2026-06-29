import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] studentMarks = { {1, 4, 2}, {3, 6, 8} };
        System.out.println(avg(studentMarks));
        for(int i = 0; i <= avg(studentMarks).size()-1; i++){
            passesOrNot(avg(studentMarks).get(i));

        }
    }

    private static ArrayList<Double> avg (int arr[][]){
        ArrayList<Double> average =  new ArrayList<Double>();
        for (int i = 0; i <= arr.length-1; i++){
            double temp = 0.00;
            for (int j = 0; j <= arr[i].length-1; j++){
                temp += arr[i][j];

            };

            temp = temp / arr[i].length;

            average.add(temp);
        };
        return average;
    };
    private static boolean passesOrNot (double check){
            if(check >= 4 ){
                System.out.println("Passes");
                return true;
            }
            else {
                System.out.println("Failed");
                return false;
            }
    };
}