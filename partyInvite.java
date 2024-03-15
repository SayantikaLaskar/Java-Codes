public class partyInvite {
    public static int guestCall(int n){
        if(n<=1){
            return 1;
        }
        //Single
        int way1 = guestCall(n-1);

        //pair
        int way2 = (n-1) * guestCall(n-2);

        return way1+way2;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(guestCall(n));
    }
    
}
