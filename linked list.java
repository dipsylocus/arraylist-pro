mport java.util.*;
public class Main {
public static void main(String[] args) {
ArrayList<ArrayList<String>> groceryList = new ArrayList();
//CREATING 2D ARRAYLIST
ArrayList<String> bakeryList = new ArrayList();
//ARRAYLIST #1
bakeryList.add("pasta");
bakeryList.add("garlic bread");
bakeryList.add("donuts");	
ArrayList<String> produceList = new ArrayList();
//ARRAYLIST #2
produceList.add("tomatoes");
produceList.add("zucchini");
produceList.add("peppers");	
ArrayList<String> drinksList = new ArrayList();
//ARRAYLIST #3
drinksList.add("soda");
drinksList.add("coffee");
groceryList.add(bakeryList);// ADDING #1#2#3 IN 2D ARRAYLIST
groceryList.add(produceList);
groceryList.add(drinksList);	
System.out.println(groceryList);//WILL PRINT WHOLE 2D ARRAYLIST
System.out.println(groceryList.get(0).get(1));//WILL GET [0][1] ELEMENT
}
}
