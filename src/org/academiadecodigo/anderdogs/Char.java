package org.academiadecodigo.anderdogs;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Char {


    public Picture picture;
    private int x = 0;

    private String [] down ={"resources/charsprites/D1.png", "resources/charsprites/D2.png", "resources/charsprites/D3.png", "resources/charsprites/D4.png"};
    private String [] up = {"resources/charsprites/UP1.png","resources/charsprites/UP2.png", "resources/charsprites/UP3.png","resources/charsprites/UP4.png"};
    private String [] left = {"resources/charsprites/L1.png", "resources/charsprites/L2.png", "resources/charsprites/L3.png", "resources/charsprites/L4.png"};
    public String [] right= {"resources/charsprites/R1.png","resources/charsprites/R2.png","resources/charsprites/R3.png","resources/charsprites/R4.png"};



    public Char() {
        picture =  new Picture(663, 718, "resources/charsprites/UP1.png");


    }

    public void draw(){
        picture.draw();
    }

    public String[] getDownArr(){
        return down;
    }
    public String[] getUpArr(){
        return up;
    }
    public String[] getLeftArr(){
        return left;
    }
    public String[] getRightArr(){
        return right;
    }

    public Picture getPicture(){
        return picture;
    }



    public void moveUp() {

        //OBSTACLES ON THE RIGHT//////////////////////////////////////////////

        if(picture.getX() == 1053 && picture.getMaxX() == 1105 && picture.getY() == 276 && picture.getMaxY() == 318){ //right center chest
            picture.translate(0, 0);
            return;
         }
        if(picture.getX() == 975 && picture.getMaxX() == 1027 && picture.getY() == 458 && picture.getMaxY() == 500){ //right center barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1339 && picture.getMaxX() == 1391 && picture.getY() == 666 && picture.getMaxY() == 708) { //right bottom chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 793 && picture.getMaxX() == 845 && picture.getY() == 380 && picture.getMaxY() == 422) { //right box pile
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 845 && picture.getMaxX() == 897 && picture.getY() == 94 && picture.getMaxY() == 136) { //right top barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1183 && picture.getMaxX() == 1235 && picture.getY() == 94 && picture.getMaxY() == 136) { //right top pile of barrels
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1209 && picture.getMaxX() == 1261 && picture.getY() == 94 && picture.getMaxY() == 136) { //right top pile of barrels
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES IN THE MIDDLE//////////////////////////////////////////////

        if(picture.getX() == 1105 && picture.getMaxX() == 1157 && picture.getY() == 666 && picture.getMaxY() == 708) { //chest on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 767 && picture.getMaxX() == 819 && picture.getY() == 588 && picture.getMaxY() == 630) { //stone on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 481 && picture.getMaxX() == 533 && picture.getY() == 588 && picture.getMaxY() == 630) { //stone on the left
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 611 && picture.getMaxX() == 663 && picture.getY() == 588 && picture.getMaxY() == 630) { //top chest
            picture.translate(0, 0);
            return;
        }

        if(picture.getX() == 637 && picture.getMaxX() == 689 && picture.getY() == 666 && picture.getMaxY() == 708) { //center stone
            picture.translate(0, 0);
            return;
        }


        //OBSTACLES ON THE LEFT//////////////////////////////////////////////

        if(picture.getX() == 117 && picture.getMaxX() == 169 && picture.getY() == 536 && picture.getMaxY() == 578) { //left chest
            picture.translate(0, 0);
            return;
        }

        if(picture.getX() == 65 && picture.getMaxX() == 117 && picture.getY() == 354 && picture.getMaxY() == 396) { //pile of barrels
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 247 && picture.getMaxX() == 299 && picture.getY() == 94 && picture.getMaxY() == 136) { //top chest
            picture.translate(0, 0);
            return;
        }

        //MAP LIMITS/////////////////////////////////////////////////////////////////

        if(picture.getX() >= 481 && picture.getMaxX() <= 871 && picture.getY() > 562 && picture.getMaxY() <= 760 // ENTRANCE BOX
               || picture.getX() >= 819 && picture.getMaxX() <= 1183 && picture.getY() > 640 && picture.getMaxY() <= 760 // ENTRANCE RIGHT BOX
               || picture.getX() >= 793 && picture.getMaxX() <= 871 && picture.getY() > 68 && picture.getMaxY() <= 604 //  FIRST UP RIGHT BOX
               || picture.getX() >= 793 && picture.getMaxX() <= 1391 && picture.getY() > 68 && picture.getMaxY() <= 136 //  RIGHT TOP UP HORIZONTAL BOX
               || picture.getX() >= 1313 && picture.getMaxX() <= 1391 && picture.getY() > 94 && picture.getMaxY() <= 474 //  RIGHT TOP VERTICAL BOX
               || picture.getX() >= 819 && picture.getMaxX() <= 1391 && picture.getY() > 432 && picture.getMaxY() <= 500 //  FIRST HORIZONTAL BOX RIGHT
               || picture.getX() >= 1105 && picture.getMaxX() <= 1209 && picture.getY() > 250 && picture.getMaxY() <= 474 //  RIGHT CENTER VERTICAL BOX
               || picture.getX() >= 975 && picture.getMaxX() <= 1209 && picture.getY() > 250 && picture.getMaxY() <= 344 //  RIGHT CENTER VERTICAL BOX
               || picture.getX() >= 1287 && picture.getMaxX() <= 1391 && picture.getY() > 458 && picture.getMaxY() <= 760 //  RIGHT BOTTOM VERTICAL BOX
               || picture.getX() >= 65 && picture.getMaxX() <= 533 && picture.getY() > 666 && picture.getMaxY() <= 760 //  LEFT BOTTOM HORIZONTAL BOX
               || picture.getX() >= 65 && picture.getMaxX() <= 169 && picture.getY() > 68 && picture.getMaxY() <= 760 //  LEFT FIRST VERTICAL BOX
               || picture.getX() >= 65 && picture.getMaxX() <= 663 && picture.getY() > 68 && picture.getMaxY() <= 162 //  LEFT TOP HORIZONTAL BOX
               || picture.getX() >= 533 && picture.getMaxX() <= 663 && picture.getY() > 68 && picture.getMaxY() <= 448 //  LEFT RIGHT VERTICAL BOX
               || picture.getX() >= 325 && picture.getMaxX() <= 663 && picture.getY() > 354 && picture.getMaxY() <= 448){ //  LEFT CENTER HORIZONTAL BOX

            picture.translate(0, -26);
        }
        System.out.println(picture.getY());
    }
    public void moveRight() {
        //OBSTACLES ON THE RIGHT//////////////////////////////////////////////

        if(picture.getX() == 1027 && picture.getMaxX() == 1079 && picture.getY() == 250 && picture.getMaxY() == 292){ //right center chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 949 && picture.getMaxX() == 1001 && picture.getY() == 432 && picture.getMaxY() == 474){ //right center barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1313 && picture.getMaxX() == 1365 && picture.getY() == 640 && picture.getMaxY() == 682) { //right bottom chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 819 && picture.getMaxX() == 871 && picture.getY() == 68 && picture.getMaxY() == 110) { //right top barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1157 && picture.getMaxX() == 1209 && picture.getY() == 68 && picture.getMaxY() == 110) { //right top pile of barrels
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES IN THE MIDDLE//////////////////////////////////////////////
        if(picture.getX() == 1079 && picture.getMaxX() == 1131 && picture.getY() == 640 && picture.getMaxY() == 682) { //chest on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 741 && picture.getMaxX() == 793 && picture.getY() == 562 && picture.getMaxY() == 604) { //stone on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 585 && picture.getMaxX() == 637 && picture.getY() == 562 && picture.getMaxY() == 604) { //top chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 273 && picture.getMaxX() == 325 && picture.getY() == 718 && picture.getMaxY() == 760) { //pile of barrels on the left
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 611 && picture.getMaxX() == 663 && picture.getY() == 640 && picture.getMaxY() == 682) { //center stone
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES ON THE LEFT//////////////////////////////////////////////

        if(picture.getX() == 91 && picture.getMaxX() == 143 && picture.getY() == 510 && picture.getMaxY() == 552) { //left chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 221 && picture.getMaxX() == 273 && picture.getY() == 68 && picture.getMaxY() == 110) { //top chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 481 && picture.getMaxX() == 533 && picture.getY() == 406 && picture.getMaxY() == 448) { //center chest
            picture.translate(0, 0);
            return;
        }

        //MAP LIMITS/////////////////////////////////////////////////////////////////

        if(picture.getX() >= 481 && picture.getMaxX() < 871 && picture.getY() >= 562 && picture.getMaxY() <= 760 // ENTRANCE BOX
                || picture.getX() >= 819 && picture.getMaxX() < 1183 && picture.getY() >= 640 && picture.getMaxY() <= 760  // ENTRANCE RIGHT BOX
                || picture.getX() >= 793 && picture.getMaxX() < 871 && picture.getY() >= 68 && picture.getMaxY() <= 604  // FIRST UP RIGHT BOX
                || picture.getX() >= 793 && picture.getMaxX() < 1391 && picture.getY() >= 68 && picture.getMaxY() <= 136 //  RIGHT TOP UP HORIZONTAL BOX
                || picture.getX() >= 1313 && picture.getMaxX() < 1391 && picture.getY() >= 94 && picture.getMaxY() <= 474 //  RIGHT TOP VERTICAL BOX
                || picture.getX() >= 819 && picture.getMaxX() < 1391 && picture.getY() >= 432 && picture.getMaxY() <= 500 //  FIRST HORIZONTAL BOX RIGHT
                || picture.getX() >= 1105 && picture.getMaxX() < 1209 && picture.getY() >= 250 && picture.getMaxY() <= 474 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() >= 975 && picture.getMaxX() < 1209 && picture.getY() >= 250 && picture.getMaxY() <= 344 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() >= 1287 && picture.getMaxX() < 1391 && picture.getY() >= 458 && picture.getMaxY() <= 760 //  RIGHT BOTTOM VERTICAL BOX
                || picture.getX() >= 65 && picture.getMaxX() < 533 && picture.getY() >= 666 && picture.getMaxY() <= 760 //  LEFT BOTTOM HORIZONTAL BOX
                || picture.getX() >= 65 && picture.getMaxX() < 169 && picture.getY() >= 68 && picture.getMaxY() <= 760 //  LEFT FIRST VERTICAL BOX
                || picture.getX() >= 65 && picture.getMaxX() < 663 && picture.getY() >= 68 && picture.getMaxY() <= 162 //  LEFT TOP HORIZONTAL BOX
                || picture.getX() >= 533 && picture.getMaxX() < 663 && picture.getY() >= 68 && picture.getMaxY() <= 448 //  LEFT RIGHT VERTICAL BOX
                || picture.getX() >= 325 && picture.getMaxX() < 663 && picture.getY() >= 354 && picture.getMaxY() <= 448){ //  LEFT CENTER HORIZONTAL BOX

            picture.translate(26,0 );
        }
        System.out.println(picture.getMaxX());
    }
    public void moveDown() {
        //OBSTACLES ON THE RIGHT//////////////////////////////////////////////

        if(picture.getX() == 1339 && picture.getMaxX() == 1391 && picture.getY() == 614 && picture.getMaxY() == 656) { //right bottom chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 793 && picture.getMaxX() == 845 && picture.getY() == 328 && picture.getMaxY() == 370) { //right box pile
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES IN THE MIDDLE//////////////////////////////////////////////

        if(picture.getX() == 299 && picture.getMaxX() == 351 && picture.getY() == 692 && picture.getMaxY() == 734) { //pile of barrels on the left
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES ON THE LEFT//////////////////////////////////////////////

        if(picture.getX() == 117 && picture.getMaxX() == 169 && picture.getY() == 484 && picture.getMaxY() == 526) { //left chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 65 && picture.getMaxX() == 117 && picture.getY() == 302 && picture.getMaxY() == 344) { //left chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 507 && picture.getMaxX() == 559 && picture.getY() == 380 && picture.getMaxY() == 422) { //center chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 637 && picture.getMaxX() == 689 && picture.getY() == 614 && picture.getMaxY() == 656) { //center stone
            picture.translate(0, 0);
            return;
        }

        //MAP LIMITS/////////////////////////////////////////////////////////////////

        if(picture.getX() >= 481 && picture.getMaxX() <= 871 && picture.getY() >= 562 && picture.getMaxY() < 760 // ENTRANCE BOX
                || picture.getX() >= 819 && picture.getMaxX() <= 1183 && picture.getY() >= 640 && picture.getMaxY() < 760 // ENTRANCE RIGHT BOX
                || picture.getX() >= 793 && picture.getMaxX() <= 871 && picture.getY() >= 68 && picture.getMaxY() < 604 // FIRST UP RIGHT BOX
                || picture.getX() >= 793 && picture.getMaxX() <= 1391 && picture.getY() >= 68 && picture.getMaxY() < 136 //  RIGHT TOP UP HORIZONTAL BOX
                || picture.getX() >= 1313 && picture.getMaxX() <= 1391 && picture.getY() >= 94 && picture.getMaxY() < 474 //  RIGHT TOP VERTICAL BOX
                || picture.getX() >= 819 && picture.getMaxX() <= 1391 && picture.getY() >= 432 && picture.getMaxY() < 500 //  FIRST HORIZONTAL BOX RIGHT
                || picture.getX() >= 1105 && picture.getMaxX() <= 1209 && picture.getY() >= 250 && picture.getMaxY() < 474 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() >= 975 && picture.getMaxX() <= 1209 && picture.getY() >= 250 && picture.getMaxY() < 344 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() >= 1287 && picture.getMaxX() <= 1391 && picture.getY() >= 458 && picture.getMaxY() < 760 //  RIGHT BOTTOM VERTICAL BOX
                || picture.getX() >= 65 && picture.getMaxX() <= 533 && picture.getY() >= 666 && picture.getMaxY() < 760 //  LEFT BOTTOM HORIZONTAL BOX
                || picture.getX() >= 65 && picture.getMaxX() <= 169 && picture.getY() >= 68 && picture.getMaxY() < 760 // LEFT FIRST VERTICAL BOX
                || picture.getX() >= 65 && picture.getMaxX() <= 663 && picture.getY() >= 68 && picture.getMaxY() < 162 //  LEFT TOP HORIZONTAL BOX
                || picture.getX() >= 533 && picture.getMaxX() <= 663 && picture.getY() >= 68 && picture.getMaxY() < 448 //  LEFT RIGHT VERTICAL BOX
                || picture.getX() >= 325 && picture.getMaxX() <= 663 && picture.getY() >= 354 && picture.getMaxY() < 448){ //  LEFT CENTER HORIZONTAL BOX

            picture.translate(0, 26);
        }
        System.out.println(picture.getMaxY());
    }
    public void moveLeft() {

        //OBSTACLES ON THE RIGHT//////////////////////////////////////////////

        if(picture.getX() == 1079 && picture.getMaxX() == 1131 && picture.getY() == 250 && picture.getMaxY() == 292){ //right center chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1001 && picture.getMaxX() == 1053 && picture.getY() == 432 && picture.getMaxY() == 474){ //right center barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 819 && picture.getMaxX() == 871 && picture.getY() == 354 && picture.getMaxY() == 396) { //right box pile
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 871 && picture.getMaxX() == 923 && picture.getY() == 68 && picture.getMaxY() == 110) { //right top barrel
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 1235 && picture.getMaxX() == 1287 && picture.getY() == 68 && picture.getMaxY() == 110) { //right top pile of barrels
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES IN THE MIDDLE//////////////////////////////////////////////

        if(picture.getX() == 1131 && picture.getMaxX() == 1183 && picture.getY() == 640 && picture.getMaxY() == 682) { //chest on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 793 && picture.getMaxX() == 845 && picture.getY() == 562 && picture.getMaxY() == 604) { //stone on the right
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 507 && picture.getMaxX() == 559 && picture.getY() == 562 && picture.getMaxY() == 604) { //stone on the left
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 637 && picture.getMaxX() == 689 && picture.getY() == 562 && picture.getMaxY() == 604) { //top chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 325 && picture.getMaxX() == 377 && picture.getY() == 718 && picture.getMaxY() == 760) { //pile of barrels on the left
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 663 && picture.getMaxX() == 715 && picture.getY() == 640 && picture.getMaxY() == 682) { //center stone
            picture.translate(0, 0);
            return;
        }

        //OBSTACLES ON THE LEFT//////////////////////////////////////////////

        if(picture.getX() == 91 && picture.getMaxX() == 143 && picture.getY() == 328 && picture.getMaxY() == 370) { //pile of barrels
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 273 && picture.getMaxX() == 325 && picture.getY() == 68 && picture.getMaxY() == 110) { //top chest
            picture.translate(0, 0);
            return;
        }
        if(picture.getX() == 533 && picture.getMaxX() == 585 && picture.getY() == 406 && picture.getMaxY() == 448) { //center chest
            picture.translate(0, 0);
            return;
        }

        //MAP LIMITS/////////////////////////////////////////////////////////////////

        if(picture.getX() > 481 && picture.getMaxX() <= 871 && picture.getY() >= 562 && picture.getMaxY() <= 760 // ENTRANCE BOX
                || picture.getX() > 819 && picture.getMaxX() <= 1183 && picture.getY() >= 640 && picture.getMaxY() <= 760 // ENTRANCE RIGHT BOX
                || picture.getX() > 793 && picture.getMaxX() <= 871 && picture.getY() >= 68 && picture.getMaxY() <= 604 // FIRST UP RIGHT BOX
                || picture.getX() > 793 && picture.getMaxX() <= 1391 && picture.getY() >= 68 && picture.getMaxY() <= 136 //  RIGHT TOP UP HORIZONTAL BOX
                || picture.getX() > 1313 && picture.getMaxX() <= 1391 && picture.getY() >= 94 && picture.getMaxY() <= 474 //  RIGHT TOP VERTICAL BOX
                || picture.getX() > 819 && picture.getMaxX() <= 1391 && picture.getY() >= 432 && picture.getMaxY() <= 500 //  FIRST HORIZONTAL BOX RIGHT
                || picture.getX() > 1105 && picture.getMaxX() <= 1209 && picture.getY() >= 250 && picture.getMaxY() <= 474 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() > 975 && picture.getMaxX() <= 1209 && picture.getY() >= 250 && picture.getMaxY() <= 344 //  RIGHT CENTER VERTICAL BOX
                || picture.getX() > 1287 && picture.getMaxX() <= 1391 && picture.getY() >= 458 && picture.getMaxY() <= 760 //  RIGHT BOTTOM VERTICAL BOX
                || picture.getX() > 65 && picture.getMaxX() <= 533 && picture.getY() >= 666 && picture.getMaxY() <= 760 //  LEFT BOTTOM HORIZONTAL BOX
                || picture.getX() > 65 && picture.getMaxX() <= 169 && picture.getY() >= 68 && picture.getMaxY() <= 760 //  LEFT FIRST VERTICAL BOX
                || picture.getX() > 65 && picture.getMaxX() <= 663 && picture.getY() >= 68 && picture.getMaxY() <= 162 //  LEFT TOP HORIZONTAL BOX
                || picture.getX() > 533 && picture.getMaxX() <= 663 && picture.getY() >= 68 && picture.getMaxY() <= 448 //  LEFT RIGHT VERTICAL BOX
                || picture.getX() > 325 && picture.getMaxX() <= 663 && picture.getY() >= 354 && picture.getMaxY() <= 448){ //  LEFT CENTER HORIZONTAL BOX


                picture.translate(-26,0 );


        }
        System.out.println(picture.getX());
    }


    public void getPosition(){
        System.out.println("Left: " + picture.getX());
        System.out.println("Right: " +picture.getMaxX());
        System.out.println("Top " +picture.getY());
        System.out.println("Bottom: " +picture.getMaxY());
    }
    public void load(String path){
        picture.load(path);
    }

    public int getLeft(){
        return picture.getX();
    }
    public int getRight(){
        return picture.getMaxX();
    }
    public int getTop(){
        return picture.getY();
    }
    public int getBottom(){
        return picture.getMaxY();
    }

    public void changePictureDown() {
        if (x < 3) {
            picture.load(getDownArr()[x]);
            x++;
        } else {
            x = 0;
        }
    }
    public void changePictureUP() {
        if (x < 3) {
            picture.load(getUpArr()[x]);
            x++;
        } else {
            x = 0;
        }
    }
    public void changePictureLeft() {
        if (x < 3) {
            picture.load(getLeftArr()[x]);
            x++;
        } else {
            x = 0;
        }
    }
    public void changePictureRight() {
        if (x < 3) {
            picture.load(getRightArr()[x]);
            x++;
        } else {
            x = 0;
        }
    }

}
