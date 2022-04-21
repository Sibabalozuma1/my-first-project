public class circle {
    private float radius ;
    private int x;
    private int y;

    //setters
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public void setradius(float radius){
        this.radius = radius;
    }
    //getters
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public float getradius(){
        return radius;
    }

    //METHODS
    public float calculateArea(){
        float area;
        area = (float)(radius*radius*Math.PI);//casting all data types to float
        return area;
    }
    public float calculateCircumference(){
        float circumference;
        circumference = (float)(2*Math.PI*radius);//casting all data types to float
        return circumference;
    }
    public float calculateDiameter(){
        float diameter ;
        diameter = 2*radius;//casting all data types to float
        return diameter;
    }

}
