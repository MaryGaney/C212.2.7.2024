import java.util.ArrayList;
public class ArrayListDemo {
    /**
     * print array list using foreach loop
     * @param values
     */
    public static void printArrayList(ArrayList<String> values){
        for(String v:values){
            System.out.println(v);
        }
    }

    /**
     * print array list using for loop
     * @param values
     */
    public static void printArrayList2(ArrayList<String> values){
        for (int i = 0; i < values.size(); i++) {
            System.out.println(i + " " + values.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("a new hope");
        movies.add("the empire strikes back");
        movies.add("return of the jedi");

        printArrayList(movies);

        movies.add(0,"a phantom menace");
        movies.add(1,"attack of the clones");
        movies.add(2,"revenge of the sith");

        printArrayList(movies);

        printArrayList2(movies);

        String removedMovie = movies.remove(0);

        System.out.println("Removed movie is" + removedMovie);

        System.out.println("movies after removal at index 0 is");

        printArrayList2(movies);

        ArrayList<String> movies2 = movies;
        System.out.println("removing movie at index 0 from movies2");
        movies2.remove(0);

        printArrayList2(movies);

        ArrayList<String> movies3 = new ArrayList<String>(movies);
        movies3.remove(0);
        System.out.println("------ movies3 ------");
        printArrayList2(movies3);
        System.out.println("------ movies ------");
        printArrayList2(movies);

        ArrayList<Integer> intValues = new ArrayList<Integer>();

    }
}
