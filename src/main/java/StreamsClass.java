


import java.util.LinkedList;
import java.util.stream.Stream;

public class StreamsClass{

    public static void main(String []args){
       System.out.println("Hello, World!");
       Stream<String> streamBuilder =
       Stream.<String>builder().add("a").add("b").add("c").build();


    //    streamBuilder.forEach(System.out::println);

       Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

    //    streamGenerated.forEach(System.out::println);


       LinkedList<Integer> linklist = new LinkedList<Integer>();
       linklist.add(1);
       linklist.add(2);
       linklist.add(4);
       linklist.add(1);
       linklist.add(2);
       linklist.add(4);
       linklist.add(1);
       linklist.add(2);
       linklist.add(4);

      //  linklist.stream().flatMap(link ->);

       linklist.stream().sorted().forEach(System.out::println);

       System.out.println("------<<<<<<<<>>>>>>>>--------");

       linklist.forEach(System.out::println);

    }
}