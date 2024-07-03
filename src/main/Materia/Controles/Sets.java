package main.Materia.Controles;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public Sets(){
        construirHashSet();
        System.out.println();
        construirLinkedHashSet();
        System.out.println();
        construirTreeSet();
        System.out.println();
        construirTreeSetConComparador();

    }

    //Construir y mostrar un Hashset
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        //System.out.println(conjunto);
        conjunto.add("Banana");
        //System.out.println(conjunto);
        conjunto.add("Naranja");
        //System.out.println(conjunto);
        conjunto.add("Manzana");//Elemento duplicado eliminado
        //System.out.println(conjunto);
        conjunto.add("Uvas");
        //System.out.println(conjunto);
        conjunto.add("Sandia");
       // System.out.println(conjunto);
        System.out.println("HashSet: " + conjunto);
        //Eliminar un elemento
        conjunto.remove("Banana");
        System.out.println("HashSet despues de eliminar banana: "+ conjunto);
        conjunto.remove("Uvas");
        conjunto.remove("Sandia");
        System.out.println("HashSet despues de Elminiar Uvas y Sandia: " + conjunto);

        //Verificar si un elemento existe
        Boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("HashSet contiene 'Naranja' " + contieneNaranja);

        //Obtener el tamaño del conjunto
        int tamano = conjunto.size();
        System.out.println("Tamano del HashSet: " + tamano);


    }

    //Construir y mostrar un linkedHashSet
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        conjunto.add("Manzana");
        //System.out.println(conjunto);
        conjunto.add("Banana");
        //System.out.println(conjunto);
        conjunto.add("Naranja");
        //System.out.println(conjunto);
        conjunto.add("Manzana");//Elemento duplicado eliminado
        //System.out.println(conjunto);
        conjunto.add("Uvas");
        //System.out.println(conjunto);
        conjunto.add("Sandia");
       // System.out.println(conjunto);
        System.out.println("LinkedHashSet: " + conjunto);

        

    }

    //Construir y mostrar un treeSet con orden natural
    public void construirTreeSet(){

        TreeSet<String> conjunto = new TreeSet<>();

        conjunto.add("Manzana");
        //System.out.println(conjunto);
        conjunto.add("Banana");
        //System.out.println(conjunto);
        conjunto.add("Naranja");
        //System.out.println(conjunto);
        conjunto.add("Manzana");//Elemento duplicado eliminado
        //System.out.println(conjunto);
        conjunto.add("Uvas");
        //System.out.println(conjunto);
        conjunto.add("Sandia");
       // System.out.println(conjunto);
        System.out.println("Trees: " + conjunto);


    }


    public void construirTreeSetConComparador(){

        //Comparador personalizado que ordena las cadenas en 

        Comparator<String> comparadorOrdenInverso = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1); // Ordenar de manera inversa
                //return s1.compareTo(s2); // Ordenar de manera alfabetica
            }

        };

        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);

        conjunto.add("Manzana");
        //System.out.println(conjunto);　
        conjunto.add("Banana");
        //System.out.println(conjunto);
        conjunto.add("Naranja");
        //System.out.println(conjunto);
        conjunto.add("Manzana");//Elemento duplicado eliminado
        //System.out.println(conjunto);
        conjunto.add("Uvas");
        //System.out.println(conjunto);
        conjunto.add("Sandia");
       // System.out.println(conjunto);
        System.out.println("Trees: " + conjunto);

    }
}
