public class path {
    public static float getpath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir =='S'){
                y--;

            }
            else if (dir == 'N'){
                y++;
            }
            else if(dir =='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x1 = x*x;
        int y1 = y*y;
        return (float) Math.sqrt(x1 + y1);


    }
    public static void main(String[] args) {
        String path = "NS";
       
        System.out.println("path is "+getpath(path));

        
    }
    
}
