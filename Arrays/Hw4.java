package Arrays;

public class Hw4 {
    public static int trap(int height[]){
        int h=height.length;
          int leftmax[]=new int[h];
          leftmax[0]=height[0];
        for(int i=1;i<h;i++){
            leftmax[i]=Integer.max(height[i],leftmax[i-1]);
        }
        int rightmax[]=new int[h];
          rightmax[h-1]=height[h-1];
          for(int i=h-2;i>=0;i--){
            rightmax[i]=Integer.max(height[i],rightmax[i+1]);
        }
           int trapwater=0;
          for(int i=0;i<h;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trapwater+=(waterlevel-height[i]);
  
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
