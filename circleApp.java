public class circleApp {
    public static circleApp.circleOne circleOne;
    public static circleApp circleTwo;

    public void setx2() {
    }

    static class circleOne {
        int x1 ;
        int y1 ;
        float radius1;
        //setters
        public void setx1(int x1){
            this.x1 = x1;
        }
        public void sety1(int y1){
            this.y1 = y1;
        }
        public void setradius1(float radius1){
            this.radius1 = radius1;
        }
        //getters
        public int getx1(){
            return x1;
        }
        public int gety1(){
            return y1;
        }
        public float getradius1(){
            return radius1;
        }
        public float calculateArea(){
            float area;
            area = (float)(radius1*radius1*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius1);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = 2*radius1;//casting all data types to float
            return diameter;
        }

    }
    //object 2

    static class circleTwo {
        int x2 ;
        int y2 ;
        float radius2;

        public void setx2(int x2) {
            this.x2=2;
        }
        public void sety2(int y2){
            this.y2 = y2;
        }
        public void setradius2(float radius2){
            this.radius2 = radius2;
        }
        //getters
        public int getx2(){
            return x2;
        }
        public int gety2(){
            return y2;
        }
        public float getradius2(){
            return radius2;
        }
        public float calculateArea(){
            float area;
            area = (float)(radius2*radius2*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius2);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = 2*radius2;//casting all data types to float
            return diameter;
        }
    }
//object 3

    static class circleThree {
        int x3 ;
        int y3 ;
        float radius3;

        //setters
        public void setx3(int x3){
            this.x3 = x3;
        }
        public void sety3(int y3){
            this.y3 = y3;
        }
        public void setradius3(float radius3){
            this.radius3 = radius3;
        }
        //getters
        public int getx3(){
            return x3;
        }
        public int gety3(){
            return y3;
        }
        public float getradius3(){
            return radius3;
        }
        public float calculateArea(){
            float area;
            area = (float)(radius3*radius3*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius3);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = 2*radius3;//casting all data types to float
            return diameter;
        }
    }

}
