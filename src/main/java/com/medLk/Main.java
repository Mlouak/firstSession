package com.medLk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Marchandise marchandise = new Marchandise(1, 100, 200);
        Marchandise marchandise2 = new Marchandise(2, 200, 300);
        System.out.println(marchandise.getNumero());
        //marchandise.setNumero(3);
        //System.out.println(marchandise.getNumero());
        System.out.println(marchandise);*/

        /*Personne p1 =  new Personne("ahmed","tijani");
        Personne p3 = new Personne("samid", "achraf");
        Personne p2 =  new Personne();
        System.out.println(p1.getNom());
        System.out.println("----------------------------");;
        System.out.println(p2.getNom());
        System.out.println("----------------------------");;
        Etudiant e1 = new Etudiant("ahmed","tijani","123","informatique","L3");
        System.out.println(e1);
        System.out.println("----------------------------");;
        System.out.println(p3.getNom());*/

        //Personne p1 = new Personne("ahmed","tijani");
        //Etudiant e1 = new Etudiant("ahmed","tijani","123","informatique","L3");
        //System.out.println(p1.nomMaj());
        //System.out.println(e1.nomMaj());

        /*Personne p1 = new Etudiant("ahmed","tijani","123","informatique","L3");
        Etudiant e2 = new Etudiant("ahmed","tijani","123","informatique","L3");
        Professeur prof = new Professeur("ahmed","tijani","math");


        p1.realiserAvancement();
        System.out.println("----------------------------");
        e2.realiserAvancement();
        System.out.println("----------------------------");
        prof.realiserAvancement();*/

        /*Cuisinier c1 = new Cuisinier("Beldi");
        Chef chef = new Chef("Beldi", 5);

        System.out.println(c1);
        System.out.println(chef);

        Cuisinier c2 = chef;
        System.out.println(c2);

        /*chef = (Chef)c1;*/
        //System.out.println(chef);*/

       /* int[] tab = {1, 2, 3, 4, 5};
        int tab2[] = {1, 2, 3, 4, 5};
        tab[2] = 5;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
       Cuisinier[] cuisiniers = new Cuisinier[2];
        cuisiniers[0] = new Cuisinier("Marocain");
        cuisiniers[1] = new Cuisinier("Italien");
        //cuisiniers[2] = new Cuisinier("Francais");
        System.out.println(cuisiniers[1]);

        LinkedList<Cuisinier> list = new LinkedList<>();
        list.addFirst(new Cuisinier("Marocain"));
        list.addLast(new Cuisinier("Italien"));

        for(Cuisinier c : list) {
            System.out.println(c);
        }


        ArrayList<Cuisinier> list2 = new ArrayList<>();
        list2.add(new Cuisinier("Marocain"));
        list2.add(list2.size(), new Cuisinier("chinois"));

        for(Cuisinier c : list) {
            System.out.println(c);
        }
        System.out.println(list2.get(1));*/

        /*System.out.println("--------------Map--------------");
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Marocain");
        map.put(2, "Italien");
        map.put(3, "Francais");
        System.out.println(map.get(2));
        map.put(2, "Chinois");

        //parcours de map by key
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<Integer, String> mapEmpty = new HashMap<>();

        System.out.println(map.containsValue("Italien"));

        if(map.containsKey(2)) {
            System.out.println("La clé 2 existe");
        }
        System.out.println("--------------");
        for(Integer key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }*/



        //parcours de map by value
        /*for(String value : map.values()) {
            System.out.println(value);
        }*/
        Set<Integer> setStart = new HashSet<>();
        setStart.add(1);
        setStart.add(2);
        setStart.add(1);
        setStart.add(1);

        for (Integer i : setStart) {
            System.out.println(i);
        }
        Iterator<Integer> it = setStart.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
