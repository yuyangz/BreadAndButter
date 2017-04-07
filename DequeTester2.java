// Team DequeTheHalls - Nikita Borisov, Joelle Lum, Samantha Ngo
// APCS2 pd1

public class DequeTester2{
    public static void main(String[] args){
        Deck<String> blarg = new Deck<String>();
        //should return null
        System.out.println(blarg.pollFirst());
        System.out.println(blarg.pollLast());
	System.out.println(blarg.peekFirst());
        System.out.println(blarg.peekLast());

	System.out.println("Size up 'til now: " + blarg.size()); // 0
	
	// Testing Add Methods - should return true
        System.out.println(blarg.addFront("zeta"));
	// Afterwards: zeta
        System.out.println(blarg.addBack("iota"));
	// Afterwards: zeta, iota
        System.out.println(blarg.addBack("xi"));
	// Afterwards: zeta, iota, xi
        System.out.println(blarg.addFront("omnicron"));
	// Afterwards: omnicron, zeta, iota, xi
	System.out.println(blarg.addBack("zeta"));
	// Afterwards: omnicron, zeta, iota, xi, zeta
	System.out.println(blarg);
	System.out.println("------------------------------------------------");

	System.out.println("Size up 'til now: " + blarg.size()); // 5

	// Testing peek methods
	// Test each twice to ensure peek doesn't alter the ArrayList
        System.out.println(blarg.peekFirst()); // omnicron
        System.out.println(blarg.peekFirst()); // omnicron
        System.out.println(blarg.peekLast()); // zeta
        System.out.println(blarg.peekLast()); // zeta
	
        // Testing contain method
        System.out.println(blarg.contains("omnicron")); // true
        System.out.println(blarg.contains("zeta")); // true
        System.out.println(blarg.contains("omega")); // false
        System.out.println(blarg.contains("orion")); // false
	// Testing atIndex method
	System.out.println(blarg.atIndex("omnicron")); // 0
	System.out.println(blarg.atIndex("zeta")); // 1
	System.out.println(blarg.atIndex("xi")); // 3
	System.out.println(blarg.atIndex("omni")); // -1

	// Testing remove methods
	System.out.println(blarg.removeFirst()); // omnicron
	// Afterwards: zeta, iota, xi, zeta
	System.out.println(blarg.removeLast()); // zeta
	// Afterwards: zeta, iota, xi
	System.out.println(blarg.removeLast()); // xi
	// Afterwards: zeta, iota
	System.out.println(blarg.peekFirst()); // zeta
	System.out.println(blarg.peekLast()); // iota

	
        System.out.println(blarg.addBack("scion"));
        System.out.println(blarg.addBack("iota"));
	System.out.println(blarg.addBack("zeta"));
	// Afterwards: zeta, iota, scion, iota, zeta
	System.out.println(blarg.removeFirstOccurrence("zeta"));
	System.out.println(blarg); // iota, scion, iota, zeta
	System.out.println(blarg.removeFirstOccurrence("iota"));
	System.out.println(blarg); // scion, iota, zeta
	System.out.println(blarg.removeLastOccurrence("iota"));
	System.out.println(blarg); // scion, zeta
	System.out.println(blarg.removeFirstOccurrence("marzon"));
	System.out.println(blarg); // scion, zeta
	System.out.println(blarg.removeLastOccurrence("zeta"));
	System.out.println(blarg); // scion

	// Testing capacity
        for(int i = 0; i < 52; i += 1){
            blarg.addFront("omega");
        }
	System.out.println(blarg.size()); // 52

	// Testing capacity
	Deck zorb = new Deck<String>(5);
        for(int i = 0; i < 10; i += 1){
            zorb.addFront("zorbs");
        }
	System.out.println(blarg.size()); // 10
	
    }
}
