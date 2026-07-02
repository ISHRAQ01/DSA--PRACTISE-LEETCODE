// public class UppercaseFirstLetter {
//     public static void main(String[] args){
//         String str="hello, my name is ishraq, Hello Hello";
//         String str2="";
//         str2+=(char)(str.charAt(0)-32);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 str2+=str.charAt(i);
//                 if(!Character.isUpperCase(str.charAt(i+1))){
//                     str2+=(char)(str.charAt(i+1)-32);
//                     i++;
//                 }
                
//             }
//             else
//                 str2+=str.charAt(i);
//         }
//         System.out.println("THE UPPERCASE STRING IS: "+str2);
//     }
// }
public class UppercaseFirstLetter{
    public static void main(String[] args){
        String str="hello,my name is ishraq saifi.recently graduated from aktu university.";
        StringBuilder sb= new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' || str.charAt(i)==','|| str.charAt(i)=='.' && i<str.length()-1){
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
