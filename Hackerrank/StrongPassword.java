public class StrongPassword {
    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    boolean d = false;
    boolean l = false;
    boolean u = false;
    boolean s = false;
    int toadd=0;
    
    for(int i = 0 ; i < password.length();i++){
        int v = Integer.valueOf(password.charAt(i));
        if(v>=65&&v<=90){
            u = true;
        }
        if(v>=97&&v<=122){
            l = true;
        }
        if(v>=48&&v<=57){
            d = true;
        }
        if(v>=33&&v<=45){
            s = true;
        }
    }
    
    if(!u){
        toadd++;
    }
    if(!l){
        toadd++;
    }
    if(!d){
        toadd++;
    }
    if(!s){
        toadd++;
    }
    int addedLen = password.length()+toadd;
    if(addedLen>6){
        return toadd;
    }
       return 6-addedLen+toadd;
    }
}
