public class PersonAgenda {

    static Person[] listName = new Person[8]; // store the names
    static int index = 0;

    public static void main(String[] args) {
        int option = 0;

        do {

            // afisare meniu
            System.out.println("1.Adauga contact.");
            System.out.println("1.fa ailalta");


            //selectare optiune
            option = SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    del();
                    break;

            }


        }
        while (option != 5);

    }

    static void add() {

        // de optimizat cand se umple agenda

        // de optimizat daca deja exista o pers cu acel nume

        if (index < listName.length) {
            String name = SkeletonJava.readStringConsole("Introduceti nume contact: ");
            String number = SkeletonJava.readStringConsole("Introduceti numar de telefon: ");


        } else {
            System.out.println("gata memoria, schimba telul ");
        }
    }

    static void print() {
        System.out.println();
        for (int i = 0; i <= index; i++) {
            System.out.println(listName[i]);
        }


    }

    static void del() {

        // citeste un nume
        String name = SkeletonJava.readStringConsole("Introduceti nume: ");
        String numer = SkeletonJava.readStringConsole("Introduce numar de telefon");
        // il cauta in array
        for (int i = 0; i <= index; i++) {
            if (name.equals(listName[i])) {


                //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";




                    // citeste un nume
                    // il cauta in array
                    // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou


                    Person persoana1 = new Person();
                    persoana1.name = "Vasile";
                    persoana1.phoneNumber = "0744987367";
                    listName[index] = persoana1;


                    Person persoana2 = new Person();
                    persoana2.name = "Beniamin";
                    persoana2.phoneNumber = "0743987367";
                    listName[index] = persoana2;

                    Person peroana3 = new Person();
                    peroana3.name = "Leon";
                    peroana3.phoneNumber = "0764954282";
                    listName[index] = peroana3;

                    Person persoana4 = new Person();
                    persoana4.name = "Darius";
                    persoana4.phoneNumber = "0762258250";
                    listName[index] = persoana4;
                }
            }
        }
    }







