
package mergesort;

class AverageGrade extends Thread{
    public final Student [] internal;
    float aver;
    int a=0,b=0,c=0,d=0,e=0;
    int f[]={0,0,0,0,0};
    public AverageGrade(Student []s) {
        internal=s;
    }
    public int [] getFreq(){
        return f;
    }
    public float getAvrege(){
        return aver;
    }
    public void aver(Student []s){
        float sum = 0 ;
        for (Student item : s) {
            sum += item.grade;
        }
        aver=sum/20;
    } 
    public void freq(Student []s){
        for (Student item : s) {
            if(item.grade<60){
                a++;
                f[0]=a;
                
            }
            if(item.grade<70){
                b++;
                f[1]=b;
                
            }
            if(item.grade<80){
                c++;
                f[2]=c;
                
            }
            if(item.grade<90){
                d++;
                f[3]=d;
                
            }
            if(item.grade<100){
                e++;
                f[4]=e;
                
            }
            
        }
    }

    @Override
    public void run() {
        aver(internal);
        freq(internal);
    }
    
}
