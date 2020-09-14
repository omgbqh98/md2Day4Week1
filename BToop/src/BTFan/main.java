package BTFan;

public class main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.turnOn();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan Fan2 = new Fan();
        Fan2.turnoff();
        Fan2.setSpeed(Fan1.MEDIUM);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        System.out.println( "fan 1: " + Fan1 +"\n");
        System.out.println( "fan 2: " +Fan2);
    }
}
