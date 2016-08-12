package org.androidforfun.droids.model;

/*
 This is a S shape.
 */
public class ShapeS extends Shape {
    public ShapeS() {
        super();
        rotation_block = blocks[1];
        rotation_cycle = 2;
    }

    // The x,y position of each block is adjusted according to
    // the shape position and size. The adjust is first applied
    // assuming the shape is its first position. Then it is rotated.
    // The color is green.
    public Block[] getBlocks() {
        blocks[0].setX(x + 2);
        blocks[0].setY(y);
        blocks[1].setX(x + 1);
        blocks[1].setY(y);
        blocks[2].setX(x + 1);
        blocks[2].setY(y + 1);
        blocks[3].setX(x);
        blocks[3].setY(y + 1);

        apply_rotation();

        for (Block block : blocks) {
            block.setColor(0xff00ff00);
        }
        return blocks;
    }
}