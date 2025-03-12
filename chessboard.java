//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class chessboard {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for(int j=1;j<=8;j++){
                if(j%2==0){
                    System.out.print("W ");
                }
                else{
                    System.out.print("B ");
                }
            }
            System.out.println();

        }
    }
}