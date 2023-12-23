package phoneBook;

public class CreateNumbers {
    public static void main(String[] args) {
//        NumberList numberList = new NumberList();
        NumberList numberList = new NumberList("89349434455", "Ваня");
        numberList.setNumbers("89342434355","Петя");
        numberList.setNumbers("89342434355","Саша");
        numberList.setNumbers("89342334355","Петя");
        numberList.setNumbers("89382434355","Степа");
        numberList.setNumbers("89322434355","Ваня");
        numberList.setNumbers("89342434375","Петя");
        System.out.println(numberList);
    }
}
