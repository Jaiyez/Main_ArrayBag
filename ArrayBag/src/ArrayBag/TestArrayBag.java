package ArrayBag;
public class TestArrayBag {

      

       public static void main(String[] args) {

            

             ArrayBag<String> testBag1 = new ArrayBag<String>();

             ArrayBag<String> testBag2 = new ArrayBag<String>();

             ArrayBag<String> testBag3 = new ArrayBag<String>();

             ArrayBag<String> testBag4 = new ArrayBag<String>(50);

             ArrayBag<String> testBag5 = new ArrayBag<String>(50);

             ArrayBag<String> testBag6 = new ArrayBag<String>(50);

             ArrayBag<String> testBag7 = new ArrayBag<String>(50);

             ArrayBag<String> testBag8 = new ArrayBag<String>(50);

             // Initializing the bags

             // Empty bags

             testBag1.clear();

             testBag2.clear();

             // A bags with a single item

             testBag3.clear();

             testBag3.add("A");

             testBag8.clear();

             testBag8.add("A");

             // A bag with 6 items

             String[] b4 = {"A", "C", "D", "A", "Z", "A"};

             testBag4.clear();

             for(int i=0; i<b4.length; i++)

             testBag4.add(b4[i]);

             // A bag with a different number of items (3)

             String[] b5 = {"C", "D", "Z"};

             testBag5.clear();

             for(int i=0; i<b5.length; i++)

             testBag5.add(b5[i]);

             // A bag with the same number (6) but different items

             String[] b6 = {"B", "C", "D", "A", "Z", "B"};

             testBag6.clear();

             for(int i=0; i<b6.length; i++)

             testBag6.add(b6[i]);

             // A bag with the same items

             testBag7.clear();

             for(int i=0; i<b4.length; i++)

             testBag7.add(b4[i]);

             // Testing Part

             // Check that it works on empty bags

             System.out.println("Checking that it works on an empty bag");

             if (testBag1.equals(testBag2)) {

             System.out.println("Success");

             } else {

             System.out.println("*** Failed test");

             }

             // Check that it works on bags with a single item

             System.out.println("Check that it works on a bag with a single item");

             if (testBag3.equals(testBag8)) {

             System.out.println("Success");

             } else {

             System.out.println("*** Failed test");

             }

             // Check that it works on bags with different sizes

             System.out.println("Check that it works on bags with different sizes");

             if (!testBag4.equals(testBag5)) {

             System.out.println("Success");

             } else {

             System.out.println("*** Failed test");

             }

             // Check that it works on bags with the same size but different items

             System.out.println("Check that it works on bags with the same size but different items");

             if (!testBag4.equals(testBag6)) {

             System.out.println("Success");

             } else {

             System.out.println("*** Failed test");

             }

             // Check that it works on bags with the same items

             System.out.println("Check that it works on bags with the same items");

             if (testBag4.equals(testBag7)) {

             System.out.println("Success");

             } else {

             System.out.println("*** Failed test");

             }

             System.out.println();

       }

}