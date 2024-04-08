public class removeWhiteSpace {
    public static void main(String[] args) {
        String hawa="hamro ghar";
        System.out.println(checkWhite(hawa));
    }

    private static String checkWhite(String hawa) {
        StringBuilder jj=new StringBuilder();
        char[] list =hawa.toCharArray();
        for (char hh:list
             ) {
            if(!Character.isWhitespace(hh)) jj.append(hh);
        }
        return jj.toString();
    }
}
