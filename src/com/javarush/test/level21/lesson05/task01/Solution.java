package com.javarush.test.level21.lesson05.task01;

import java.util.HashSet;
import java.util.Set;

/* Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object object)
    {
        if (object == null)
            return false;
        if (object.getClass() != this.getClass())
            return false;

        Solution n = (Solution) object;
        return first != null ? first.equals(n.first) : n.first == null
                && (last != null ? last.equals(n.last) : n.last == null);
    }

    public int hashCode() {
        return 31 * (first==null?0:first.hashCode()) + (last==null?0:last.hashCode());
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution(null, "fff"));
        System.out.println(s.iterator().next());
        Solution newObject = new Solution(null, "fff");
        System.out.println(newObject);
        System.out.println(s.contains(newObject));
    }
}
