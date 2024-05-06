package InterviewQ;

public class RandomString {

    public static void main(String[] args){

        RandomString obj = new RandomString();
        System.out.println(obj.getRandomCharString(10));
        System.out.println(obj.getRandomAlphaNumericString("10"));
    }

    public String getRandomCharString(int size) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ret = "";
        final int length = chars.length();
        for (int i = 0; i < size; i++) {
            ret += chars.split("")[(int) (Math.random() * (length - 1))];
        }
        return ret;
    }

    public String getRandomAlphaNumericString(String size) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789_,@#$%*)(!^";
        String ret = "";
        final int length = chars.length();
        for (int i = 0; i < Integer.parseInt(size); i++) {
            ret += chars.split("")[(int) (Math.random() * (length - 1))];
        }
        return ret;
    }

}
