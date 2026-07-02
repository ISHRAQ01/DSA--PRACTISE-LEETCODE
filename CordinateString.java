public class CordinateString{

    public static float shortPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
             //south
             if(dir=='S')
                y--;
            //north
            else if(dir=='N')
                y++;
            //east
            else if(dir=='E')
                x++;
            //west
            else 
                x--;
        }
        double exp=Math.pow(x, 2)+Math.pow(y, 2);
        return (float)Math.sqrt(exp);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println("THE SHORTEST PATH OF A STRING IS: "+shortPath(path));
    }
} 