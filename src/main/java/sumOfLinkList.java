import java.util.Iterator;
import java.util.LinkedList;

public class sumOfLinkList {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);

       

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);
        LinkedList<Integer> OutPut = addTwoNumbers(list1, list2);


        Iterator it = OutPut.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        String output = "";
        if (validateLinkList(list1) && validateLinkList(list2)) {
            Long sum = 0L;

            String n1 = "";
            String n2 = "";

            System.out.println("List 1 Size-> " + list1.size());
            for (int i = list1.size() - 1; i >= 0; i--) {
                System.out.println(list1.get(i));
                n1 += list1.get(i);
            }
            System.out.println("No 1 -> " + n1);


            System.out.println("List 2 Size-> " + list2.size());
            for (int j = list2.size() - 1; j >= 0; j--) {
                n2 += list2.get(j);

            }
            System.out.println("No 2 -> " + n2);

            sum = Long.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
            System.out.println("SUM -> " + sum);

            output = String.valueOf(sum);

        }
       
        LinkedList<Integer> outPutList = new LinkedList<Integer>();

        if(output != ""){
            for (int k = 0; k < output.length(); k++) {
                outPutList.push(Integer.parseInt(String.valueOf(output.charAt(k))));
                }
        }

        return outPutList;
    }

    public static Boolean validateLinkList(LinkedList<Integer> list) {
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if (it.next() < 0) {
                return false;
            }
        }
        return true;
    }

}
