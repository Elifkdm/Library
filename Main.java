public class Main {
    public static void main(String[] args){
        String Title1 = "Tante Rosa";
        String Author1= "Sevgi Soysal";
        int year1= 1968;
        int pagenumber1= 130;
        boolean finished1 = true;
        System.out.println(Title1 + " by " +  Author1 + " was published in " +  year1 + " and it has " + pagenumber1 + " pages." + " Did I read it? " +  finished1 );


        String Title2= "The Catcher in the Rye";
        String Author2= "J. D. Salinger";
        int year2= 1945;
        int pagenumber2= 230;
        boolean finished2 = false;
        System.out.println(Title2 + " by " +  Author2 + " was published in " +  year2 + " and it has " + pagenumber2 + " pages." + " Did I read it? " +  finished2 );


        String Title3= "Chronicle of a Death Foretold";
        String Author3= "Gabriel Garcia Marquez";
        int year3= 1996;
        int pagenumber3= 122;
        boolean finished3= true;
        System.out.println(Title3 + " by " +  Author3 + " was published in " +  year3 + " and it has " + pagenumber3 + " pages." + " Did I read it? " +  finished3 );


        int totalpage= pagenumber1 + pagenumber2 + pagenumber3;
        System.out.println(totalpage + " pages in total ");

        int totalyear= year1 + year2 + year3;
        int totalbook= 3;
        System.out.println(totalyear / totalbook + " average year ");



    }






    }
