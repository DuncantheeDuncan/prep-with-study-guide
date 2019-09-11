

public class Operators {
int modulas(int a, int b){
int answer = a % b;
// System.out.println("this is modulas ..");
    return answer;
}
void opes(){
    System.out.println("This is modulas of 5 % 3 : => " +modulas(1, 3));
}
public static void main(String[] args) {
    Operators op = new Operators();
    op.opes();

    int f= 4;
    int d = 5;
    switch(f){
        // int d= 4;
        case 4:
        System.out.println("this is false " +( d += f));
        case 0:
        case 24:
        // break;
        case 23:
        case 9:
        System.out.println("this is true");
        break;
        default:
        System.out.println("well we dont know");
    }

System.out.println(d);
}    
}