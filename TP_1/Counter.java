package priseenmain;

/**
 *
 * @author Jean-Marie Normand <jean-marie.normand@ec-nantes.fr>
 */
public class Counter {

    /**
     * Attribut de la classe de type entier s'appelant 'count'
     */
    public int count;

    Counter() {
        count = 0;
    }

    Counter(int c) {
        //equivalent a 
        // count.c;
        this.count = c;
    }

    /**
     *
     * @param max
     */
    public void count(int max) {
        if (max <= 0) {
            count = -1;
        } else {
            int i = 0;
            while (i < max) {
                this.count++;
                i += i + 1;
            }
        }
    }

    
    
    
    public int maMethodeIllisible(int a, int b) {
        int res=0;
        if((a > 2)||(b<8)){for(int i=0;i<a+b*4;i++){res +=i+2*a;
            if(res > 25){res-=2;}
            }}
            else{
                res =4;
            }
        return res;
    }
    
    public int maMethodeLisible(int a, int b) {
        int res = 0;
        if ((a > 2) || (b < 8)) {
            for (int i = 0; i < a + b * 4; i++) {
                res += i + 2 * a;
                if (res > 25) {
                    res -= 2;
                }
            }
        } else {
            res = 4;
        }
        return res;
    }
    
    
    /**
     * Accesseur a l'attribut 'count'
     * @return la valeur de l'attribut 'count'
     */
    public int getCount() {
        return this.count;
        // equivalent a
        // return count;
    }
}
