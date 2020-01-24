//Q14 ==> Implement the class Face
//Q61 ==> Package Sample

class Face{
    int n_eyes;
    int n_noses;
    int n_mouths;
    public Face(int e, int n, int m){
        this.n_eyes = e;
        this.n_noses = n;
        this.n_mouths = m;
    }
    public void convertToNormal(){
        this.n_eyes = 2;
        this.n_mouths = 1;
        this.n_noses = 1;
    }
    public boolean isNormal(){
        if (this.n_eyes == 2 && this.n_noses == 1 && this.n_mouths == 1){
            return true;
        }
        return false;
    } 
    public String toString(){
        return ("Eyes: " + this.n_eyes + "\nNoses: " + this.n_noses + "\nMouths: " + this.n_mouths + "\nIs this guy normal?: " + isNormal());
    }
    public boolean equals(Object obj){
        Face tmpFace;
        if (!(obj instanceof Face)) return false;
        tmpFace = (Face)obj;
        return (this.n_eyes == tmpFace.n_eyes && this.n_mouths == tmpFace.n_mouths && this.n_noses == tmpFace.n_noses);
    }
    public int getN_eyes(){
        return this.n_eyes;
    }
    public int getN_noses(){
        return this.n_noses;
    }
    public int getN_mouths(){
        return this.n_mouths;
    }
    public void setN_eyes(int e){
        this.n_eyes = e;
    }
    public void setN_noses(int n){
        this.n_noses = n;
    }
    public void setN_mouths(int m){
        this.n_mouths = m;
    }
}
public class cs480_hw2{
    public static void main(String argv[]){
       Face f1 = new Face(2, 2, 1);
       Face f2 = new Face(1, 1, 2);
       Face f3 = new Face(2, 1, 1);
       System.out.println(f1.toString());
       System.out.println(f2.toString());
       System.out.println(f3.toString());
    }
}