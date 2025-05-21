public class P3 {
        public static boolean comparestr(String str1,String str2){
            return str1.equals(str2);
        }
        public static String copystr(String o){
            return new String(o);
        }
        public static String concatenate(String str1,String str2){
            return str1+str2;
        }
        public static void main(String[] args){
            String s1="Hello";
            String s2="kishan";
            String s3="Dog";
            System.out.println(comparestr(s1,s2));
            String s4=copystr(s2);
            System.out.println(concatenate(s2,s3));


        }
}
