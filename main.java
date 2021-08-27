// Letra j

public class main{


    public static void main(String[] args){

        Pilha obj = new Pilha(5);

        //obj.push(10);
        //obj.push(20);
        //obj.push(30);
        //obj.show();


        //Alternativa

        int[] valores = {10, 20, 30};

        obj.push_alt1(valores);
        obj.show();

        obj.pop();
        obj.pop();

        obj.show();


    }




}
