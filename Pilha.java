class Pilha{

    private static int TAM_MAX = 1000;
    private int[] valores;
    private int topo;

    //Construtor

    Pilha(int tam){ //Letra a

        if(tam <= TAM_MAX){

            setValores(new int[tam]);
            this.topo = -1;
        }
        else
            System.out.println("Inicialize com um tamanho menor.\n");

    }
    
    public void setValores(int[] valores) {

        this.valores = valores;

    }
    // Funções

    public boolean empty(){ //Letra c

        if(valores[0] != 0)
            return false;

        return true;

    }

    public void push(int valor){ //Letra d

        if(topo == valores.length - 1)
            System.out.println("Pilha cheia " + valor +" não foi empilhado.\n");
        else{

            this.topo++;
            this.valores[topo] = valor;

        }
    }

    public void push_alt1(int[] args){ // Letra e

        for(int i = 0; i < args.length; i++)
            push(args[i]);

    }

    public void push_alt2(Pilha obj1){ // Letra f

        int[] aux = obj1.get_valores();
        push_alt1(aux);

    }

    public int pop(){ // Letra j

        if(this.topo != -1){
            
            int aux = valores[this.topo];

            valores[this.topo] = 0;
            this.topo--;

            return aux;

        }
        else
            return 0;

    }


    public void pop_alt(int n){


        for(int i = 0; i < n; i++)
            pop();

    }

    public int top(){ // Letra i

        return this.topo;

    }


    // Funções auxiliares
    
    public int[] get_valores(){

        return this.valores;

    }

    public void show(){

        for(int i = valores.length - 1; i >= 0 ; i--){

            if(i == topo)
                System.out.println(this.valores[i] + " <- topo");
            else
                System.out.println(this.valores[i]);
        }

        System.out.println("\n");
    }
}
