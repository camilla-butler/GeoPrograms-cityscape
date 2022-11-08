public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        for (int row = 0; row < 9; row = row + 1) {

            for (int col = 0; col < 8; col = col + 1) {

                int a = (int) (Math.random() * 256) + 1;
                plane.pausetime = 1;
                plane.teleport(100 *col, row*100);
                System.out.println(a);
                plane.setColor(20*row,col*10,100);
                mysquare();




            }
        }
    }
    public void house() {
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        mysquare();
        plane.turn(300);
        mytriangle();

    }
    public void mytriangle(){
        //plane.startingAngle(-120);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.turn(-120);
        plane.move(100);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
    }
    public void mysquare() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(30);
        plane.turn(90);
        plane.move(30);
        plane.turn(90);
        plane.move(30);
        plane.turn(90);
        plane.move(30);
    }

    public void square(int a) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }
}





