public class Camillacs1project extends World {
    public int red;
    public int green;
    public int blue;

    public void go() {
        plane.loadBackGround("supercityepicness.png");
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for(int row=0; row<350; row++)
        {
            for(int col=0; col<1000; col++)
            {
               plane.teleport(col, row);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

                if((red>80 && green>150 && blue>220))
                {
                    System.out.println(12);
                    plane.setPixelColor(244,174,114);
                }
            }
        }

        plane.pausetime = 0;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 100;
        plane.move(400);
        plane.teleport(400, 500);
        plane.setColor(10, 30, 40);
        plane.move(400);
        plane.teleport(590, 342);
        plane.setColor(10, 30, 40);
        plane.move(800);
        plane.teleport(210, 267);
        plane.isTrail = true;
        for (int row = 0; row < 9; row = row + 1) {
            for (int col = 0; col < 2; col = col + 1)
            {
                plane.pausetime = 0;
                plane.teleport( col *50 +210,  row *50+ 267);
                windows();
                plane.teleport( col *50 +409,  row *50+ 518);
                windows();
                plane.teleport( col *50 +594,  row *50+ 353);
                windows();
            }
        }
        plane.teleport(202,255);
        plane.setColor(0,0,0);
        plane.isTrail=true;
        plane.trailWidth= 10;
        plane.turn(-135);
        plane.move(60);
        plane.turn(-90);
        plane.move(60);
        plane.teleport(400,499);
        plane.startingAngle(-135);

        plane.isTrail=false;
        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();
        plane.teleport(10,10);
        plane.turn(90);
        plane.setPixelColor(red / 2, green, blue/3);
        plane.move(700);

        plane.teleport(208,266);
        plane.trailWidth=(100);
        plane.move(100);






    }

            public void windows() {
            plane.startingAngle(90);
            plane.setColor(252, 244, 3);
            plane.isTrail = true;
            plane.trailWidth = 3;
            plane.move(30);
            plane.turn(90);
            plane.move(30);
            plane.turn(90);
            plane.move(30);
            plane.turn(90);
            plane.move(30);
        }}

