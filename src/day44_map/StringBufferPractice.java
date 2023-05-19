package day44_map;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Test");
        System.out.println(stringBuffer.capacity());

        System.out.println(stringBuffer.indexOf("st"));

        stringBuffer.append("stststst");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.lastIndexOf("st"));

        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
