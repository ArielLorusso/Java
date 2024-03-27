package c6_Dynamic_Array;

//I forgot to add a get() method for random access 🤦‍♂️
//I've included that in the code posted here...

public class Main{

	public static void main(String[] args) {

		DynamicArray dynamicArray = new DynamicArray(5);
		
        Car auto = new Car("chevy",12);

		dynamicArray.add(auto);
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.insert(1, 'A');
        System.out.println(dynamicArray.getClas(0));
        String a = dynamicArray.getClas(1).toString();
        System.out.println(a);
		System.out.println(dynamicArray.get(0));
		//dynamicArray.insert(0, "X");
        auto.model("Camaro");
		dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	}
}
