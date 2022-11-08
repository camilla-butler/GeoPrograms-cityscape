

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(10, 20, 100);
        plane.move(100);
        plane.turn(90);
        plane.setColor(30, 100, 10);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(100, 10, 10);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);






    }


}
