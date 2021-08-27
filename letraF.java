public class letraF{


    public static void main(String [] args){

        Pilha obj1 = new Pilha(8);
        Pilha obj2 = new Pilha(3);

        int[] aux = {10, 20, 30, 50, 25};
        obj1.push_alt1(aux);
        obj1.show();
        System.out.println("\n");

        int[] aux2 = {45, 29, 80};
        obj2.push_alt1(aux2);
        obj2.show();
        System.out.println("\n");


        obj1.push_alt2(obj2);
        obj1.show();
        System.out.println("\n");

        obj1.pop_alt(2);
        obj1.show();

    }



}
