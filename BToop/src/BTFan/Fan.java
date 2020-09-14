package BTFan;

public class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        private int speed = SLOW ;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public void setSpeed(int newSpeed) {
            this.speed = newSpeed;
        }

        public void turnOn() {
            this.on = true;
        }

        public void turnoff() {
            this.on = false;
        }

        public void setRadius(int newRadius) {
            this.radius = newRadius;
        }

        public void setColor(String newColor) {
            this.color = newColor;
        }

        @Override
        public String toString() {
//        return "Fan{" +
//                "SLOW=" + SLOW +
//                ", MEDIUM=" + MEDIUM +
//                ", FAST=" + FAST +
//                ", speed=" + speed +
//                ", on=" + on +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
// }
            if(on){
                return "toc do= "+ this.speed + " "+
                        "color= " + this.color + " "+
                        "radius= " + this.radius + " fan is on";
            }else {
                return "color= " +this.color+ " "+
                        "radius= " + this.radius + " fan is off";
            }
        }
    }



