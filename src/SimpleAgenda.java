public class SimpleAgenda {

    static String[] listName = new String[7]; // store the names
    static int index=0;


    static void initializare(){
        listName[index] = "Beniamin";

        index++;
        listName[index] = "Vasile";

        index++;
        listName[index] = "Sofia";

        index++;
        listName[index] = "Peuu";

        index++;
        listName[index] = "Abigail";

         index++;
        listName[index] = "Petru ";

         index++;
        listName[index] = "Leon";

    }


    public static void main(String[] args) {
        int option=0;
        initializare();
        do {
            // afisare meniu
            System.out.println("1.Contact nou.");
            System.out.println("2.Toate contactele.");
            System.out.println("3.Sterge contact.");
            System.out.println("4.Modifica contact.");


            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            System.out.println();

            switch (option) {
                case 1: add();
                    break;
                case 2: print();
                    break;
                case 3: del();
                    break;
                case 4: modify();
                    break;
            }


        }
        while(option!=5);

    }

    static boolean cautaNume(String nume){
        for(int i=0; i <= index; i++){
            if(listName[i].equals(nume)){
                return true;
            }
        }
        return false;
    }

    static void add() {

        // de optimizat cand se umple agenda
        if(index == listName.length){

        }


        if(index < listName.length) {
            String name = SkeletonJava.readStringConsole("Introduceti nume:");

            // de optimizat daca deja exista o pers cu acel nume
            if(!cautaNume(name)) {
                index++;
                listName[index] = name;
                index++;
            }
        }

        else
        {
            System.out.println("gata memoria, schimba telul ");
        }
    }

    static void print() {
        System.out.println("======= TOATE CONTACTELE =======");
        for(int i=0; i<= index; i++){
            System.out.println(listName[i]);
        }
        System.out.println("================================");
        System.out.println();
    }

    static void del() {

        // citeste un nume
        String name = SkeletonJava.readStringConsole("Introduceti nume: ");
        // il cauta in array

        for(int i=0; i<= index; i++) {
            if (name.equals(listName[i])) {
                //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";
                listName[i] = "";
            }
        }

    }

    static void modify( ) {

        // citeste un nume
        String numeVechi = SkeletonJava.readStringConsole("Introduceti nume care doriti sa il inlocuiti: ");
        String numeNou = SkeletonJava.readStringConsole("Introduceti numele nou: ");
        // il cauta in array
        for(int i=0; i<= index; i++) {
            if (numeVechi.equals(listName[i])) {
                // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou

            }
        }
    }
}
