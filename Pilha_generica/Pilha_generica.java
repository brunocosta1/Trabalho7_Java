//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Arrays;

class Pilha<E>{

    private static int TAM_MAX = 1000;
    private Object[] valores;
    private int topo;


    //Construtor

    Pilha(int tam){ //Letra a

        this.valores = new Object[tam];
        this.topo = -1;

    }
    
    // Funções

    public boolean empty(){ //Letra c

        for(int i = 0; i < valores.length; i++)
            if(valores[i] != null)
                return false;

        return true;

    }

    void push(E e){

        if(this.topo == this.valores.length - 1)
            System.out.println("Pilha cheia " + e +" não foi empilhado.\n");
        else{

            topo++;
            valores[topo] = e;

        }

    }

    public void push_alt1(E[] args){

        for(int i = 0; i < args.length; i++)
            push(args[i]);

    }
    
    public void push_alt2(Pilha<E> obj1){

        E[] aux = obj1.get_valores();
        push_alt1(aux);

    }
    

    public E pop(){

        if(this.topo != -1){

            E aux = (E)(valores[this.topo]);
            valores[this.topo] = null;
            this.topo--;

            return aux;

        }else
            return null;

    }

    public int top(){ 

        return this.topo;

    }


    // Funções auxiliares
    

    public String toString(){

        return Arrays.toString(this.valores);

    }

    public E[] get_valores(){

        return (E[])this.valores;

    }

    public void show(){

        for(int i = this.valores.length - 1; i >= 0; i--){

            if(i == this.topo)
                System.out.println(this.valores[i] + " <- topo");
            else
                System.out.println(this.valores[i]);
        }

        System.out.println("\n");


    }

    public static void main(String[] args){

        Pilha<Integer> int_array = new Pilha<Integer>(3);

        int_array.push(1);
        int_array.push(2);
        int_array.show();

        //System.out.println(int_array);

        Pilha<String> string_array = new Pilha<String>(5);

        String[] temp = {"Bruno", "Viviane", "João"};

        //string_array.push("Bruno");
        //string_array.push("Viviane");
        //string_array.push("João");

        string_array.push_alt1(temp);

        Pilha<String> string_array2 = new Pilha<String>(2);

        String[] temp2 = {"Holanda", "Brasil"};
        string_array2.push_alt1(temp2);

        string_array.push_alt2(string_array2);

        string_array.show();
        




    }

}

