import java.util.*;

public class ChainMarketing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parent name");
        String parent = sc.nextLine();
        System.out.println("Does the parent have children");
        String hasChildren = sc.nextLine();
        List<String> members = new ArrayList<>();
        members.add(parent);
        Map<String, Integer> commisionMap = new HashMap<>();
        if (hasChildren.equalsIgnoreCase("N")) {
            commisionMap.put(parent, 250);
        } else if (hasChildren.equalsIgnoreCase("Y")) {
            System.out.println("Enter Children name, if child > 1 then enter it with comma");
            String childrenInput = sc.nextLine();
            String[] children = childrenInput.split(", ");
            members.addAll(Arrays.asList(children));
            commisionMap.put(parent, children.length * 500);
            for (String child : children) {
                commisionMap.put(child, 250);
            }
        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        System.out.println("Total Members " + members.size());
        System.out.println("Commision details");
        for (String member : members) {
            System.out.println(member + ": " + commisionMap.get(member));
        }
        sc.close();
    }
}
