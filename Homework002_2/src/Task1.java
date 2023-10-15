

public class Task1 {

    public static void main(String[] args) {

        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder answer = new StringBuilder();
        answer = answer.append(QUERY);
        PARAMS = PARAMS.substring(1, PARAMS.length() - 1);
        PARAMS = PARAMS.replace(", ", ":");
        String[] strings = PARAMS.split(":");

        String name = strings[1].substring(1, strings[1].length() - 1);
        String country = strings[3].substring(1, strings[3].length() - 1);
        String city = strings[5].substring(1, strings[5].length() - 1);
        String age = strings[7].substring(1, strings[7].length() - 1);
        String Null = "null";

        if (!name.equals("null")) {
            answer = answer.append("name='" + name + "' and ");
        }


        if (!country.equals("null")) {
            answer = answer.append("country='" + country + "' and ");
        }


        if (!city.equals("null")) {
            answer = answer.append("city='" + city + "' and ");
        }



        if (!age.equals("null")) {
            answer = answer.append("age='" + age + "' and ");
        }

        answer = answer.delete(answer.length()-5, answer.length()-1);
        System.out.println(answer);

    }
}

