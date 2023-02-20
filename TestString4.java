public class TestString4{

    public static void main(String[] Args){
        String birthday="16/07/1980";
        int starIndex=birthday.indexOf("1980");

        System.out.println("Start index of year "+starIndex);
        System.out.println("Year of birthday "+birthday.substring(starIndex));

        System.out.println("Month of birthday "+birthday.substring(3,5));

        System.out.println("*********************************");
        
        //CORRECT FORM
        String newDate=String.join("/","16","07","1980");
        System.out.println("newDate "+newDate);

        //INCORRECT FORM
        newDate = "16" + "/" + "07" + "/" + "1980";
        System.out.println("newDate = " + newDate);

        //INCORRECTO FORM
        newDate = "16".concat("/").concat("07").concat("/")
                .concat("1980");
        System.out.println("newDate = " + newDate);

        System.out.println("***********REPLACE***********");
        //working with replace, remplaceFirts and remplaceAlls
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("0", "AA"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/", "-"));

    }
}