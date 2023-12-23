package phoneBook;

import java.util.*;

public class NumberList {
    private HashMap<String, ArrayList<String>> numbers = new HashMap<>();

    public NumberList(String number, String name){
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(number);
        this.numbers.put(name, numbers);
    }
    public NumberList(){
    }

    public void setNumbers(String number, String name) {
        if (this.numbers.containsKey(name)) {
            this.numbers.get(name).add(number);
        }
        else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            this.numbers.put(name, numbers);
        }
    }


    @Override
    public String toString() {

        Iterator<Map.Entry<String, ArrayList<String>>> i = numbers.entrySet().iterator();

        if (! i.hasNext())
            return "null";
        else {
            StringBuilder sb = new StringBuilder();
            TreeMap<Integer, ArrayList<String>> numbersSort = new TreeMap<>();

            while (i.hasNext()){
                Map.Entry<String, ArrayList<String>> e = i.next();

                String name = e.getKey();
                Integer key = -e.getValue().size();

                if (numbersSort.containsKey(-e.getValue().size())) {
                    numbersSort.get(key).add(name);
                }
                else {
                    ArrayList<String> names = new ArrayList<>();
                    names.add(name);
                    numbersSort.put(key, names);
                }
            }


            for (ArrayList<String> names: numbersSort.values()) {
                for (String name: names) {
                    sb.append(name);
                    sb.append(" - ");
                    sb.append(numbers.get(name));
                    sb.append('\n');
                }

            }
            return sb.toString();
        }

    }
}
