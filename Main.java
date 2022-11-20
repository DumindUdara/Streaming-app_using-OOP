
public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {

                System.out.println("---------- MOVIE SECTION ----------");

                Movie obMovie1 = new Movie();
                Actor obPerson1 = new Actor("XXXX", 22, "0112653000", 4, "Male");

                // Method Over Loading
                Movie obMovie2 = new Movie("Harry Potter", "new movie with new best rating", "IMAG- HARRY", 2022, 1,
                                "Acction");
                Actor obPerson2 = new Actor("YYYYYYY", 33, "0740404204", 3, "Male");

                // Method over loading
                Movie obMovie3 = new Movie("Order of Chaos", "In a world of no absolutes.", 2022, 5,
                                "Action");
                Actor obPerson3 = new Actor("ZZZZZZZ", 22, "0730404204", 4, "Male");

                obMovie1.addActor(obPerson1);
                obMovie2.addActor(obPerson2);
                obMovie3.addActor(obPerson3);

                obMovie1.printDetails();
                System.out.println();
                System.out.println("Actors Details:- ");
                for (Actor a : obMovie1.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obMovie2.printDetails();
                System.out.println();
                System.out.println("Actors Details:- ");
                for (Actor a : obMovie2.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obMovie3.printDetails();
                System.out.println();
                System.out.println("Actors Details:- ");
                for (Actor a : obMovie3.getActorList()) {
                        a.showinfo();
                }

                System.out.println("*****************************************************************");
                System.out.println();

                System.out.println("---------- TV SERIAS SECTION ----------");
                TvSerias obTvserias1 = new TvSerias(); // calling default constructor of TVSerias class
                Actor obPerson4 = new Actor("AAAAAAAA", 22, "0750507653", 4, "Male");

                // Method Over Loading
                TvSerias obTvSerias2 = new TvSerias("Malgudi Days", "Based on the works of R.K. Narayan,.",
                                "IMG - Malgudi Days", 2006, 1, "Drama");
                Actor obPerson5 = new Actor("BBBBBBBB", 22, "0750507953", 4, "Male");
                // Method Over Loading
                TvSerias obTvSerias3 = new TvSerias("THE DEVIL'S HOUR", "Tulsa King's stale comedy sometimes feels ",
                                2022, 4, "Action");
                Actor obPerson6 = new Actor("CCCCCCCCCCC", 22, "0750507853", 4, "Male");

                obTvSerias2.addActor(obPerson4);
                obTvSerias3.addActor(obPerson5);
                obTvserias1.addActor(obPerson6);

                obTvserias1.printDetails();
                System.out.println();
                for (Actor a : obTvserias1.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obTvSerias2.printDetails();
                System.out.println();
                for (Actor a : obTvSerias2.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obTvSerias3.printDetails();
                System.out.println();
                for (Actor a : obTvSerias3.getActorList()) {
                        a.showinfo();
                }
                System.out.println();

                System.out.println("*****************************************************************");
                System.out.println();

                System.out.println("---------- DOCUMENTARIES SECTION ----------");
                Documentaries obDocumentaries1 = new Documentaries();
                Actor obPerson7 = new Actor("KKKKKKKKKK", 22, "KKKKKKKKKKK", 4, "Male");

                // Method Over Loading
                Documentaries obDocumentaries2 = new Documentaries("Legacy of the Flames",
                                "Dominating a territory spanning from",
                                2023, 4, "Romantic");
                Actor obPerson8 = new Actor("HHHHHHHHHHHHHH", 22, "HHHHHHHHHHHHHHH", 4, "Male");

                // Method Over Loading
                Documentaries obDocumentaries3 = new Documentaries("Will Roots Save the World?",
                                "One hardly thinks about the root systems behind the massive",
                                "IMAGE - Will Roots ", 2018, 5, "Love");
                Actor obPerson9 = new Actor("LLLLLLLLLLLLLLLL", 22, "LLLLLLLLLLLLLLLLLLL", 4, "Male");

                obDocumentaries1.addActor(obPerson7);
                obDocumentaries2.addActor(obPerson8);
                obDocumentaries3.addActor(obPerson9);

                obDocumentaries1.printDetails();
                System.out.println();
                for (Actor a : obDocumentaries1.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obDocumentaries2.printDetails();
                System.out.println();
                for (Actor a : obDocumentaries2.getActorList()) {
                        a.showinfo();
                }

                System.out.println();
                obDocumentaries3.printDetails();
                System.out.println();
                for (Actor a : obDocumentaries3.getActorList()) {
                        a.showinfo();
                }
                System.out.println("*****************************************************************");
        }
}