package higer;

public class eight {
    public class Point {
        int x;
        int y;

        public Point(){
            this.x = 0;
            this.y = 0;
        }

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x){
            this.x = x;
        }

        public void setY(int y){
            this.y = y;
        }

        public void set(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }

        public boolean equals(Point p1, Point p2){
            if(p1.x == p2.x && p1.y == p2.y){
                return true;
            }else{
                return false;
            }
        }

        public int hashCode() {
            long bits = java.lang.Double.doubleToLongBits(getX());
            bits ^= java.lang.Double.doubleToLongBits(getY()) * 31;
            return (((int) bits) ^ ((int) (bits >> 32)));
        }
    }
}
