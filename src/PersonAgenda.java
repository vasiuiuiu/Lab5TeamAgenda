public class PersonAgenda {

    static Person[] listName = new Person[2]; // store the names
    static int index=0;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int option=0;

        do {

            // afisare meniu
            System.out.println("1.fa aia");
            System.out.println("1.fa ailalta");


            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1: add();break;
                case 2: print();break;
            }


        }
        while(option!=4);

    }

    static void add() {

        // de optimizat cand se umple agenda

        // de optimizat daca deja exista o pers cu acel nume

        if(index<listName.length) {
            String name = SkeletonJava.readStringConsole("Input the name:");
            String number = SkeletonJava.readStringConsole("Input the number:");

            Person p = new Person();
            p.name=name;
            p.phoneNumber=number;
            listName[index] = p;
            index++;
        }
        else
        {
            System.out.println("gata memoria, schimba telul ");
        }
    }

    static void print() {

    }

    static void del() {

        // citeste un nume
        // il cauta in array
        //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";

    }

    static void modify() {

        // citeste un nume
        // il cauta in array
        // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou
    }


}
