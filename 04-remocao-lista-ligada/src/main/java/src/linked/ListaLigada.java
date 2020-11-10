package src.linked;

public class ListaLigada {

    private Node init;

    public void adicionar(int value){
        if(init == null){
            init = new Node(value);
        }else{
            Node aux = init;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(new Node(value));
        }
    }


    public void remocao(int value){
        if(init == null){
            if(value == init.getValue()){

            }
        }else{
            Node aux = init;
            while(aux.getNext() != null || value == aux.getValue()){
                aux = aux.getNext();
            }
        }
    }


    @Override
    public String toString() {
        if (init == null) return "[]";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("[");
        Node aux = init;
        while(aux.getNext() != null){
            strBuilder.append(aux + " ");
            aux = aux.getNext();
        }        
        strBuilder.append(aux + "]");
        return strBuilder.toString();
    }

}
