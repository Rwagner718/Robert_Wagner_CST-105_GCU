/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Implement theStringclass) The String class is provided in the Java library. 
Provide your own implementation for the following methods (name the new 
classMyString1):  
 *

 *
 **/
package WeekFourAssignments;

import java.util.ArrayList;
public class StringClass_10_22 {
   public static void main (String[] args) {
        char[] c = {'Z','e','T','s','u','B','o'};
        MyString1 s = new MyString1(c);
        
        System.out.print("Verify contents: ");
        s.print();
        System.out.print("\n\n");
        
        // indexing
        System.out.print("MyString1.charAt(int index): ");
        System.out.println(s.charAt(3));
        
        // string length
        System.out.print("MyString1.length(): ");
        System.out.println(s.length());
        
        // substring
        System.out.print("MyString1.substring(int begin, int end): ");
        s.substring(2,5).print();
        System.out.print("\n");
        
        // to character array
        System.out.print("MyString1.toChars(): ");
        System.out.println(s.toChars());
        
        // to lower case
        System.out.print("MyString1.toLowerCase(): ");
        s.toLowerCase().print();
        System.out.print("\n");
        
        // equals
        char[] c2 = {'Z','e','t','s','u','b','o'};
        MyString1 s2 = new MyString1(c2);
        char[] c3 = {'Z','e','T','s','u'};
        MyString1 s3 = new MyString1(c3);
        System.out.println("MyString1.equals(): ");
        
        // this is why you use built-ins. When you start
        // re-implementing things, the normal methods don't work with
        // them. At least they could be made to work in a duck-typed
        // language...
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s.print();
        System.out.print(" ? ");
        System.out.println(s.equals(s));
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s2.print();
        System.out.print(" ? ");
        System.out.println(s.equals(s2));
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s3.print();
        System.out.print(" ? ");
        System.out.print(s.equals(s3));
        System.out.print("\n");
        
        // convert Integer to MyString1
        MyString1.valueOf(34).print();
        System.out.print("\n");
    }
}

/**
 * A partial re-implementation of the java String class
 * 
 */
class MyString1 {
    private char[] __data;
    
    /**
     * Create a new MyString1 object from a character array.
     * 
     */
    public MyString1(char[] chars) {
        // If you don't clone the array, the data will remain available
        // outside the class.
        this.__data = new char[chars.length];
        System.arraycopy(chars, 0, this.__data, 0, chars.length);
    }
    
    /**
     * Print the MyString1 object.
     * Used for verfication of contents.
     * 
     * This is a generative function, if for no other reason than I
     * could do it.
     */
    public MyString1 print() {
        for(int i = 0; i < this.length(); i++) {
            System.out.print(this.getData()[i]);
        }
        
        return this;
    }
    
    /**
     * Provide indexing for the character data inside the object.
     * 
     * Raises ArrayIndexOutOfBoundsException for out of bounds indices.
     */
    public char charAt(int index) {
        // String class throws StringIndexOutOfBoundsException in the
        // event of an out-of-bounds index. I'm not going to subclass
        // Exception, so I'm sticking with the normal
        // ArrayIndexOutOfBoundsException thrown in the same case here.
        return this.getData()[index];
    }
    
    /**
     * Return the length of the string.
     * 
     */
    public int length() {
        return this.getData().length;
    }
    
    public MyString1 substring(int begin, int end) {
        char[] substring = new char[end-begin];
        
        for(int i = begin; i < end; i++) {
            substring[i-begin] = this.charAt(i);
        }
        
        return new MyString1(substring);
    }
    /**
     * Convert the object to a character array.
     * 
     * Well, more "return a copy of the internal data," but oh well.
     * 
     */
    public char[] toChars() {
        char[] ch = new char[this.length()];
        System.arraycopy(this.getData(),0,ch,0, this.length());
        return ch;
    }
    
    /**
     * Convert every alpha character to it's lower case representation.
     * 
     * This is a generative function, making the changes to the data
     * and then returning a reference to itself.
     * 
     */
    public MyString1 toLowerCase() {
        for(int i = 0; i < this.length(); i++) {
            this.getData()[i] = Character.toLowerCase(this.getData()[i]);
        }
        
        return this;
    }
    
    /**
     * Compares this instance with another.
     * 
     */
    public boolean equals(MyString1 s) {
        if(this.length() != s.length()) {
            return false;
        }
        
        for(int i = 0; i < this.length(); i++) {
            if(this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Convert an integer to a MyString1 object.
     * 
     */
    public static MyString1 valueOf(int i){
        return new MyString1(Integer.toString(i).toCharArray());
    }

    /**
     * @return the __data
     */
    public char[] getData() {
        return __data;
    }

    /**
     * @param __data the __data to set
     */
    public void setData(char[] __data) {
        this.__data = __data;
    }
    
}
 

